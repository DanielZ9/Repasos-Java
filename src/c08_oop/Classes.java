package c08_oop;

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Daniel", 25);
        Person person2 = new Person("Diego", 45);

        //person.name = "Daniel";
        //person.age = 25;
        person.sayHello();
        person2.sayHello();

    }

}

