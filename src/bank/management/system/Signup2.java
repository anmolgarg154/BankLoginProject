package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JButton submit;
    JTextField t1,t2;
    JCheckBox b1,b2;

    String formno;
    Signup2(String formno){
        this.formno = formno;



        JLabel h = new JLabel("Cards Details");
        h.setForeground(Color.WHITE);
        h.setFont(new Font("Raleway",Font.BOLD,30));
        h.setBounds(300,30,200,30);
        add(h);


        l1 = new JLabel("Card No :");
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setForeground(Color.white);
        l1.setBounds(150,130,200,30);
        add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));
        t1.setBounds(350,130,200,30);
        add(t1);

        l2 = new JLabel("PIN :");
        l2.setFont(new Font("Raleway",Font.BOLD,30));
        l2.setForeground(Color.white);
        l2.setBounds(150,200,200,30);
        add(l2);

        t2 = new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));
        t2.setBounds(350,200,200,30);
        add(t2);

        l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,30));
        l3.setForeground(Color.white);
        l3.setBounds(150,250,250,30);
        add(l3);

        b1 = new JCheckBox("Saving");
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setForeground(Color.BLACK);
        b1.setBounds(400,250,150,30);
        add(b1);

        b2 = new JCheckBox("Current");
        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.setForeground(Color.BLACK);
        b2.setBounds(400,300,150,30);
        add(b2);

         submit = new JButton("Submit");
         submit.setFont(new Font("Raleway",Font.BOLD,30));
         submit.setBounds(300,400,200,40);
         submit.addActionListener(this);
         add(submit);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,600,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,600);
        add(iiimage);

        setLayout(null);
        setSize(850,600);
        setLocation(400,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          String Atype = null;
          if(b1.isSelected()){
              Atype = "Saving";
          }else if(b2.isSelected()){
              Atype = "Current";
          }
          String cardNo = t1.getText();
          String pin = t2.getText();

          try{
              if(t1.getText().equals("")){
                  JOptionPane.showMessageDialog(null,"fill card details");
              }else {
                  Con con2 = new Con();
                  String q1 = "insert into signupthree values('"+formno+"','"+cardNo+"','"+pin+"','"+Atype+"')";
                  String q2 = "insert into Login values('"+formno+"','"+cardNo+"','"+pin+"')";
                  con2.statement.executeUpdate(q1);
                  con2.statement.executeUpdate(q2);
                  JOptionPane.showMessageDialog(null,"Card No :"+cardNo+"\n Pin :"+pin);
                  new Login();
                  setVisible(false);
              }
          }catch (Exception E){
              E.printStackTrace();
          }
    }


    public static void main(String[] args) {
        new Signup2("");
    }
}
