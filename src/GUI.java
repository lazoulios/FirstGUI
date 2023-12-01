package src;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.HashMap;

public class GUI {
    public GUI() {
        Info temp = new Info();
        Map<String,String> info =new HashMap<>(temp.getMap());
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JTextField usernameField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);
        JButton passwordButton = new JButton("Login");
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("resources/images/tft.png"));

        //frame operations
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Teamfight Tactics");
        frame.setIconImage(icon.getImage());
        frame.setPreferredSize(new Dimension(900, 500));
        frame.pack();
        frame.setLocation(300,200);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(5,4,2,2));
        //usernameField operations
        usernameField.addActionListener(e -> {
            String result = usernameField.getText();
            if (result.equals(info.get(passwordField.getText()))) {
                JOptionPane.showMessageDialog(null, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
        }); //Pressing enter tests the given username and password
        //passwordField operations
        passwordField.setBounds(100, 100, 100, 30);
        passwordField.setSize(100, 30);
        passwordField.setEchoChar('*');
        passwordField.addActionListener(e->{
            char[] password = passwordField.getPassword();
            String result = new String(password);
            if (result.equals(info.get(usernameField.getText()))) {
                JOptionPane.showMessageDialog(null, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
        }); //Pressing enter tests the given username and password
        //passwordButton operations
        passwordButton.addActionListener(e -> {
            char[] password = passwordField.getPassword();
            String result = new String(password);
            if (result.equals(info.get(usernameField.getText()))) {
                JOptionPane.showMessageDialog(null, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
        }); //Pressing the button tests the given username and password
//        for (int i=0;i<12;i++) {
//            frame.add(new JPanel());
//        }
        for(int i=0;i<5;i++){
            panel.add(new JPanel());
        }
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(passwordButton);
        for(int i=0;i<4;i++){
            panel.add(new JPanel());
        }
        frame.add(panel, BorderLayout.CENTER);
//        for (int i=0;i<12;i++){
//            frame.add(new JPanel());
//        }


    }


}
