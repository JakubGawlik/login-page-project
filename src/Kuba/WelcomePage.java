package Kuba;

import javax.swing.*;

public class WelcomePage {

    public WelcomePage(String userName) {

        JFrame welcomeFrame = new JFrame();

        JLabel welcomeLabel = new JLabel("Cześć " + userName + "!");
        welcomeLabel.setBounds(50, 70, 200, 25);

        welcomeFrame.add(welcomeLabel);
        welcomeFrame.setSize(200, 200);
        welcomeFrame.setLayout(null);

        welcomeFrame.setVisible(true);
    }
}
