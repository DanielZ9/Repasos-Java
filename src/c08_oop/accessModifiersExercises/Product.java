package c08_oop.accessModifiersExercises;

public class Product {

    private double price;

    public Product(double price) {
        setPrice(price);
    }

    // Getters

    public double getPrice() {
        return price;
    }

    // Setters

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else
            System.out.println("Precio" + price + " invalido");
    }

}
