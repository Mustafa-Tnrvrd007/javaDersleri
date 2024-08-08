package java102.P_1_MaceraOyunu.Location;

import java102.P_1_MaceraOyunu.Awards;
import java102.P_1_MaceraOyunu.Characters.Obstacle;
import java102.P_1_MaceraOyunu.Player;

import java.util.Random;

import static java102.P_1_MaceraOyunu.Game.input;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    public Obstacle[] listObstacle;
    private Awards award;
    public int numberMonster;
    public int max;

    BattleLocation(Player player, String locationName, Awards award,  int max) {
        super(player, locationName);
//        setObstacle(obstacle);
        setAward(award);
        this.max = max;
        this.numberMonster = randomNummber(max);/////////
        this.listObstacle = new Obstacle[numberMonster];
        implementListObstacle(this.listObstacle);
        setObstacle(listObstacle[numberMonster-1]);



    }
    public abstract void implementListObstacle(Obstacle[] listObstacle) ;
    public abstract void lootTaking();

    private int randomNummber(int max) {
        Random random = new Random(); //random sınıfı

        return (random.nextInt(max) + 1); // 1 , 2 ,3
    }


    @Override
    public boolean onLocation() {

        return giris();
    }


    public boolean giris() { /// giris kismi onlocation
        if (getPlayer().getCharacter().getHealth() > 0 && numberMonster > 0) {
            //// karakterin cani > 0 ve canavar sayisi > 0 ise

            System.out.println("Su anda bulundugunuz konum :  " + super.getLocationName() +
                    "  Dikkatli olun burda " + numberMonster + "  tane " +
                    getObstacle().getName() + " var.");

            if (choseFight() && getPlayer().getCharacter().getHealth() > 0) {
                // savasmayı secmis ve karakterin cani > 0 ise
                return combat(getPlayer(), getObstacle());
            } else {
                System.out.println("Kacma'yi sectiniz");
                return true;
            }


        } else if (getPlayer().getCharacter().getHealth() <= 0) {
            System.out.println("Game over ###########");
            /// getLocation false donmeli
            return false;
        } else {
            // bolge temiz
            System.out.println(getLocationName() + " temiz hic canavar yok burasi artik guvenli");

            return true;
        }


    }

    public boolean choseFight() {
        boolean dongu = true, isFight = false;
        do {
            System.out.println("Savaşmak için <S> Kaçmak için <K> harfini girin");
            String choiceStr = input.nextLine();
            choiceStr = choiceStr.toUpperCase(); /// girilen harfi buyuk haline cevirir

            switch (choiceStr) {
                case "S":  ////// Savaş
                    isFight = true;
                    dongu = false;
                    break;

                case "K": //////// Kaçiş
                    dongu = false;
                    break;

                default:
                    System.out.println("Yanlis karakter girdiniz sadece " +
                            "s veya k harflerinden birini girmeniz gerek");
                    break;
            }
        } while (dongu);

        return isFight;
    }


    public boolean combat(Player player, Obstacle obstacle) { /// fight
        getPlayer().getCharacter().printCharacterInformation(getPlayer().getCharacter(),getPlayer()); // karakter bilgisi

        obstacle.printObstacleInfo(); // canavar bilgisi

        boolean fight = true, first = firstAttack();

        while (getPlayer().getCharacter().getHealth() > 0 && this.numberMonster > 0) {
            /// karakterin cani > 0 ve canavarin sayisi > 0

            if (first) { /// ilk saldiri rastgele
                characterAttack();
                if (getObstacle().getHealth() > 0) {
                    obstacleAttack();
                }
            } else {
                obstacleAttack();
                if (getPlayer().getCharacter().getHealth() > 0) {
                    characterAttack();
                }
            }

            if (getObstacle().getHealth() <= 0) { /// canavarın olme durumu
                // obsNumber--;
                this.numberMonster--; // canavar sayisi 1 azaldi

                System.out.println("\nTebrikler bir tane " + getObstacle().getName() + " oldurdunuz \n" +
                        this.numberMonster + " tane " + getObstacle().getName() + " kaldi");

                lootTaking(); ////// canavar oldurunce ganimet alma durumu

                if (this.numberMonster > 0) { /// canavar sayisi > 0 ise
                    setObstacle(this.listObstacle[this.numberMonster - 1]);
                    System.out.println("\n##################");

                } else {
                    /// tebrikler locationName temizlendi odulu alabilir siniz
                    getAward().setAwardBool(true);
                    awardImplement();
                    break;
                }

            } else if (getPlayer().getCharacter().getHealth() <= 0) {
                System.out.println("Game Over \n##################");
                fight = false;
                break;
            }

            if (!choseFight()) { //Vur veya kac ------------------
                break;
            }
        }
        return fight;
    }

    public void characterAttack() {
        int kalanCan;
        System.out.println("\n" + getPlayer().getCharacter().getName() + " saldiriyor... ");
        kalanCan = getObstacle().getHealth() - characterDamage(getPlayer());
        getObstacle().setHealth(kalanCan);
        getObstacle().printObstacleInfo();
    }


    public void obstacleAttack() {
        int kalanCan;
        System.out.println("\n" + getObstacle().getName() + " saldiriyor... ");
        kalanCan = getPlayer().getCharacter().getHealth() - monsterDamage(getPlayer(), getObstacle());
        getPlayer().getCharacter().setHealth(kalanCan);
        getPlayer().getCharacter().printCharacterInformation(getPlayer().getCharacter(),getPlayer());
    }

    public boolean firstAttack() {
        int random = (int) (Math.random() * 10) % 2;
        if (random == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void awardImplement() {
        for (int i = 0; i < getPlayer().getInventory().listAwards.length; i++) {
            if (getPlayer().getInventory().listAwards[i].getName().equals(getAward().getName())) {
                getPlayer().getInventory().listAwards[i].setAwardBool(getAward().getAwardBool());
                System.out.println(getPlayer().getInventory().listAwards[i].getName() +
                        " Ödülünü kazandiniz : " +
                        getPlayer().getInventory().listAwards[i].getAwardBool());
            }
        }
    }

    public int characterDamage(Player player) {
        int karakterHasari =
                getPlayer().getCharacter().getDamage() + getPlayer().getInventory().getWeapon().getDamageOrDefence();
        return karakterHasari;
    }

    public int monsterDamage(Player player, Obstacle obstacle) {

        int canavarHasari = obstacle.getDamage() - player.getInventory().getArmor().getDamageOrDefence();
        if (canavarHasari > 0) {
            return canavarHasari;
        } else {
            return 0;
        }

    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public Awards getAward() {
        return this.award;
    }

    public void setAward(Awards award) {
        this.award = award;
    }


}
