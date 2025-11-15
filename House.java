import java.applet.Applet;
import java.awt.*;

public class House extends Applet {

    public void paint(Graphics g) {

        // House base rectangle
        g.setColor(Color.lightGray);
        g.fillRect(100, 120, 200, 150);

        // Roof triangle
        g.setColor(Color.red);
        int x[] = {80, 200, 320};
        int y[] = {120, 40, 120};
        g.fillPolygon(x, y, 3);

        // Door
        g.setColor(Color.darkGray);
        g.fillRect(180, 180, 40, 90);

        // Windows
        g.setColor(Color.white);
        g.fillRect(120, 150, 40, 40);
        g.fillRect(240, 150, 40, 40);
    }
}
