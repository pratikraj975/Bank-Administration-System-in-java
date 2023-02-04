package projrctBank;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField PanTextField, aadharnoTextField;
    JButton next,previous;
    JRadioButton syes,sno,eyes,eno;
    JDateChooser dateChooser;
    JComboBox religion,category,occupation,education,income;
    String formno;
    SignupTwo(String formno) {
this.formno=formno;
        setLayout(null);

setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");




        JLabel addtionalDetails=new JLabel("Page 2: Addtional Details");
        addtionalDetails.setFont(new Font("Railway",Font.BOLD,23));
        addtionalDetails.setBounds(290,80,400,30);
        add(addtionalDetails);

        JLabel lreligion=new JLabel("Religion:");
        lreligion.setFont(new Font("Railway",Font.BOLD,20));
        lreligion.setBounds(100,140,100,30);
        add(lreligion);

        String valreligion[]={"Other","Hindu","Muslim","Sikh","Christian"};
    religion=new JComboBox<>(valreligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.white);
        add(religion);



        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valcategory[]={"Other","General","OBC","SC","ST"};
    category=new JComboBox<>(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);



        JLabel dob=new JLabel("Income:");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String valincome[]={"Null","<1,50,000","<2,50,0000","<5,00,000","upto 10,00,000"};
        income=new JComboBox<>(valincome);
        income.setBounds(300,240,400,30);
        category.setBackground(Color.white);
        add(income);



        JLabel gender=new JLabel("Educational");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);


        JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,312,200,30);
        add(email);

        String valeducation[]={ "Other","Non-Graduation","Graduate","Post Graduation","Doctrate"};
        education=new JComboBox<>(valeducation);
        education.setBounds(300,300,400,30);
        education.setBackground(Color.white);
        add(education);



        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100,360,200,30);
        add( marital);

        String valoccupation[]={ "Other","Salaried","Self-Employed","Bussiness","Retired"};
       occupation=new JComboBox<>(valoccupation);
        occupation.setBounds(300,360,400,30);
        occupation.setBackground(Color.white);
        add(occupation);

;
        JLabel address=new JLabel("Pan Number:");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add( address);

        PanTextField =new JTextField();
        PanTextField.setFont(new Font("Raleway:",Font.BOLD,14));
        PanTextField.setBounds(300,440,400,30);
        add(PanTextField);

        JLabel city=new JLabel("Aadhar Number:");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add( city);

        aadharnoTextField =new JTextField();
        aadharnoTextField.setFont(new Font("Raleway:",Font.BOLD,14));
        aadharnoTextField.setBounds(300,490,400,30);
        add( aadharnoTextField);

        JLabel state=new JLabel("Senior Citizens:");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add( state);

      syes =new JRadioButton("Yes");
        // married.setFont(new Font("Railway",Font.BOLD,20));
        syes.setBounds(300,540,80,30);
        add( syes);

        sno=new JRadioButton("No");
        // unmarried.setFont(new Font("Railway",Font.BOLD,20));
        sno.setBounds(620,540,80,30 );
        add(sno);

        ButtonGroup seniorctzn=new ButtonGroup();
        seniorctzn.add(syes);
        seniorctzn.add(sno);


        JLabel pincode=new JLabel("Existing Account:");
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);


        eyes =new JRadioButton("Yes");
        // married.setFont(new Font("Railway",Font.BOLD,20));
        eyes.setBounds(300,590,80,30);
        add( eyes);

        eno=new JRadioButton("No");
        // unmarried.setFont(new Font("Railway",Font.BOLD,20));
        eno.setBounds(620,590,80,30 );
        add(eno);

        ButtonGroup existingacnt=new ButtonGroup();
        existingacnt.add(eyes);
        existingacnt.add(eno);


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

            String sreligion= (String) religion.getSelectedItem();
            String scategory=(String) category.getSelectedItem();
            // String dob=dateChooser.getDateFormatString();
            String sincome=(String)income.getSelectedItem();
            String seducation=(String)education.getSelectedItem();
            String soccupation=(String)occupation.getSelectedItem();
            String seniorctzn=null;
            if(syes.isSelected()){
                seniorctzn="Male";
            }
            else if (sno.isSelected()){
               seniorctzn="Female";
            }

            String existingacnt=null;
            if(eyes.isSelected()){
                existingacnt="Married";
            } else if (eno.isSelected()) {
               existingacnt="Unmarried";
            }


            String span=PanTextField.getText();
            String saadhar= aadharnoTextField.getText();




            try{
                if(span.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Pan No.");
                } else if (saadhar.equals("")) {
                    JOptionPane.showMessageDialog(null,"Please enter Aadhar NO.");
//                } else if (dob.equals("")) {
//                    JOptionPane.showMessageDialog(null,"Please enter Date of birth");
//                } else if (gender.equals("")) {
//                    JOptionPane.showMessageDialog(null,"Please select gender");
//
               }
                    else {
                    Conn c=new Conn();
                    String query="insert into signuptwo  values('"+formno +"','" +sreligion+"','" +scategory  +"','"+sincome+"','"+seducation+"','"+soccupation +"','"+span+"','"+saadhar+"','"+seniorctzn+"','"+existingacnt+"')" ;
                    c.s.executeUpdate(query);
                }
//Signup3 object
                setVisible(false);
                    new SignupThree(formno).setVisible(true);
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
        new SignupTwo("");
    }


}



