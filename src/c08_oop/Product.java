package c08_oop;

public class Product {

    String nombre;
    int precio;

    public Product(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void descuento(int descuento) {
        var nuevoPrecio = precio - descuento;
        System.out.println("El producto " + nombre + " con precio: " + precio +
                " se le aplica un descuento de: " + descuento +
                " y queda con un valor de: " + nuevoPrecio);
    }

}
