package c08_oop.abstractionExercises;

public class guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Suena la guitarra.");
    }
}
