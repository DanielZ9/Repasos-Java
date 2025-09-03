package c08_oop.accessModifiersExercises;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public void checkPassoword(String password) {
        if (this.password.equals(password)) {
            System.out.println("Contraseña correcta");
        } else
            System.out.println("Contraseña incorrecta");
    }

    // Getters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Setters

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
