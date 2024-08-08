package java102.P_1_MaceraOyunu.Characters;

import static java102.P_1_MaceraOyunu.Game.input;

public class ChoiceCharacter {


    private Character samuray = new Samuray();
    private Character archer = new Archer();
    private Character knight = new Knight();

    private Character mainCharacter;
    private int choice;


    public Character choiceCharacter() {

        do {
            System.out.println("\n\n\n");
            System.out.println("Tekrardan Hos Geldiniz \n Karakterini sec : ");
            getSamuray().characterInfo();
            getArcher().characterInfo();
            getKnight().characterInfo();

            setChoice(input.nextInt());

            if (getChoice() != 0) {


                switch (getChoice()) {
                    case 1:
                        setMainCharacter(getSamuray());
                        break;
                    case 2:
                        setMainCharacter(getArcher());
                        break;
                    case 3:
                        setMainCharacter(getKnight());
                        break;
                }

                System.out.println("Karakter tercihi basarili \t secilen karakter : ");
                getMainCharacter().characterInfo();

                break;

            } else {

                System.out.println("Secim Sirasinda bi hata meydana geldi\n ");
            }

        } while (true);

        return getMainCharacter();

    }


    public void setSamuray(Character samuray) {
        this.samuray = samuray;
    }

    public Character getSamuray() {
        return samuray;
    }

    public void setArcher(Character archer) {
        this.archer = archer;
    }

    public Character getArcher() {
        return archer;
    }

    public void setKnight(Character knight) {
        this.knight = knight;
    }

    public Character getKnight() {
        return knight;
    }

    public Character getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(Character mainCharacter) {
        this.mainCharacter = mainCharacter;
    }


    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        if (choice < 4 && choice > 0) {
            this.choice = choice;

        } else {
            this.choice = 0;
        }
    }
}
