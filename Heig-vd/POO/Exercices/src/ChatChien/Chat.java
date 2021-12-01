package ChatChien;

public class Chat implements Actionable{
    private String name;

    public Chat(){
        name = null;
    }

    public Chat(String aName){
        name = aName;
    }
    public String makeNoise(){
        return "miaow";
    }
}
