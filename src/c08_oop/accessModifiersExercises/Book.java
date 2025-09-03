package c08_oop.accessModifiersExercises;

public class Book {

    private String title;

    public Book(String title) {
        setTitle(title);
        //this.title = title;
    }

    // Getters

    public String getTitle() {
        return title;
    }

    // Setters

    private void setTitle(String title) {
        this.title = title;
    }

}
