package hanoi;

public class HanoiDisplayer {
    public void display(Hanoi h){
        System.out.println("--Turn: " + h.turn());
        System.out.println(h);
    }
}
