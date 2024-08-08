package java102.P_1_MaceraOyunu;

import java102.P_1_MaceraOyunu.Characters.*;
import java102.P_1_MaceraOyunu.Characters.Character;
import java102.P_1_MaceraOyunu.Location.ChoiceLocation;
import java102.P_1_MaceraOyunu.Location.Location;

import java.util.Scanner;

public class Game {
    public static Scanner input = new Scanner(System.in);


    private Character character;
    private Player player;
    public Location location;
    public String name;
    public ChoiceCharacter choiceCharacter = new ChoiceCharacter();
    public ChoiceLocation choiceLocation;

    public void start() {

        System.out.println("Macera Oyununa Hos Geldiniz !!!");
        System.out.print("Lutfen Bir Kullanici Adi Giriniz : ");
        name = input.nextLine();

        setCharacter(choiceCharacter.choiceCharacter()); /// karakter secimi

        setPlayer(new Player(name, character)); /// oyuncu olusturulması

        System.out.println("\nOyuncu Profili Basari ile Olusturuldu");
        player.printPlayerInformation();
        choiceLocation = new ChoiceLocation(getPlayer());/////////


        do {
            location = choiceLocation.choiceLocation(); // gidilecek bölge secimi
            /// location.onLocation(); //////////////???????????????

        } while (location.onLocation()); /// location.onLocation()

    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
