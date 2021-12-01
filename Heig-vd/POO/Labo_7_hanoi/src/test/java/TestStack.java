import java.util.Arrays;
import util.*;

public class TestStack {
    private static final String success = "Success";
    private static final String failure = "Failure";

    public static void main(String args[]){
        testToStack();
        testUnstack();
        testHasNext();
        testNext();
        testArray();
    }

    private static void testToStack(){
        Stack stack = createTestStack(5);
        String testStack = "[ <1> <2> <3> <4> <5> ]";

        System.out.print("Stack : ");
        resultTest(stack.toString(), testStack);
    }

    private static void testUnstack(){
        Stack stack =  createTestStack(3);
        String testUnstack = "[ <2> <3> ]";

        stack.unStack();

        System.out.print("Unstack part 1 : ");
        resultTest(stack.toString(), testUnstack);

        stack.unStack();
        stack.unStack();

        System.out.print("Unstack part 2 : ");// Renvoie RuntimeException il n'y a plus d'élément à supprimer
        resultTest(stack.toString(), "[ ]");

        System.out.print("Unstack part 3 : ");
        //stack.unStack();

    }

    private static void testHasNext(){
        Stack stack = createTestStack(3);
        Iterator i = stack.stackIterator();
        int count = 0;

        for(int j = 0; j < stack.getSize(); ++j){
            if(i.hasNext())
                ++count;
        }

        System.out.print("HasNext : ");
        resultTest(count, 3);
    }

    private static void testNext() {
        Stack stack = createTestStack(3);
        Iterator i = stack.stackIterator();

        for (int j = 0; j < stack.getSize() ;++j){
            System.out.println(i.next());
        }
    }

    private static void testArray(){
        Stack stack = createTestStack(5);
        String testArray = "[1, 2, 3, 4, 5]";

        System.out.print("ArrayStack : ");
        resultTest(Arrays.toString(stack.stackArray()), testArray);
    }

    private static Stack createTestStack(int size){
        Stack stack = new Stack();
        for (int i = size; i >= 1;--i)
            stack.stack(i);

        return stack;
    }

    private static void resultTest(String lhs, String rhs){
        if (lhs.equals(rhs))
            System.out.println(success);
        else
            System.out.println(failure);
    }

    private static void resultTest(int lhs, int rhs){
        if (lhs == rhs)
            System.out.println(success);
        else
            System.out.println(failure);
    }
}
