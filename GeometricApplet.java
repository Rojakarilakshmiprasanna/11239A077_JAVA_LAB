import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class GeometricApplet {
   
    public void paint(Graphics g) {
        // Set color
        g.setColor(Color.RED);
        // Draw rectangle
        g.drawRect(50, 50, 150, 100);

        // Draw oval
        g.setColor(Color.BLUE);
        g.drawOval(250, 50, 150, 100);

        // Draw line
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 200, 300);

        // Draw filled rectangle
        g.setColor(Color.MAGENTA);
        g.fillRect(250, 200, 150, 100);

        // Draw filled oval
        g.setColor(Color.ORANGE);
        g.fillOval(450, 50, 100, 150);
    }
}