package java102.P_1_MaceraOyunu.Characters;

import java102.P_1_MaceraOyunu.Player;

public abstract class Character { /// abstract class
    public final int characterRealHealth;
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;
    private boolean isGood;

    public Character(int id, String name, int damage, int health, int money) {
        setId(id);
        setName(name);
        setDamage(damage);
        setHealth(health);
        setMoney(money);
        characterRealHealth = getHealth();

    }

    public void characterInfo() {
        System.out.println(
                getId() + "\t" +
                        getName() +
                        "\t\tdamage : " + getDamage() +
                        "\thealth : " + getHealth() +
                        "\tmoney : " + getMoney());
    }

    public void printCharacterInformation(Character character, Player player) {
        System.out.println("\n-----------------------------------");
        System.out.println(character.getName() + " Bilgisi : \n");
        System.out.print("Can : " + character.getHealth() +
                "\tHasar : " + character.getDamage() +
                "\tSilah : " + player.getInventory().getWeapon().getName() +
                "\tSilah hasari : + " + player.getInventory().getWeapon().getDamageOrDefence() +
                "\tZirh : " + player.getInventory().getArmor().getName() +
                "\tZirh savunmasi : " + player.getInventory().getArmor().getDamageOrDefence());
        System.out.println();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage >= 0) {
            this.damage = damage;
        } else {
            System.out.println("Hasar 0'dan kucuk olamaz");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<=0){
            this.health =0;
        }else {
            this.health = health;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money >= 0) {
            this.money = money;
        } else {
            System.out.println("Para 0'dan kucuk olamaz");
        }
    }

    public boolean isGood() {
        return isGood;
    }

    public void setISGood(boolean good) {
        isGood = good;
    }


}
