package c08_oop.inheritanceExercises;

public class Manager extends Employe {

    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        setDepartment(department);
    }

    // Getters

    public String getDepartment() {
        return department;
    }

    // Setters

    public void setDepartment(String department) {
        this.department = department;
    }

}
