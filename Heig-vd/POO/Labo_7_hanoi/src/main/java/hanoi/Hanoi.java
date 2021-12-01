package hanoi;

import util.Stack;

public class Hanoi {

    private int turn;
    private final int disks;
    private final Stack rod1 = new Stack();
    private final Stack rod2 = new Stack();
    private final Stack rod3 = new Stack();
    private final HanoiDisplayer hanoiDisplayer;

    public Hanoi(int disks, HanoiDisplayer hanoiDisplayer) {
        if (disks <= 0)
            throw new RuntimeException("Error : Number of disks can not be less than or equal to 0.");
        if(hanoiDisplayer == null)
            throw new RuntimeException("Error : Hanoi displayer can not be null.");
        this.disks = disks;
        this.hanoiDisplayer = hanoiDisplayer;
        for (int i = disks; i > 0; --i) {
            rod1.stack(i);
        }
    }

    public Hanoi(int disks) {
        this(disks, new HanoiDisplayer());
    }

    public void solve() {
        hanoiDisplayer.display(this);
        move(rod1, rod2, rod3, disks);

    }

    public int[][] status() {
        Object[][] hanoiStatus = new Object[][]{
                rod1.stackArray(),
                rod2.stackArray(),
                rod3.stackArray()
        };
        int[][] tabInt = new int[hanoiStatus.length][];

        for (int i = 0; i < tabInt.length; ++i) {
            tabInt[i] = new int[hanoiStatus[i].length];
            for (int j = 0; j < tabInt[i].length; ++j) {
                tabInt[i][j] = (int) hanoiStatus[i][j];
            }
        }
        return tabInt;

    }

    public boolean finished() {
        return rod3.getSize() == disks;
    }

    public int turn() {
        return turn;

    }

    public void move(Stack from, Stack by, Stack to, int n) {
        if (n < 1)
            return;
        move(from, to, by, n - 1);
        to.stack(from.unStack());
        turn++;
        hanoiDisplayer.display(this);
        move(by, from, to, n - 1);
    }

    @Override
    public String toString() {
        return  "One:   " + rod1 + "\n" +
                "Two:   " + rod2 + "\n" +
                "Three: " + rod3 + "\n";
    }
}
