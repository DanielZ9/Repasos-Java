package c08_oop.classesExercises;

public class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showData() {
        System.out.println("El libro " + title + " fue escrito por: " + author);
    }

}

