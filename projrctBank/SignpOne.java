package projrctBank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignpOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next,previous;
    JRadioButton male,female,others,married,unmarried,other;
    JDateChooser dateChooser;

     SignpOne() {

         setLayout(null);

         Random ran =new Random();
        random=((Math.abs(ran.nextLong()%9000L) +1000L) );


         JLabel formno=new JLabel("APPLICATION FORM NO. " +random);
         formno.setFont(new Font("Railway",Font.BOLD,38));
         formno.setBounds(140,20,600,40);
         add(formno);

         JLabel personalDetails=new JLabel("Page 1: Personal Details");
         personalDetails.setFont(new Font("Railway",Font.BOLD,23));
         personalDetails.setBounds(290,80,400,30);
         add(personalDetails);

         JLabel name=new JLabel("Name:");
         name.setFont(new Font("Railway",Font.BOLD,20));
         name.setBounds(100,140,100,30);
         add(name);

         nameTextField =new JTextField();
         nameTextField.setFont(new Font("Raleway:",Font.BOLD,14));
         nameTextField.setBounds(300,140,400,30);
         add(nameTextField);

         JLabel fname=new JLabel("Father's Name:");
         fname.setFont(new Font("Railway",Font.BOLD,20));
         fname.setBounds(100,190,200,30);
         add(fname);

     fnameTextField =new JTextField();
       fnameTextField.setFont(new Font("Raleway:",Font.BOLD,14));
       fnameTextField.setBounds(300,190,400,30);
       add(fnameTextField);

         JLabel dob=new JLabel("Date of Birth:");
         dob.setFont(new Font("Railway",Font.BOLD,20));
         dob.setBounds(100,240,200,30);
         add(dob);

       dateChooser=new JDateChooser();
      dateChooser.setBounds(300,240,400,30);
      dateChooser.setFont(new Font("Railway",Font.BOLD,20));
      add(dateChooser);

         JLabel gender=new JLabel("Gender:");
         gender.setFont(new Font("Railway",Font.BOLD,20));
         gender.setBounds(100,290,200,30);
         add(gender);

       male =new JRadioButton("Male");
       //male.setFont(new Font("Railway",Font.BOLD,20));
      male.setBounds(300,290,100,30);
      add(male);

      female=new JRadioButton("Female");
       //female.setFont(new Font("Railway",Font.BOLD,20));
      female.setBounds(450,290,100,30 );
      add(female);

       others=new JRadioButton("Others");
       //others.setFont(new Font("Railway",Font.BOLD,20));
       others.setBounds(600,290,100,30 );
       add(others);

      ButtonGroup gendergroup=new ButtonGroup();
      gendergroup.add(male);
      gendergroup.add(female);
      gendergroup.add(others);

         JLabel email=new JLabel("Email Address:");
         email.setFont(new Font("Railway",Font.BOLD,20));
         email.setBounds(100,340,200,30);
         add(email);

       emailTextField =new JTextField();
       emailTextField.setFont(new Font("Raleway:",Font.BOLD,14));
       emailTextField.setBounds(300,340,400,30);
       add(emailTextField);

         JLabel marital=new JLabel("Marital Status:");
         marital.setFont(new Font("Railway",Font.BOLD,20));
         marital.setBounds(100,390,200,30);
         add( marital);


       married =new JRadioButton("Married");
      // married.setFont(new Font("Railway",Font.BOLD,20));
       married.setBounds(300,390,100,30);
       add(married);

        unmarried=new JRadioButton("Unmarried");
      // unmarried.setFont(new Font("Railway",Font.BOLD,20));
       unmarried.setBounds(450,390,100,30 );
       add(unmarried);

       other=new JRadioButton("Other");
       //other.setFont(new Font("Railway",Font.BOLD,20));
       other.setBounds(600,390,100,30 );
       add(other);

       ButtonGroup maritalgroup=new ButtonGroup();
       maritalgroup.add(married);
       maritalgroup.add(unmarried);
       maritalgroup.add(other);

       JLabel address=new JLabel("Address:");
       address.setFont(new Font("Railway",Font.BOLD,20));
       address.setBounds(100,440,200,30);
       add( address);

       addressTextField =new JTextField();
       addressTextField.setFont(new Font("Raleway:",Font.BOLD,14));
       addressTextField.setBounds(300,440,400,30);
       add(addressTextField);

       JLabel city=new JLabel("City:");
       city.setFont(new Font("Railway",Font.BOLD,20));
       city.setBounds(100,490,200,30);
       add( city);

      cityTextField =new JTextField();
       cityTextField.setFont(new Font("Raleway:",Font.BOLD,14));
       cityTextField.setBounds(300,490,400,30);
       add(cityTextField);

       JLabel state=new JLabel("State:");
       state.setFont(new Font("Railway",Font.BOLD,20));
       state.setBounds(100,540,200,30);
       add( state);

      stateTextField =new JTextField();
       stateTextField.setFont(new Font("Raleway:",Font.BOLD,14));
       stateTextField.setBounds(300,540,400,30);
       add(stateTextField);

       JLabel pincode=new JLabel("Pin code:");
       pincode.setFont(new Font("Railway",Font.BOLD,20));
       pincode.setBounds(100,590,200,30);
       add(pincode);

     pincodeTextField =new JTextField();
       pincodeTextField.setFont(new Font("Raleway:",Font.BOLD,14));
       pincodeTextField.setBounds(300,590,400,30);
       add(pincodeTextField);

        previous=new JButton("Previous");
       previous.setBackground(Color.BLACK);
       previous.setForeground(Color.white);
       previous.setFont(new Font("Raleway:",Font.BOLD,14));
       previous.setBounds(100,660,100,30);
       previous.addActionListener(this);
       add(previous);

       next=new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.white);
       next.setFont(new Font("Raleway:",Font.BOLD,14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       add(next);

         getContentPane().setBackground(Color.PINK);

       setSize(850,800);
       setLocation(350,10);
       setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==next){
    String formno=""+random;
    String name=nameTextField.getText();
    String fname=fnameTextField.getText();
   // String dob=dateChooser.getDateFormatString();
    String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(male.isSelected()){
        gender="Male";
    }
    else if (female.isSelected()){
        gender="Female";
    }
    else{
        gender="Others";
    }
    String marital=null;
    if(married.isSelected()){
        marital="Married";
    } else if (unmarried.isSelected()) {
        marital="Unmarried";
    }
    else {
        marital="Other";
    }
    String email=emailTextField.getText();
    String address=addressTextField.getText();
    String city=cityTextField.getText();
    String state=stateTextField.getText();
    String pin=""+pincodeTextField.getText();



    try{
        if(name.equals("")){
 JOptionPane.showMessageDialog(null,"Please enter the name");
        } else if (fname.equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter father's name");
        } else if (dob.equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter Date of birth");
        } else if (gender.equals("")) {
          JOptionPane.showMessageDialog(null,"Please select gender");
        } else if (marital.equals("")) {
          JOptionPane.showMessageDialog(null,"Please select marital");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter email");
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter address");
        } else if (city.equals("")) {
          JOptionPane.showMessageDialog(null,"Please enter city");
        } else if (state.equals("")) {
           JOptionPane.showMessageDialog(null,"Please enter state");
        } else if (pin.equals("")) {
         JOptionPane.showMessageDialog(null,"Please enter pincode");
        } else {
            Conn c=new Conn();
            String query="insert into signup  values('"+formno +"','" +name+"','" +fname  +"','"+dob+"','"+gender+"','"+email +"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')" ;
      c.s.executeUpdate(query);

      setVisible(false);
      new SignupTwo(formno).setVisible(true);
        }

    }catch (Exception ea){
        System.out.println(ea);
    }


}
else if (e.getSource()==previous) {
    setVisible(false);
    new Login().setVisible(true);
}

     }

    public static void main(String[] args) {
        new SignpOne();
    }


}
