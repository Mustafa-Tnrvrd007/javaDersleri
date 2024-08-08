package java102.P_1_MaceraOyunu.Location;


import java102.P_1_MaceraOyunu.Characters.Obstacle;
import java102.P_1_MaceraOyunu.Characters.Vampire;
import java102.P_1_MaceraOyunu.Player;

public class Forest extends BattleLocation{



    Forest(Player player , String locationName ){
        super(player, locationName,player.getInventory().getFirewood() ,3);
        // ormanda odul odun
        ///obstacle.obstacleNumber(3);

    }

    @Override
    public boolean onLocation() {

        return super.onLocation();
    }
    @Override
    public void implementListObstacle(Obstacle[] listObstacle) {
        for (int i = 0; i < listObstacle.length; i++) {
            listObstacle[i] = new Vampire();
        }
    }

    @Override
    public void lootTaking() {
        /// Vampire().getMoney() kadar para kazandiniz
        System.out.println(new Vampire().getMoney()+"  para kazandiniz");
        int ganimet = getPlayer().getCharacter().getMoney()+ new Vampire().getMoney();
        getPlayer().getCharacter().setMoney(ganimet);
    }




}
