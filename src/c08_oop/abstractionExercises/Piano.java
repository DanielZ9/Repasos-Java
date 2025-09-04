package c08_oop.abstractionExercises;

public class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Suena el piano.");
    }
}

