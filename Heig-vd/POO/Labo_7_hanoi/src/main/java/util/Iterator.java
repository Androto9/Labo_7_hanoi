package util;

public class Iterator {
    private Element element;

    Iterator(Element element) {
        this.element = element;
    }

    public boolean hasNext() {
        return element != null;
    }

    public Object next() {
        if (!hasNext()) {
            throw new RuntimeException("Error : null value.");
        }
        Object object = element.object;
        element = element.next;
        return object;
    }
}
