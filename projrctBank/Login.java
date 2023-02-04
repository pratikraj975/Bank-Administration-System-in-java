package projrctBank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
JButton login,clear,signup;
  JTextField cardtextfield;
  JPasswordField pintextfield;
Login(){

    setTitle("Automated teller machine");
    setLayout(null);
  ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
  Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
  ImageIcon i3=new ImageIcon(i2);
    JLabel label=new JLabel(i3);
    label.setBounds(70,10,100,100);
    add(label);


    JLabel text =new JLabel("Welcome to ATM");
    text.setFont(new Font("osward",Font.BOLD,38));
    text.setBounds(200,40,400,40);

    JLabel cardno =new JLabel("Card No.");
    cardno.setFont(new Font("railway ",Font.BOLD,28));
    cardno.setBounds(120,150,150,30);
    add(cardno);

   cardtextfield=new JTextField();
    cardtextfield.setBounds(300,150,250,30);
    cardtextfield.setFont(new Font("Arial",Font.BOLD,14));
    add(cardtextfield);

    JLabel pin=new JLabel("PIN");
    pin.setFont(new Font("Railway",Font.BOLD,28));
    pin.setBounds(120,220,230,40);
    add( pin);

   pintextfield=new JPasswordField();
    pintextfield.setBounds(300,220,230,30);
  pintextfield.setFont(new Font("Arial",Font.BOLD,14));
    add(pintextfield);

   login =new JButton("Sign In");
    login.setBounds(300,300,100,30);
     login.setBackground(Color.black);
     login.setForeground(Color.BLUE);
     login.addActionListener(this);
    add(login);

  clear =new JButton("Clear");
    clear.setBounds(430 ,300,100,30);
    clear.setBackground(Color.black);
    clear.setForeground(Color.BLUE);
  clear.addActionListener(this);
    add(clear);

   signup =new JButton("Sign Up");
    signup.setBounds(300 ,350,230,30);
    signup.setBackground(Color.black);
    signup.setForeground(Color.BLUE);
signup.addActionListener(this);
    add(signup);



    getContentPane().setBackground(Color.LIGHT_GRAY);
    setSize(800,480);
    setVisible(true);
    setLocation(350,100);
}
  @Override
  public void actionPerformed(ActionEvent ae) {
if (ae.getSource() ==clear){
   cardtextfield.setText("");
   pintextfield.setText("");
} else if (ae.getSource()==login) {
  Conn conn=new Conn();
  String cardnumber=cardtextfield.getText();
  String pinnumber=pintextfield.getText();
  String query= "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
  try{
 ResultSet rs =conn.s.executeQuery(query);

 if (rs.next()){
     setVisible(false);
     new Transactions(pinnumber).setVisible(true);
 }
 else {
     JOptionPane.showMessageDialog(null,"Incorrect card Number or Pin number");
 }

  }catch (Exception ea ){
      System.out.println(ea);
  }
} else if (ae.getSource()==signup) {
  setVisible(false);
  new SignpOne().setVisible(true);
}
  }



    public static void main(String[] args) {

        new Login();
    }


}







