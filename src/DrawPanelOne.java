import javax.swing.*;

public class DrawPanelOne {
    public static void main(String[] args) {
        DrawPanelExerciceOne panel = new DrawPanelExerciceOne();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}
