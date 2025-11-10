import java.applet.Applet;
import java.awt.*;

public class HumanFaceApplet extends Applet {

    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.white);

        // Face outline
        g.setColor(Color.orange);
        g.fillOval(100, 80, 200, 200); // x, y, width, height

        // Eyes
        g.setColor(Color.white);
        g.fillOval(150, 130, 30, 20);  // Left eye white
        g.fillOval(220, 130, 30, 20);  // Right eye white

        g.setColor(Color.black);
        g.fillOval(160, 135, 10, 10);  // Left pupil
        g.fillOval(230, 135, 10, 10);  // Right pupil

        // Nose
        g.setColor(Color.black);
        g.drawLine(200, 150, 200, 190);
        g.drawLine(200, 190, 190, 200);
        g.drawLine(190, 200, 210, 200);

        // Mouth (smile)
        g.setColor(Color.red);
        g.drawArc(150, 200, 100, 50, 0, -180);

        // Title
        g.setColor(Color.blue);
        g.drawString("Simple Human Face", 150, 50);
    }
}
