import javax.swing.*;
import java.awt.*;

public class DrawPanelExerciceTwo extends JPanel {
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
            g.drawLine(0, 0, width - height, height);


            // LADO INFERIOR ESQUERDO
            g.drawLine(0, inclinacao, width - height + inclinacao, height);


        } while ( inclinacao < 500);
    }
}
