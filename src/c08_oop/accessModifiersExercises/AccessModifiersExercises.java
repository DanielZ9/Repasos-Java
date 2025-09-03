package c08_oop.accessModifiersExercises;

public class AccessModifiersExercises {

    public static void main(String[] args) {
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var person = new Person("Daniel", 25);
        person.setAge(26);
        person.showData();

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var arroz = new Product(500);
        System.out.println(arroz.getPrice());
        var lentejas = new Product(-250);
        System.out.println(lentejas.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var bankAccount = new BankAccount(150000);
        bankAccount.deposit(50000);
        bankAccount.withdraw(190000);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var book = new Book("La María");
        System.out.println(book.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperatura = new Temperatura(0);
        System.out.println(temperatura.getCelsius());
        temperatura.setCelsius(150);
        temperatura.setCelsius(-40);
        System.out.println(temperatura.getCelsius());


        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var daniel = new User("DZ", "1234");
        System.out.println(daniel.getUsername());
        System.out.println(daniel.getPassword());
        daniel.setPassword("4321");
        daniel.setUsername("DFZ");
        daniel.checkPassoword("432");
        System.out.println(daniel.getUsername());
        System.out.println(daniel.getPassword());


        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var employe = new Employe(150000);
        System.out.println(employe.getSalary());
        employe.raiseSalary(10);
        System.out.println(employe.getSalary());


        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rectangle = new Rectangle(5, 14);
        rectangle.calculateArea();
        rectangle.setAltura(15);
        rectangle.setBase(2);
        rectangle.calculateArea();

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var fernando = new Student(11, 59);
        fernando.isPassed();

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var car = new Car(80);
        car.acelerate(50);
        car.acelerate(30);
        car.brake(50);
    }

}
