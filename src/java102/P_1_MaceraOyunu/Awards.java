package java102.P_1_MaceraOyunu;

public class Awards {
    private String name;
    private boolean awardBool;

    public Awards(String name, boolean awardBool){
        setName(name);
        setAwardBool(awardBool);
    }

    public String getName(){
        return this.name;
    }
    public void setName (String name ){
        this.name = name;
    }
    public boolean getAwardBool(){
        return this.awardBool;
    }
    public void setAwardBool( boolean awardBool){
        this.awardBool = awardBool;
    }
}
