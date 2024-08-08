package java102.P_1_MaceraOyunu.ItemsForSale;

public class SalesItems {

    public static final   Weapon tabanca = new Weapon(1, "Tabanca", 2, 25);
    public static final   Weapon kilic  = new Weapon(2, "Kilic", 3, 35);
    public static final  Weapon tufek = new Weapon(3, "Tufek", 7, 45);
    public static final  Weapon[] weaponry = {tabanca, kilic, tufek};

    public static final  Armor hafif = new Armor(1, "Hafif Zirh", 1, 15);
    public static final  Armor orta = new Armor(2, "Orta Zirh", 3, 25);
    public static final  Armor agir = new Armor(3, "Agir Zirh", 5, 35);
    public static final  Armor[] armors = {hafif, orta, agir};


}
