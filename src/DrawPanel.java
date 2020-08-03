import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // INICIO LADO SUPERIOR ESQUERDO
        g.drawLine(0, 0, width / 2, height / 2);
        g.drawLine(0, 0, width / 2 - 30, height / 2 + 30);
        g.drawLine(0, 0, width / 2 - 60, height / 2 + 60);
        g.drawLine(0, 0, width / 2 - 90, height / 2 + 90);
        g.drawLine(0, 0, width / 2 - 120, height / 2 + 120);
        g.drawLine(0, 0, width / 2 - 150, height / 2 + 150);
        g.drawLine(0, 0, width / 2 - 180, height / 2 + 180);
        g.drawLine(0, 0, width / 2 - 210, height / 2 + 210);

        g.drawLine(0, 0, width / 2 + 30, height / 2 - 30);
        g.drawLine(0, 0, width / 2 + 60, height / 2 - 60);
        g.drawLine(0, 0, width / 2 + 90, height / 2 - 90);
        g.drawLine(0, 0, width / 2 + 120, height / 2 - 120);
        g.drawLine(0, 0, width / 2 + 150, height / 2 - 150);
        g.drawLine(0, 0, width / 2 + 180, height / 2 - 180);
        g.drawLine(0, 0, width / 2 + 210, height / 2 - 210);
        // FIM LADO SUPERIOR ESQUERDO

        // INICIO LADO SUPERIOR DIREITO
//        g.drawLine(height / 2, 0, 0, height);
//        g.drawLine(0, 0, width / 2 - 30, height / 2 + 30);
//        g.drawLine(0, 0, width / 2 - 60, height / 2 + 60);
//        g.drawLine(0, 0, width / 2 - 90, height / 2 + 90);
//        g.drawLine(0, 0, width / 2 - 120, height / 2 + 120);
//        g.drawLine(0, 0, width / 2 - 150, height / 2 + 150);
//        g.drawLine(0, 0, width / 2 - 180, height / 2 + 180);
//        g.drawLine(0, 0, width / 2 - 210, height / 2 + 210);

//        g.drawLine(0, 0, width / 2 + 30, height / 2 - 30);
//        g.drawLine(0, 0, width / 2 + 60, height / 2 - 60);
//        g.drawLine(0, 0, width / 2 + 90, height / 2 - 90);
//        g.drawLine(0, 0, width / 2 + 120, height / 2 - 120);
//        g.drawLine(0, 0, width / 2 + 150, height / 2 - 150);
//        g.drawLine(0, 0, width / 2 + 180, height / 2 - 180);
//        g.drawLine(0, 0, width / 2 + 210, height / 2 - 210);
        // FIM LADO SUPERIOR DIREITO

        // INICIO LADO INFERIOR DIREITO
        g.drawLine(width / 2, height / 2, width, height);
        g.drawLine(width / 2 - 30, height / 2 + 30, width, height);
        g.drawLine(width / 2 - 60, height / 2 + 60, width, height);
        g.drawLine(width / 2 - 90, height / 2 + 90, width, height);
        g.drawLine(width / 2 - 120, height / 2 + 120, width, height);
        g.drawLine(width / 2 - 150, height / 2 + 150, width, height);
        g.drawLine(width / 2 - 180, height / 2 + 180, width, height);
        g.drawLine(width / 2 - 210, height / 2 + 210, width, height);

        g.drawLine( width / 2 + 30, height / 2 - 30, width, height);
        g.drawLine( width / 2 + 60, height / 2 - 60, width, height);
        g.drawLine( width / 2 + 90, height / 2 - 90, width, height);
        g.drawLine( width / 2 + 120, height / 2 - 120, width, height);
        g.drawLine( width / 2 + 150, height / 2 - 150, width, height);
        g.drawLine( width / 2 + 180, height / 2 - 180, width, height);
        g.drawLine( width / 2 + 210, height / 2 - 210, width, height);
        // FIM LADO INFERIOR DIREITO

        // INICIO LADO INFERIOR ESQUERDO
        g.drawLine(0, height, width / 2, height / 2);
        g.drawLine(0, height, width / 2 - 30, height / 2 - 30);
        g.drawLine(0, height, width / 2 - 60, height / 2 - 60);
        g.drawLine(0, height, width / 2 - 90, height / 2 - 90);
        g.drawLine(0, height, width / 2 - 120, height / 2 - 120);
        g.drawLine(0, height, width / 2 - 150, height / 2 - 150);
        g.drawLine(0, height, width / 2 - 180, height / 2 - 180);
        g.drawLine(0, height, width / 2 - 210, height / 2 - 210);

        g.drawLine(0, height, width / 2, height / 2);
        g.drawLine(0, height, width / 2 + 30, height / 2 + 30);
        g.drawLine(0, height, width / 2 + 60, height / 2 + 60);
        g.drawLine(0, height, width / 2 + 90, height / 2 + 90);
        g.drawLine(0, height, width / 2 + 120, height / 2 + 120);
        g.drawLine(0, height, width / 2 + 150, height / 2 + 150);
        g.drawLine(0, height, width / 2 + 180, height / 2 + 180);
        g.drawLine(0, height, width / 2 + 210, height / 2 + 210);
        // FIM LADO INFERIOR ESQUERDO
    }
}
