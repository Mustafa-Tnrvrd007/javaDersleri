package java102.P_1_MaceraOyunu.Location;

import java102.P_1_MaceraOyunu.Awards;
import java102.P_1_MaceraOyunu.Characters.Obstacle;
import java102.P_1_MaceraOyunu.Characters.Snake;
import java102.P_1_MaceraOyunu.ItemsForSale.Armor;
import java102.P_1_MaceraOyunu.ItemsForSale.Items;
import java102.P_1_MaceraOyunu.ItemsForSale.SalesItems;
import java102.P_1_MaceraOyunu.ItemsForSale.Weapon;
import java102.P_1_MaceraOyunu.Player;

import java.util.Random;

public class Mine extends BattleLocation {
    // Awards nullAward = ;

    Mine(Player player, String locationName) {

        super(player, locationName, new Awards("Null", false), 5);


    }

    @Override
    public boolean onLocation() {

        return super.onLocation();
    }

    @Override
    public void implementListObstacle(Obstacle[] listObstacle) {
        for (int i = 0; i < listObstacle.length; i++) {
            listObstacle[i] = new Snake();
        }
    }

    @Override
    public void lootTaking() {
        /// % 15 silah
        /// % 15 zirh
        /// % 25 para
        Random random = new Random(); //random sınıfı
        int sansSayisi = random.nextInt(100) + 1;// 1 ile 100 arası
        System.out.println("Sans carki numaran = " + sansSayisi);
        int silah, zirh, para;
        if (sansSayisi <= 15) {
            // rastegele silah verecek 
            // karakterdeki silah daha pahalıysa vermeyecek
            System.out.println("Silah kazanma ihtimalin var");
            silahKazanma();

        } else if (sansSayisi <= 30) {
            // rastgele zirh verecek
            // eger karakterin zirhi daha pahaliysa vermeyecek
            System.out.println("Zirh kazanma ihtimalin var");
            zirhKazanma();


        } else if (sansSayisi <= 55) {
            // rastgele para verecek
            System.out.println("Sansina göre para kazanacaksin");
            paraKazanma();

        } else {
            System.out.println("Kotu sans hicbirsey kazanamadin");
        }
    }

    public Items itemSans(Items[] items) {
        /// silah veya zirh  zirh
        // ucuz item %50 , orta item %30 , pahali item %20
        Random random = new Random();
        int itemSansi = random.nextInt(100) + 1;
        System.out.println("\n\nItem kazanma sansi : " + itemSansi);
        int itemSirasi;
        if (itemSansi <= 20) {
            itemSirasi = 2;
            return items[itemSirasi];
        } else if (itemSansi <= 50) {
            itemSirasi = 1;
            return items[itemSirasi];
        } else {
            itemSirasi = 0;
            return items[itemSirasi];
        }
    }

    public void silahKazanma() {
        // rastegele silah verecek
        // karakterdeki silah daha pahalıysa vermeyecek
        Weapon dusenSilah = (Weapon) itemSans(SalesItems.weaponry);

        int karakterdekiSilahHasari = super.getPlayer().getInventory().getWeapon().getDamageOrDefence();

        if (dusenSilah.getDamageOrDefence() > karakterdekiSilahHasari) {
            System.out.println("Tebrikler daha artik daha iyi bi silaha sahipsiniz");
            System.out.println("Eski silah : " + super.getPlayer().getInventory().getWeapon().getName() +
                    "\thasari : " + karakterdekiSilahHasari +
                    "\tdegeri : " + super.getPlayer().getInventory().getWeapon().getMoney());
            super.getPlayer().getInventory().setWeapon(dusenSilah);
            System.out.println("Yeni silahiniz : " + dusenSilah.getName() +
                    "\thasari : " + dusenSilah.getDamageOrDefence() +
                    "\tdegeri : " + dusenSilah.getMoney());

        }else {
            System.out.println("Cikan silah sendekinden daha kotu");
        }

    }

    public void zirhKazanma() {

        Armor dusenZirh = (Armor) itemSans(SalesItems.armors);

        int karakterdekiZirhSavunmasi = super.getPlayer().getInventory().getArmor().getDamageOrDefence();

        if (dusenZirh.getDamageOrDefence() > karakterdekiZirhSavunmasi) {
            System.out.println("Tebrikler daha artik daha iyi bi zirha sahipsiniz");
            System.out.println("Eski zirh : " + super.getPlayer().getInventory().getArmor().getName() +
                    "\tsavunma : " + karakterdekiZirhSavunmasi +
                    "\tdegeri : " + super.getPlayer().getInventory().getArmor().getMoney());

            super.getPlayer().getInventory().setArmor(dusenZirh);

            System.out.println("Yeni silahiniz : " + super.getPlayer().getInventory().getArmor().getName() +
                    "\thasari : " + super.getPlayer().getInventory().getArmor().getDamageOrDefence() +
                    "\tdegeri : " + super.getPlayer().getInventory().getArmor().getMoney());

        }else {
            System.out.println("Cikan zirh sendekinden daha kotu");
        }
    }

    public void paraKazanma() {
        // %50 ihtimalle 1 altin % 30 ihtimalle 5 altin %20 ihtimalle 10 altin
        Random random = new Random();
        int sans = random.nextInt(100) + 1;
        int para = super.getPlayer().getCharacter().getMoney();
        if (sans <= 20) {
            // 10 para kazanma ihtimali
            para += 10;
            super.getPlayer().getCharacter().setMoney(para);
            System.out.println("10 para kazandin");
        } else if (sans <= 50) {
            // 5 para kazanma
            para += 5;
            super.getPlayer().getCharacter().setMoney(para);
            System.out.println("5 para kazandin");

        } else {
            para++;
            super.getPlayer().getCharacter().setMoney(para);
            System.out.println("1 para kazandin");

        }
    }

}
