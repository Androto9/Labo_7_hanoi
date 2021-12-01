package ChatChien;

import java.util.ArrayList;

public class ObjectList {

    private ArrayList<Object> objectList;

    public void ObjectList(){
        objectList = new ArrayList<>();
    }

    public int size(){return this.objectList.size();}

    public boolean isEmpty(){
        boolean empty = this.objectList.isEmpty();
        return empty;
    }

    public void insert(Object object){
        this.objectList.add(object);
    }

    public void append(Object object){
        int index = this.size();
        this.objectList.add(index - 1, object);
    }

    public void remove(Object object){
        this.objectList.remove(object);
    }

    public  Object get(int index){
        return null;
    }

    @Override
    public String toString() {
        return "";
    }

    //public Examinator examinator(){}
}
