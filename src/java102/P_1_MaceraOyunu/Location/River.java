package java102.P_1_MaceraOyunu.Location;

import java102.P_1_MaceraOyunu.Characters.Bear;
import java102.P_1_MaceraOyunu.Characters.Obstacle;
import java102.P_1_MaceraOyunu.Player;

public class River extends BattleLocation {


    River(Player player, String locationName ) {
        super(player, locationName, player.getInventory().getWater(),2);
        /// Nehir de odul su


    }
    @Override
    public void implementListObstacle(Obstacle[] listObstacle) {
        for (int i = 0; i < listObstacle.length; i++) {
            listObstacle[i] = new Bear();
        }
    }

    @Override
    public void lootTaking() {
        /// Bear().getMoney() kadar para kazandiniz
        System.out.println(new Bear().getMoney() + "  para kazandiniz");
        int ganimet = getPlayer().getCharacter().getMoney() + new Bear().getMoney();
        getPlayer().getCharacter().setMoney(ganimet);
    }

    @Override
    public boolean onLocation() {
        //super.giris();
        return super.onLocation();
    }


}
