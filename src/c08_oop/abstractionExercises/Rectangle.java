package c08_oop.abstractionExercises;

import c08_oop.inheritanceExercises.Shape;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends Shape implements Drawable {

    private int base;
    private int altura;

    private JPanel panel;

    public Rectangle(int base, int altura) {
        setAltura(altura);
        setBase(base);
        createRectangle();
    }

    public void createRectangle() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                var nuevaAltura = altura * 10;
                var nuevaBase = base * 10;
                g.drawRect((getWidth() / 2) - (nuevaBase / 2), (getHeight() / 2) - (nuevaAltura / 2), nuevaBase, nuevaAltura);
            }
        };
    }

    @Override
    public void calculateArea() {
        System.out.println("El area del rectángulo es: " + (base * altura));
    }

    // Getters

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    // Setters

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void draw() {
        JFrame frame = new JFrame("Dibujo rectángulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150, 150);

        frame.add(panel);
        frame.setVisible(true);

    }
}
