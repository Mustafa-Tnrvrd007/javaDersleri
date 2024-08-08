package java102.P_1_MaceraOyunu.ItemsForSale;

public abstract class Items {

    private boolean warEffect ; // true ise defans , false ise hücum

    private String name ;
    private  int id;
    private   int damageOrDefence;
    private  int money;

    public Items( int id, String name, int damageOrDefence, int money){
        setId(id);
        setName(name);
        setDamageOrDefence(damageOrDefence);
        setMoney(money);
    }

    public Boolean getWarEffect(){
        return warEffect;
    }
    public void setWarEffect(boolean warEffect){
        this.warEffect = warEffect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamageOrDefence() {
        return damageOrDefence;
    }

    public void setDamageOrDefence(int damageOrDefence) {
        this.damageOrDefence = damageOrDefence;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }




}
