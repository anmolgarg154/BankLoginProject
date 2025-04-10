package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    JLabel title, subtitle, welcomeMsg;
    JButton aboutBtn, servicesBtn, contactBtn, loginBtn;
    String pin;
    public Home(String pin) {
        this.pin = pin;




        // Layout settings
        setLayout(null);
        setSize(850, 600);
        setLocation(400, 200);
        getContentPane().setBackground(Color.WHITE);

        // Title
        title = new JLabel("Welcome to XYZ Bank");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBounds(250, 30, 400, 40);
        add(title);

        // Subtitle / Tagline
        subtitle = new JLabel("Your trusted financial partner.");
        subtitle.setFont(new Font("Arial", Font.PLAIN, 18));
        subtitle.setBounds(280, 80, 300, 25);
        add(subtitle);

        // Welcome message
        welcomeMsg = new JLabel("Choose an option to continue:");
        welcomeMsg.setFont(new Font("Arial", Font.PLAIN, 16));
        welcomeMsg.setBounds(290, 130, 300, 20);
        add(welcomeMsg);

        // Buttons
        aboutBtn = new JButton("About Us");
        aboutBtn.setBounds(150, 200, 150, 40);
        add(aboutBtn);

        servicesBtn = new JButton("Our Services");
        servicesBtn.setBounds(330, 200, 150, 40);
        add(servicesBtn);

        contactBtn = new JButton("Contact");
        contactBtn.setBounds(510, 200, 150, 40);
        add(contactBtn);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(330, 280, 150, 40);
        add(loginBtn);

        // Window settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Home("");
    }
}
