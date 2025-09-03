package c08_oop.classesExercises;

public class Student {

    int score;

    public Student(int score) {
        this.score = score;
    }

    public void showApproval() {
        if (score >= 60) {
            System.out.println("El estudiante aprueba con un Score de: " + score);
        } else
            System.out.println("El estudiante NO aprueba con un Score de: " + score);
    }

}
