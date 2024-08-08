package java102.P_1_MaceraOyunu.Location;


import java102.P_1_MaceraOyunu.Player;

import static java102.P_1_MaceraOyunu.Game.input;

public class ChoiceLocation {
    private Location location;
    private int choice;
    private Player player;

    private Location safeHouse;
    private Location toolStore;
    public Location river;
    public Location forest;
    public Location cave;
    public Location mine;



    public ChoiceLocation(Player player) {
        setPlayer(player);


        setSafeHouse(new SafeHouse(getPlayer(), "Guvenli Ev"));
        setToolStore(new ToolStore(getPlayer(), "Esya Dukkani"));
        river = new River(getPlayer(), "Nehir");
        forest = new Forest(getPlayer(), "Orman");
        cave = new Cave(getPlayer(), "Magra");
        mine = new Mine(getPlayer(),"Maden Ocagi");


    }

    public Location choiceLocation() {

        do {
            System.out.println("\n\n\n");
            System.out.println("Gidecegin Bolgeyi Sec : ");
            System.out.println("0 - Cikis \t Oyunu Bitir ");
            System.out.println("1 - " + getSafeHouse().getLocationName());
            System.out.println("2 - " + getToolStore().getLocationName());
            System.out.println("3 - " + river.getLocationName() + "\t (odul : su) ");
            System.out.println("4 - " + forest.getLocationName() + "\t (odul : odun) ");
            System.out.println("5 - " + cave.getLocationName() + "\t (odul : yemek) ");
            System.out.println("6 - " + mine.getLocationName() + "\t (rasstgele hediye) ");

            selectLocation();

            if (getChoice()>=7 || getChoice()<0){
                setLocation(new Location(getPlayer(),"Null Location") {
                    @Override
                    public boolean onLocation() {
                        return true;
                    }
                });
                continue;
            }

            // getLocation().onLocation();///// secilen bolgeye gider
            // getLocation().onLocation()

            input.nextLine();//////
        } while (getLocation().onLocation() );// getChoice() != 0



        return getLocation();

    }
    public void gameOver(){
        /// cikis
        // onLocation 'u false olan bi nesne yaratıp locationa attık
        // boylece Game sınıfı içindeki dongu kosulunu bozduk
        setLocation(new Location(getPlayer(), "Araf") {
            @Override
            public boolean onLocation() {
                return false;
            }
        });
    }
    public void selectLocation(){
        setChoice(input.nextInt());

        switch (getChoice()) {
            case 0:

                gameOver();
                System.out.println("Game Over \nErken Kactin");
                break;
            case 1:
                setLocation(getSafeHouse());

                break;
            case 2:
                setLocation(getToolStore());

                break;
            case 3:
                setLocation(river);

                break;
            case 4:
                setLocation(forest);

                break;
            case 5:
                setLocation(cave);

                break;
            case 6:
                setLocation(mine);
                break;
            default:
//                    System.out.println("Bir seyler ters gitti");
                break;

        }
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getSafeHouse() {
        return safeHouse;
    }

    public void setSafeHouse(Location safeHouse) {
        this.safeHouse = safeHouse;
    }

    public Location getToolStore() {
        return toolStore;
    }

    public void setToolStore(Location toolStore) {
        this.toolStore = toolStore;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        if (choice >= 0 && choice < 7) {
            this.choice = choice;
        } else {
            System.out.println("Hatali Konum Sectiniz \nTekrar konum girin");
            this.choice = -1;
        }

    }
}
