package java102.P_1_MaceraOyunu.Location;


import java102.P_1_MaceraOyunu.Characters.Obstacle;
import java102.P_1_MaceraOyunu.Characters.Zombie;
import java102.P_1_MaceraOyunu.Player;

public class Cave extends BattleLocation{

    public Zombie zombie;

    Cave(Player player, String locationName){
        super(player, locationName , player.getInventory().getFood(),4);
        // magrada odul yemek


    }

    @Override
    public void implementListObstacle(Obstacle[] listObstacle) {
        for (int i = 0; i < listObstacle.length; i++) {
            listObstacle[i] = new Zombie();
        }
    }

    @Override
    public boolean onLocation() {
        //super.giris(); // karsilama


        return super.onLocation();
    }

    @Override
    public void lootTaking() {
        /// Zombie().getMoney() kadar para kazandiniz
        System.out.println(new Zombie().getMoney()+"  para kazandiniz");
        int ganimet = getPlayer().getCharacter().getMoney()+ new Zombie().getMoney();
        getPlayer().getCharacter().setMoney(ganimet);
    }



}
