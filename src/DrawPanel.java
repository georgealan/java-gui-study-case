import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0, 0, width, height);
        g.drawLine(0, 10, width, height);
        g.drawLine(0, 20, width, height);
        g.drawLine(0, 30, width, height);
        g.drawLine(0, 40, width, height);
        g.drawLine(0, 50, width, height);
        g.drawLine(10, 0, width, height);
        g.drawLine(20, 0, width, height);
        g.drawLine(30, 0, width, height);
        g.drawLine(40, 0, width, height);
        g.drawLine(50, 0, width, height);
        g.drawLine(100, height, width, 15);
    }
}
