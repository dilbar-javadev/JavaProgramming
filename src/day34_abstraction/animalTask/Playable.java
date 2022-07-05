package day34_abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true;  // static and final

    /*
    private static void main(String[] args) {
        System.out.println(isFriendly);
    }

    */

    void play();  //  abstract

}
