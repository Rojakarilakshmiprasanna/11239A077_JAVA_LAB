import java.applet.Applet;
import java.awt.*;

public class GeometricFigures extends Applet {

    public void paint(Graphics g) {

        // Line
        g.drawLine(20, 40, 200, 40);

        // Rectangle (outline)
        g.drawRect(20, 70, 120, 60);

        // Filled Rectangle
        g.setColor(Color.orange);
        g.fillRect(160, 70, 120, 60);

        // Oval (outline)
        g.setColor(Color.blue);
        g.drawOval(20, 150, 120, 60);

        // Filled Oval
        g.setColor(Color.red);
        g.fillOval(160, 150, 120, 60);
    }
}
