package Kuba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JLabel userLabel = new JLabel("User");
    JTextField userText = new JTextField();
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField passwordText = new JPasswordField();
    JButton loginButton = new JButton("Login");
    JLabel incorrectLoginOrPassword = new JLabel("");
    HashMap<String, String> logininfo = new HashMap<>();

    public LoginPage(HashMap<String, String> loginInfoOriginal)  {

        logininfo=loginInfoOriginal;

        userLabel.setBounds(25, 20, 80, 25);
        passwordLabel.setBounds(25, 50, 80, 25);
        userText.setBounds(100, 20, 165, 26);
        passwordText.setBounds(100, 50, 165, 25);
        loginButton.setBounds(15, 90, 80, 25);
        incorrectLoginOrPassword.setBounds(100,90,165,25);

        loginButton.addActionListener(this);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passwordLabel);
        frame.add(passwordText);
        frame.add(loginButton);
        frame.add(incorrectLoginOrPassword);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userID = userText.getText();
        String password = String.valueOf(passwordText.getPassword());

        if (logininfo.containsKey(userID)){
            if (logininfo.get(userID).equals(password)){
                WelcomePage welcomePage = new WelcomePage(userText.getText());
            }else {
                incorrectLoginOrPassword.setText("Incorrect password");
            }
        }
    }
}
