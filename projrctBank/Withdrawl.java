package projrctBank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    JTextField amount;
    JButton withdrawal,back;
    String pinnumber;
    public Withdrawl(String pinnumber)  {
        this.pinnumber=pinnumber;
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);

        amount =new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);

        withdrawal=new JButton("Withdraw");
        withdrawal.setBounds(355,485,150,30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);


        back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);


        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==withdrawal){
            String number=amount.getText();
            Date date=new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter thr amount you want to withdraw");
            }
            else {
                try{
                    Conn conn=new Conn();
                    String query="insert into bank values('"+pinnumber +"','"+ date +"','withdrawal','"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs "+number+" Withdraw Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                catch (Exception ea){
                    System.out.println(ea);
                }

            }
        } else if (e.getSource()==back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }



}

