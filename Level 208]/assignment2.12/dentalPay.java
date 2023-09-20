import javax.swing.JCheckBox;
import javax.swing.JLayer;
import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class dentalPay extends JFrame implements ActionListener
{
    JCheckBox cb1,cb2,cb3,cb4;
   JLayer l;
   JButton b1;
   JLabel title,name,cleaning,filling,canal,other,discounts;
   JFrame f;
   JRadioButton rb1,rb2,rb3,rb4,rb5;
   JTextField tf1,tf2,tf3;
   
   void form()
   {
       f= new JFrame();
       title=new JLabel("Dental Payment Form");
       title.setBounds(200,10,150,30);
       name = new JLabel("Patient name: ");
       name.setBounds(50,50,150,30);
       tf1 = new JTextField("Enter Name Here");
       tf1.setBounds(140,50,150,30);
       rb1 = new JRadioButton("Cleaning");
       rb1.setBounds(50,100,150,30);
       cleaning = new JLabel("$65");
       cleaning.setBounds(300,100,150,30);
       rb2 = new JRadioButton("Cavity Filling");
       rb2.setBounds(50,150,150,30);
       filling = new JLabel("$200");
       filling.setBounds(300,150,150,30);
       rb3 = new JRadioButton("Root Canal");
       rb3.setBounds(50,200,150,30);
       canal = new JLabel("$250");
       canal.setBounds(300,200,150,30);
       rb4 = new JRadioButton("Other");
       rb4.setBounds(50,250,150,30);
       tf2= new JTextField("$");
       tf2.setBounds(300,250,120,30);
       rb5 = new JRadioButton("Other");
       rb5.setBounds(50,250,120,30);
       
       discounts = new JLabel("Discounts");
       discounts.setBounds(50,300,130,30);
       
       cb1 = new JCheckBox("Holiday 15% off");
       cb1.setBounds(60,330,130,30);
       cb2= new JCheckBox("Special 25% off");
       cb2.setBounds(60,360,130,30);
       cb3= new JCheckBox("No Discounts");
       cb3.setBounds(60,390,130,30);
       
       b1= new JButton("Compute Total");
       b1.setBounds(100,450,130,30);
       b1.addActionListener(this);
       
       tf3= new JTextField("--------------------------------------");
       tf3.setBounds(300,450,130,30);
       
       f.add(title);f.add(tf1);f.add(name);f.add(rb1);f.add(cleaning);
       f.add(rb1);f.add(rb2);f.add(rb3);f.add(filling);f.add(canal);
       f.add(tf2);f.add(rb5);f.add(cb1);f.add(cb2);f.add(cb3);f.add(discounts);
       f.add(tf3);f.add(b1);
       f.setSize(600,700);
       f.setLayout(null);
       f.setVisible(true);
        
   }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1)
        {
            int total=0;
            if(rb1.isSelected())
            {
                total += 65;
            }
             if (rb2.isSelected())
            {
               total += 200; 
            }
            if (rb3.isSelected())
            {
             total += 250;
            }
            if (rb4.isSelected()||rb5.isSelected())
            {
                total += Integer.parseInt(tf2.getText());
            }
             if(cb1.isSelected())
            {
                total -= (total *= 0.15);
            }
             if(cb2.isSelected())
            {
                total -= (total *= 0.25);
            }
            if(cb3.isSelected())
            {
                total += 0;
            }
            tf3.setText(String.valueOf(total));
        }
    }
    public static void main(String args[])
    {
        dentalPay ob = new dentalPay();
        ob.form();
    }
}
