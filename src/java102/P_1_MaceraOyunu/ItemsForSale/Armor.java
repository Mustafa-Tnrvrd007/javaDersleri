package java102.P_1_MaceraOyunu.ItemsForSale;

public class Armor extends Items{

    public Armor(int id, String name, int defence, int money){
        super(id,name,defence,money);
        super.setWarEffect(true);
    }


}
