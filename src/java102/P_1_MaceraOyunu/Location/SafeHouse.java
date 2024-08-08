package java102.P_1_MaceraOyunu.Location;

import java102.P_1_MaceraOyunu.Player;

public class SafeHouse extends Location{
    SafeHouse(Player player, String locationName){
        super(player,locationName);

    }
    @Override
    public boolean onLocation(){
        getPlayer().getCharacter().setHealth(getPlayer().getCharacter().characterRealHealth);
        System.out.println("\nSu anda Guvenli Evdesiniz \nCanininz Yenilendi\n");
        getPlayer().getCharacter().characterInfo();
        boolean awards1 , awards2 ,awards3;
        awards1 = getPlayer().getInventory().getWater().getAwardBool();
        awards2 = getPlayer().getInventory().getFirewood().getAwardBool();
        awards3 = getPlayer().getInventory().getFood().getAwardBool();

        if(awards1 && awards2 && awards3){
            /// You Win !!!!!!
            System.out.println("Tebrikler Oyunu Kazandiniz ");
            return false;
        }

        return true;
    }
}
