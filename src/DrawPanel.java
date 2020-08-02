import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

//        g.drawLine(200, 300, width, height);
//        g.drawLine(0, 300, width, height);
        //g.drawLine(4000, height, width, 1230);
    }
}
