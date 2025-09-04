package c08_oop.abstractionExercises;


import javax.swing.*;
import java.awt.*;

public class Circle extends Shape implements Drawable {

    private double radio;

    private JPanel panel;

    public Circle(double radio) {
        setRadio(radio);
        createPanel();
    }

    public void createPanel() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                var diametro = (int) Math.round(radio * 2 * 10);
                g.drawOval(35, 35, diametro, diametro);
            }
        };
    }

    @Override
    public void calculateArea() {
        double pi = 3.14;
        System.out.println("El area del circulo es: " + ((Math.pow(radio, 2)) * pi));
    }

    // Getters

    public double getRadio() {
        return radio;
    }

    // Setters

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void draw() {
        JFrame frame = new JFrame("Dibujo del Circulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150, 150);

        frame.add(panel);
        frame.setVisible(true);


    }
}
