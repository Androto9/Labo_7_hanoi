package util;

public class Stack {
    private Element top = null;
    private int size;


    public int getSize() {
        return size;
    }

    public void stack(Object object) {
        top = new Element(object, top);
        ++size;
    }

    public Object unStack() {
        if (top == null) {
            throw new RuntimeException("Error : Stack is empty.");
        }
        Object object = top.object;
        top = top.next;
        --size;
        return object;

    }

    public Iterator stackIterator() {
        return new Iterator(top);
    }

    public Object[] stackArray() {
        Object[] objectArray = new Object[size];
        Iterator i = stackIterator();
        for (int j = 0; j < size; ++j) {
            objectArray[j] = i.next();
        }
        return objectArray;
    }

    @Override
    public String toString() {
        Iterator i = stackIterator();
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        while (i.hasNext()) {
            sb.append("<").append(i.next()).append(">").append(" ");
        }
        sb.append("]");
        return sb.toString();
    }


}
