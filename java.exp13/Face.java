// Aim: WAP to display Human face using applet.
// Name: PATHAN MUGAIRA // UIN: 231P084 import java.awt.*; import java.applet.*;
 public class Face extends Applet {
    public void paint(Graphics g) {
    g.drawOval(40, 40, 120, 150);
    g.drawOval(57, 75, 30, 20);
    g.setColor(Color.red);
    g.drawOval(110, 75, 30, 20); Color c = new Color(0, 0, 0);
    g.setColor(c);
    g.fillOval(68, 81, 10, 10);
    g.fillOval(121, 81, 10, 10);
    g.drawOval(85, 100, 30, 30); Color d = new Color(255, 175, 175);
    g.setColor(d);
    g.fillArc(60, 125, 80, 40, 180, 180);
    g.setColor(Color.black);
    g.drawOval(25, 92, 15, 30);
    g.drawOval(160, 92, 15, 30);
    Font f = new Font("TimesRoman", Font.BOLD, 72);
    g.setFont(f);
    g.drawString("Face ", 70, 250);
    }
    } 