package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPasswordField passwordField = new JPasswordField(10);
        JButton passwordButton = new JButton("Login");
        FlowLayout flowLayout = new FlowLayout();
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("src/images/tft.png"));

        panel.setBounds(30, 30, 10, 30);
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Teamfight Tactics");
        frame.setIconImage(icon.getImage());
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        flowLayout.setAlignment(FlowLayout.CENTER);
        flowLayout.setHgap(10);
        flowLayout.setVgap(10);
        frame.setLayout(flowLayout);

        passwordField.setBounds(100, 100, 100, 30);
        passwordField.setEchoChar('*');


        /**
         *  Added a @param password which takes the value the user types and checks if its the correct password
         *
         *  @author
         * */
        passwordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] password = passwordField.getPassword();
                String result = new String(password);
                if (result.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }
            }
        });

        frame.add(passwordField);
        frame.add(passwordButton);




    }


}
