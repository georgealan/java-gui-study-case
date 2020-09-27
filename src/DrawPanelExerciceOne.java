import javax.swing.*;
import java.awt.*;

public class DrawPanelExerciceOne extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Controle dos posicionamentos
        int inclinacao = 0;
        int grauDeInclinacao = 30;

        do {
            inclinacao += grauDeInclinacao;

            // POSICIONAMENTO INICIAL DAS LINHAS
            g.drawLine(0, 0, width / 2, height / 2);
            g.drawLine(width, 0, width / 2, height / 2);
            g.drawLine(width / 2, height / 2, width, height);
            g.drawLine(0, height, width / 2, height / 2);

            // LADO SUPERIOR ESQUERDO
            g.drawLine(0, 0, width / 2 - inclinacao, height / 2 + inclinacao);
            g.drawLine(0, 0, width / 2 + inclinacao, height / 2 - inclinacao);

            // LADO SUPERIOR DIREITO
            g.drawLine(width, 0, width / 2 + inclinacao, height / 2 + inclinacao);
            g.drawLine(width, 0, width / 2 - inclinacao, height / 2 - inclinacao);

            // LADO INFERIOR DIREITO
            g.drawLine(width / 2 - inclinacao, height / 2 + inclinacao, width, height);
            g.drawLine( width / 2 + inclinacao, height / 2 - inclinacao, width, height);

            // LADO INFERIOR ESQUERDO
            g.drawLine(0, height, width / 2 - inclinacao, height / 2 - inclinacao);
            g.drawLine(0, height, width / 2 + inclinacao, height / 2 + inclinacao);

        } while ( inclinacao < 210);
    }
}
