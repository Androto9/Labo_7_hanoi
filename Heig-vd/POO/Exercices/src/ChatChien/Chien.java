package ChatChien;

public class Chien implements Actionable{
    private String name;

    public Chien(){
        name = null;
    }

    public Chien(String aName){
        name = aName;
    }
    public String makeNoise(){
        return "woof";
    }
}
