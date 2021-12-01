package ChatChien;

interface Actionable {

    String makeNoise();
    default void action(){
        System.out.println("Action : " + makeNoise());
    }
}
