package bank.management.system;

import javax.swing.*;

public class Home extends JFrame {
    Home(){
        super("Homepage");
        setLayout(null);
        setSize(850,600);
        setLocation(400,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Home();
    }
}
