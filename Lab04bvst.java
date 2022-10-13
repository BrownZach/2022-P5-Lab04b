// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(150, 100, 125, 125);
        g.drawLine(150, 100, 200, 50);
        g.drawLine(275, 100, 325, 50);
        g.drawLine(275, 225, 325, 175);
        g.drawLine(150, 225, 200, 175);
        g.drawLine(200, 50, 325, 50);
        g.drawLine(325, 50, 325, 175);
        g.drawLine(325, 175, 200,175);
        g.drawLine(200, 175, 200, 50);
        // DRAW SPHERE
        g.drawOval(500, 50, 150, 150);
        g.drawOval(550, 50, 50, 150);
        g.drawOval(525, 50, 100, 150);
        g.drawOval(500, 100, 150, 50);
        g.drawOval(500, 75, 150, 100);
        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(150, 400, 100, 100);
        g.drawLine(170, 410, 230, 410);
        g.drawLine(170, 410, 200, 500);
        g.drawLine(230, 410, 200, 500);
        g.drawOval(178,410, 44, 44);
        // DRAW APCS
        g.fillRect(350, 300, 25, 125);
        g.fillRect(350, 300, 75, 25);
        g.fillRect(350, 350, 75, 25);
        g.fillRect(400, 300, 25, 125);
        g.fillRect(450, 300, 25, 125);
        g.fillRect(450, 300, 75, 25);
        g.fillRect(450, 350, 75, 25);
        g.fillRect(500, 300, 25, 75);
        g.fillRect(550, 300, 25, 125);
        g.fillRect(550, 300, 75, 25);
        g.fillRect(550, 400, 75, 25);
        g.fillRect(650, 300, 25, 75);
        g.fillRect(650, 300, 75, 25);
        g.fillRect(650, 350, 75, 25);
        g.fillRect(700, 350, 25, 75);
        g.fillRect(650, 400, 75, 25);
        // DRAW PACMEN FLOWER
        g.fillArc(800, 400, 100, 100, 135, 270);
        g.fillArc(865, 465, 100, 100, 45, 270);
        g.fillArc(800, 530, 100, 100, 315, 270);
        g.fillArc(735, 465, 100, 100, 225, 270);
    }
}


