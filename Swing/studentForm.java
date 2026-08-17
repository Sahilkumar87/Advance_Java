// javac firstSwingApp.java && java firstSwingApp


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentForm implements ActionListener {

    JFrame jFrame;
    JLabel l1,l2;
    JTextField name, email;
    JButton save;

    studentForm(){
        jFrame = new JFrame("Student Form");
        l1 = new JLabel("Student Name");
        name = new JTextField();
        save = new JButton("Save");

        l1.setBounds(50, 50, 100, 30);
        name.setBounds(160, 50, 150, 30);
        save.setBounds(100, 120, 100, 30);

        jFrame.add((l1));
        jFrame.add(name);
        jFrame.add(save);

        jFrame.setLayout(null);
        jFrame.setSize(400, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        
        jFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );
    }


    static void main(String[] args) {
        new studentForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name1 = name.getText();
        String email1 = email.getText();
        JOptionPane.showMessageDialog(jFrame, "Student Name is " + name1 + "Student email is " + email1);
    }
}
