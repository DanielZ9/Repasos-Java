package c08_oop;

import c08_oop.classesExercises.Person;

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Daniel", -25, "1");
        Person person2 = new Person("Diego", 45, "2");

        //person.name = "Daniel";
        //person.age = 25;
        person.setAge(25);
        System.out.println(person.getAge());

        person.sayHello();
        person2.sayHello();
        System.out.println(person.getId());

    }

}

