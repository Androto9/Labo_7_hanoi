import hanoi.*;

public class TestHanoi {

    private static HanoiDisplayer displayer;
    private static Hanoi hanoi;

    public static void main(String args[]){

        testHanoi();
        testSolve();
        testStatus();
    }

    private static void testHanoi() {
        hanoi = new Hanoi(4);

        System.out.println("Hanoi : ");
        displayer.display(hanoi);
    }

    private static void testSolve() {
        hanoi = new Hanoi(3);
        System.out.println("Solve : ");
        hanoi.solve();
    }

    private static void testStatus(){

    }
}
