import javax.swing.*;

public class DrawPanelTwo {
    public static void main(String[] args) {
        DrawPanelExerciceTwo panel = new DrawPanelExerciceTwo();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}
