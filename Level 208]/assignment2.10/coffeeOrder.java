import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;



public class coffeeOrder extends JFrame implements ActionListener
{
   JCheckBox cb1,cb2,cb3,cb4,cb5;
   JLabel l;
   JButton b;
   JFrame f;
   void order()
   {
    final Color Dark_RED= new Color(255,0,255);
    f = new JFrame();
    f.getContentPane().setBackground(Dark_RED);
    l = new JLabel("Coffee Ordering System");
    l.setBounds(100,100,500,20);
    cb1= new JCheckBox("Vanilla Latte @ 8");
    cb1.setBounds(100,100,150,20);
    cb2= new JCheckBox("French Vanilla @ 7");
    cb2.setBounds(100,150,150,20);
    cb3= new JCheckBox("Caramel Iced Capp @ 13");
    cb3.setBounds(100,200,150,20);
    cb4 = new JCheckBox("Espresso with 2 Cream @ 9");
    cb4.setBounds(100,250,150,20);
    cb5 = new JCheckBox("Strawberry Iced Capp @ 12");
    cb5.setBounds(100,300,150,20);
    b= new JButton("Order");
    b.setBounds(100,350,80,30);
    b.addActionListener(this);
    f.add(l);f.add(b);f.add(cb1);f.add(cb2);f.add(cb3);
    f.add(cb4);f.add(cb5);
    f.setSize(900,900);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
   }
   public void actionPerformed(ActionEvent e)
   {
       float amount=0;
       String msg="";
       if(cb1.isSelected()){
           amount += 8;
           msg+="Vanilla latte: 8\n";
       }
       if(cb2.isSelected())
       {
           amount += 7;
           msg += "French Vanilla:7\n";
       }
       if(cb3.isSelected())
       {
           amount += 13;
           msg += "Caramel Iced Capp:13\n";
       }
       if(cb4.isSelected())
       {
           amount += 9;
           msg += "Espresso with 2 cream:9\n";
       }
       if(cb5.isSelected())
       {
           amount += 12;
           msg += "Strawberry Iced Capp:12\n";
       }
       msg += "--------------------\n";
       JOptionPane.showMessageDialog(this,msg+"Total: " +amount);
   }
   public static void main()
   {
       coffeeOrder ob = new coffeeOrder();
       ob.order();
   }
    }

    
