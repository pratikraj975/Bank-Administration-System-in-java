package projrctBank;

import javax.accessibility.AccessibleRelationSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JButton back;
    String pinnumber;
    public BalanceEnquiry(String pinnumber) {
        this.pinnumber=pinnumber;
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
ImageIcon i3= new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(0,0,900,900);
add(image);

back=new JButton("BACK");
back.setBounds(355,520,150,30);
back.addActionListener(this);
image.add(back);




        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);

        Conn c=new Conn();
        int balance=0;
        try {
            ResultSet rs =c.s.executeQuery("select * from bank where pin ='"+pinnumber+"' ");

            while (rs.next()){
                if (rs.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(rs.getString("amount"));
                }
                else{
                    balance-=Integer.parseInt(rs.getString("amount"));
                }

            }

        }catch (Exception ea){
            System.out.println(ea);
        }
        JLabel text=new JLabel("Your current Account Balance is Rs "+ balance);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.BOLD,15));
        text.setBounds(170,300,400,30);
        image.add(text);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
setVisible(false);
new Transactions(pinnumber).setVisible(true);

    }


    public static void main(String[] args) {
        new BalanceEnquiry("");
    }


}
