package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
     JLabel label1 , label2, label3;

     JTextField textField;

     JPasswordField passwordField;

     JButton button1, button2, button3;
   Login(){
            super("Bank Management system Login");

           label1 = new JLabel("WELCOME TO ATM");
           label1.setForeground(Color.WHITE);
           label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
           label1.setBounds(230,125,450,40);
           add(label1);

           label2 = new JLabel("Card No:");
           label2.setForeground(Color.WHITE);
           label2.setFont(new Font("Ralway", Font.BOLD, 28));
           label2.setBounds(150,190,375,30);
           add(label2);

            textField = new JTextField(15);
            textField.setBounds(325,190,230,30);
            textField.setFont(new Font("Arial",Font.BOLD,14));
            add(textField);


           label3 = new JLabel("PIN:");
           label3.setForeground(Color.WHITE);
           label3.setFont(new Font("Ralway", Font.BOLD, 28));
           label3.setBounds(150,250,375,30);
           add(label3);


             passwordField = new JPasswordField(15);
             passwordField.setBounds(325,250,230,30);
             passwordField.setFont(new Font("Arial",Font.BOLD,14));
             add(passwordField);

             button1 = new JButton("SignIn");
             button1.setForeground(Color.WHITE);
             button1.setBackground(Color.BLACK);
             button1.setFont(new Font("Ralway",Font.BOLD,14));
             button1.setBounds(300,300,100,30);
             button1.addActionListener(this);
             add(button1);

               button2 = new JButton("clear");
               button2.setForeground(Color.WHITE);
               button2.setBackground(Color.BLACK);
               button2.setFont(new Font("Ralway",Font.BOLD,14));
               button2.setBounds(430,300,100,30);
               button2.addActionListener(this);
               add(button2);


               button3 = new JButton("SignUp");
               button3.setForeground(Color.WHITE);
               button3.setBackground(Color.BLACK);
               button3.setFont(new Font("Ralway",Font.BOLD,15));
               button3.setBounds(300,350,230,30);
               button3.addActionListener(this);
               add(button3);

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
            Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(350,10,100,100);
            add(image);

           ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
           Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
           ImageIcon ii3 = new ImageIcon(ii2);
           JLabel iimage = new JLabel(ii3);
           iimage.setBounds(630,350,100,100);
           add(iimage);

           ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
           Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
           ImageIcon iii3 = new ImageIcon(iii2);
           JLabel iiimage = new JLabel(iii3);
           iiimage.setBounds(0,0,850,480);
           add(iiimage);



            setLayout(null);
            setSize(850,480);
            setLocation(450,200);
            setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
       try{
          if(e.getSource() == button1){
              Con c = new Con();
              String cardno = textField.getText();
              String pinno  =    passwordField.getText();

              String q = "Select * from Login where card_no = '"+cardno+"' and pin = '"+pinno+"' ";

              ResultSet resultSet = c.statement.executeQuery(q);
              if(resultSet.next()){
                  setVisible(false);
                  new Home(pinno);
              }


          }else if(e.getSource()== button2){
                 textField.setText("");
                 passwordField.setText("");
          }
          else if(e.getSource()==button3){
              new Signup();
              setVisible(false);
          }
       }catch (Exception E){
          E.printStackTrace();
       }
    }

    public static void main(String[] args) {
       new Login();

    }
}

