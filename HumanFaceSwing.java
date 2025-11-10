import javax.swing.*;
import java.awt.*;

public class HumanFaceSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        setBackground(Color.white);

        // Face outline
        g.setColor(Color.orange);
        g.fillOval(100, 80, 200, 200);

        // Eyes
        g.setColor(Color.white);
        g.fillOval(150, 130, 30, 20);
        g.fillOval(220, 130, 30, 20);

        g.setColor(Color.black);
        g.fillOval(160, 135, 10, 10);
        g.fillOval(230, 135, 10, 10);

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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face Drawing");
        HumanFaceSwing panel = new HumanFaceSwing();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
