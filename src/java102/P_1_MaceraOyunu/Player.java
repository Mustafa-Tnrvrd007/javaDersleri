package java102.P_1_MaceraOyunu;

import java102.P_1_MaceraOyunu.Characters.Character;

public class Player {

    private String name;
    private Character character;
    private Inventory inventory = new Inventory();

    Player(String name, Character character) {
        setCharacter(character);
        setName(name);
    }

    public void printPlayerInformation() {
        System.out.println("\nOyuncu Ismi : " + this.getName() +
                "\nKarakter ismi : " + this.getCharacter().getName() +
                "\nKarakter hasari : " +
                (this.getCharacter().getDamage() + this.getInventory().getWeapon().getDamageOrDefence()) +
                "\nKarakter cani : " + this.getCharacter().getHealth() +
                "\nMoney : " + this.getCharacter().getMoney());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
