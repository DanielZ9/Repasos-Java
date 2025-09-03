package c08_oop.accessModifiersExercises;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Mostrar Información

    public void showData() {
        System.out.println(name + " tiene " + age + " años.");
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
