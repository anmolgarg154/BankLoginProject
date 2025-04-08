package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField Textname, TextFname, TextDOB, Number, textEmail, textCity;
    JButton button1, button2 , next;
    JCheckBox button3, button4;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("SignUp");

        setLayout(null);
        setSize(850, 700);
        setLocation(360, 40);

        // App logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(40, 10, 100, 100);
        add(image);

        // Background image
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image ii2 = ii1.getImage().getScaledInstance(850, 700, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0, 0, 850, 700);
        add(iimage);

         JLabel form = new JLabel("APPLICATION FORM NO. "+first);
         form.setForeground(Color.WHITE);
         form.setFont(new Font("Arial",Font.BOLD,35));
         form.setBounds(190,20,600,30);
         iimage.add(form);

        l1 = new JLabel("SIGNUP");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        l1.setBounds(330, 60, 450, 40);
        iimage.add(l1);

        JLabel label1 = new JLabel("Personal Details");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Ralway", Font.BOLD, 30));
        label1.setBounds(300, 100, 300, 40);
        iimage.add(label1);

        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Raleway",Font.BOLD,30));
        email.setForeground(Color.WHITE);
        email.setBounds(150,200,150,30);
        iimage.add(email);

        textEmail = new JTextField();
        textEmail.setBounds(400,200,200,30);
        iimage.add(textEmail);

        l2 = new JLabel("Name :");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Raleway", Font.BOLD, 30));
        l2.setBounds(150, 245, 150, 30);
        iimage.add(l2);

        Textname = new JTextField();
        Textname.setBackground(Color.WHITE);
        Textname.setFont(new Font("Raleway", Font.BOLD, 14));
        Textname.setBounds(400, 245, 200, 30);
        iimage.add(Textname);

        l3 = new JLabel("Father Name :");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Raleway", Font.BOLD, 30));
        l3.setBounds(150, 300, 240, 30);
        iimage.add(l3);

        TextFname = new JTextField();
        TextFname.setBackground(Color.WHITE);
        TextFname.setFont(new Font("Arial", Font.BOLD, 14));
        TextFname.setBounds(400, 300, 200, 30);
        iimage.add(TextFname);

        JLabel dob = new JLabel("DOB :");
        dob.setFont(new Font("Raleway", Font.BOLD, 30));
        dob.setForeground(Color.WHITE);
        dob.setBounds(150, 350, 200, 30);
        iimage.add(dob);

        TextDOB = new JTextField();
        TextDOB.setBackground(Color.WHITE);
        TextDOB.setFont(new Font("Arial", Font.BOLD, 14));
        TextDOB.setBounds(400, 350, 200, 30);
        iimage.add(TextDOB);

        JLabel No = new JLabel("Phone No. :");
        No.setForeground(Color.WHITE);
        No.setFont(new Font("Raleway", Font.BOLD, 30));
        No.setBounds(150, 400, 200, 30);
        iimage.add(No);

        Number = new JTextField();
        Number.setFont(new Font("Raleway", Font.BOLD, 14));
        Number.setBounds(400, 400, 200, 30);
        iimage.add(Number);

        JLabel gender = new JLabel("Gender :");
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Raleway", Font.BOLD, 30));
        gender.setBounds(150, 450, 200, 30);
        iimage.add(gender);

         button3 = new JCheckBox("male");
         button3.setBackground(Color.cyan);
         button3.setBounds(400,450,90,30);
         iimage.add(button3);

        button4 = new JCheckBox("female");
        button4.setBackground(Color.cyan);
        button4.setBounds(490,450,100,30);
        iimage.add(button4);

        JLabel city = new JLabel("City :");
        city.setForeground(Color.WHITE);
        city.setFont(new Font("Raleway",Font.BOLD,30));
        city.setBounds(150,500,100,30);
        iimage.add(city);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(400,500,200,30);
        iimage.add(textCity);



        button1 = new JButton("Submit");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setFont(new Font("Raleway", Font.BOLD, 20));
        button1.setBounds(250, 600, 170, 50);
        button1.addActionListener(this);
        iimage.add(button1);

        button2 = new JButton("Clear");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Raleway", Font.BOLD, 20));
        button2.setBounds(460, 600, 150, 50);
        button2.addActionListener(this);
        iimage.add(button2);
        setVisible(true);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(700,600,80,30);
        next.addActionListener(this);
        iimage.add(next);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String formno = first;
            String  name  = Textname.getText();
            String  fathername = TextFname.getText();
            String Gender = null;
            if(button3.isSelected()){
                Gender = "Male";
            }else if (button4.isSelected()){
                Gender = "Female";
            }
            String Email = textEmail.getText();
            String DOB = TextDOB.getText();
            String number = Number.getText();
            String  City =  textCity.getText();

            if (Textname.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            } else {
                 Con con1 = new Con();
                 String q = "insert into signup values('"+formno+"','"+Email+"','"+name+"','"+fathername+"','"+Gender+"','"+DOB+"','"+number+"','"+City+"')";
                 con1.statement.executeUpdate(q);
                 new Login();
                 setVisible(false);

            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
