package c08_oop.inheritanceExercises;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        setAge(age);
        setName(name);
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

