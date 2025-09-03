package c08_test_oop;

import c08_oop.Person;

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Daniel", 25, "1");
        Person person2 = new Person("Diego", 45, "2");

        //person.name = "Daniel";
        //person.age = 25;
        person.sayHello();
        person2.sayHello();

    }

}

