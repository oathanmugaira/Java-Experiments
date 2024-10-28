// Aim: Write a program to display circle and filled circle using Applet.
// Name: PATHAN MUGAIRA
// UIN: 231P084
import java.awt.*; import java.applet.*; public class Circle extends Applet { public void paint(Graphics
    g) {
    g.setColor(Color.BLACK);
    g.drawOval(50, 50, 100, 100);
    g.drawString("Normal Circle", 70, 45);
    g.setColor(Color.BLUE);
    g.fillOval(180, 50, 100, 100);
    g.setColor(Color.BLACK);
    g.drawString("Filled Circle", 200, 45);
    }
    }