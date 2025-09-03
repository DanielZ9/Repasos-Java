package c08_oop.accessModifiersExercises;

public class Student {

    private int grade;
    private double nota;

    public Student(int grade, double nota) {
        setGrade(grade);
        setNota(nota);
    }

    public void isPassed() {
        if (nota >= 60) {
            System.out.println("El estudiante aprueba con: " + nota);
        } else
            System.out.println("El estudiante reprueba con: " + nota);
    }

    // Getters

    public int getGrade() {
        return grade;
    }

    public double getNota() {
        return nota;
    }

    // Setters

    public void setGrade(int grade) {
        if (grade >= 0) {
            this.grade = grade;
        } else
            System.out.println("Grado " + grade + " es invalido.");
    }

    public void setNota(double nota) {
        if (nota >= 0) {
            this.nota = nota;
        } else
            System.out.println("nota " + nota + " es invalida");
    }

}
