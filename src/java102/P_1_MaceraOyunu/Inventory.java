package java102.P_1_MaceraOyunu;

import java102.P_1_MaceraOyunu.ItemsForSale.Armor;
import java102.P_1_MaceraOyunu.ItemsForSale.Items;
import java102.P_1_MaceraOyunu.ItemsForSale.Weapon;

public class Inventory {


    private Awards water = new Awards("Su", false);
    private Awards food = new Awards("Yemek", false);
    private Awards firewood = new Awards("Odun", false);
    public  Awards[] listAwards= {water ,food,firewood};

    private Items weapon;
    private Items armor;

    Inventory() {
        weapon = new Weapon(0, "Yumruk", 0, 0);
        armor = new Armor(0, "Bambu Yapragi", 0, 0);

    }

    public Awards getWater (){
        return this.water;
    }
    public void setWater(Awards water ){
        this.water = water;
    }

    public Awards getFood (){
        return this.food;
    }
    public void setFood(Awards food ){
        this.food=food;
    }

    public Awards getFirewood (){
        return this.firewood;
    }
    public void setFirewood (Awards firewood){
        this.firewood = firewood;
    }

    public Items getWeapon() {
        return weapon;
    }

    public void setWeapon(Items weapon) {
        this.weapon = weapon;
    }

    public Items getArmor() {
        return armor;
    }

    public void setArmor(Items armor) {
        this.armor = armor;
    }

}
