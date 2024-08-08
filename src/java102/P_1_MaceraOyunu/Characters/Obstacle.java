package java102.P_1_MaceraOyunu.Characters;

import java.util.Random;

public abstract class Obstacle extends Character { /// monster


    Obstacle(int id, String name, int damage, int health, int money) {
        super(id, name, damage, health, money);
        super.setISGood(false);

    }

    public void printObstacleInfo() {
        System.out.println("\n-----------------------------------");
        System.out.println(getName() + " Bilgisi : \n");
        System.out.print("Can : " + getHealth() +
                "\tHasar : " + getDamage() +
                "\tGanimet : " + getMoney() );
        System.out.println();
    }




}
