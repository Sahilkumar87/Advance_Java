import javax.swing.*;

public class firstSwingApp {
    static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );
        jFrame.setTitle("I Hate Java, buz its syntax");
        jFrame.setLocationRelativeTo(null);
    }
}
