package c08_oop.abstractionExercises;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JPanel implements Drawable {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();

        // Coordenadas del triángulo (ejemplo centrado)
//        int[] xPoints = { w / 2, w / 4, (3 * w) / 4 };
//        int[] yPoints = { h / 4, (3 * h) / 4, (3 * h) / 4 };

        int[] xPoints = {50, 90, 130};
        int[] yPoints = {120, 10, 110};

        Polygon triangle = new Polygon(xPoints, yPoints, 3);

        g2.drawPolygon(triangle);  // solo borde
    }

    @Override
    public void draw() {
        JFrame frame = new JFrame("Ejemplo de Dibujo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        Triangle panelDibujo = new Triangle();
        frame.add(panelDibujo);
        frame.setVisible(true);
    }
}
