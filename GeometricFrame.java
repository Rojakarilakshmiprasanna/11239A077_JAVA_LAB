import javax.swing.*;
import java.awt.*;

public class GeometricFrame extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw rectangle
        g.setColor(Color.RED);
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

    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("Geometric Shapes using Swing");

        // Create panel (our drawing area)
        GeometricFrame panel = new GeometricFrame();

        // Add panel to frame
        frame.add(panel);

        // Set frame size
        frame.setSize(650, 400);

        // Close the program when window closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}
