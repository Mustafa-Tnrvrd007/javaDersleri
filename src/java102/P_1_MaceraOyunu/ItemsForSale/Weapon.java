package java102.P_1_MaceraOyunu.ItemsForSale;

public class Weapon extends Items{


    public Weapon(int id , String name , int hasar , int money){
        super(id,name,hasar,money);
        super.setWarEffect(false);
    }


}
