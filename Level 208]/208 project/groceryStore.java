import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JOptionPane;

public class groceryStore extends JFrame implements ActionListener
{
   JFrame f = new JFrame("Swing Groceries Online Ordering!");
   JPanel panelCont = new JPanel();
   JPanel panelFirst = new JPanel();
   JPanel panelSecond = new JPanel();
   JButton buttonOne = new JButton("Browse Dairy and Grain options");
   JButton buttonTwo = new JButton("Browse Meat options");
   CardLayout cl = new CardLayout();
   JLabel h,k,title,name,cleaning,filling,canal,discounts,a,b,c;
   JRadioButton rb1,rb2,rb3,rb4,rb5,rb6;
   JTextField tf1,tf2,tf3;
   JCheckBox cb1,cb2,cb3,cb4;
   JButton b1;
   public groceryStore() {
       
       panelCont.setLayout(cl);
       h = new JLabel("panel 1");
       h.setBounds(200,10,150,20);
       k= new JLabel("panel 2");
       k.setBounds(200,10,150,20);
       panelFirst.add(buttonOne);
       panelSecond.add(buttonTwo);
       panelFirst.add(h);
       panelSecond.add(k);
       //panelCont.add(panelFirst,"1");
       //panelCont.add(panelSecond,"2");
      //cl.show(panelCont,"1");
       f.add(panelCont);
       f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       f.pack();
       f.setVisible(true);
       f.setLayout(null);
       f.setSize(600,600);
       buttonOne.addActionListener(this);
       buttonTwo.addActionListener(this);
       
       title=new JLabel("Order Page");
       title.setFont(new Font("Serif", Font.BOLD, 24));
       title.setBounds(140,10,150,30);
       name = new JLabel("Customer name: ");
       name.setBounds(50,50,150,30);
       tf1 = new JTextField("Enter Name Here");
       tf1.setBounds(300,50,150,30);
       rb1 = new JRadioButton("Apples (per lb)");
       rb1.setBounds(50,100,150,30);
       cleaning = new JLabel("$1");
       cleaning.setBounds(300,100,150,30);
       rb2 = new JRadioButton("Avocado(6 pieces)");
       rb2.setBounds(50,150,150,30);
       filling = new JLabel("$1.22");
       filling.setBounds(300,150,150,30);
       rb3 = new JRadioButton("Chicken(Breast)");
       rb3.setBounds(50,200,150,30);
       canal = new JLabel("$11");
       canal.setBounds(300,200,150,30);
       rb4 = new JRadioButton("Milk (1 bag)");
       rb4.setBounds(50,250,150,30);
       a = new JLabel("$9");
       a.setBounds(300,250,150,30);
       rb5 = new JRadioButton("Beef (1 lb)");
       rb5.setBounds(50,300,150,30);
       b = new JLabel("$5.50");
       b.setBounds(300,300,150,30);
       rb6 = new JRadioButton("Onion (1 lb)");
       rb6.setBounds(50,350,150,30);
       c = new JLabel("$2.50");
       c.setBounds(300,350,150,30);
       
       
       discounts = new JLabel("Discounts");
       discounts.setBounds(50,380,130,30);
       
       cb1 = new JCheckBox("Family Discount 5% off");
       cb1.setBounds(60,400,180,30);
       cb2= new JCheckBox("Holiday Special 25% off");
       cb2.setBounds(60,430,180,30);
       cb3= new JCheckBox("No Discounts");
       cb3.setBounds(60,460,130,30);
       
       b1= new JButton("Compute Total");
       b1.setBounds(100,490,130,30);
       b1.addActionListener(this);
       f.getContentPane().setBackground(new java.awt.Color(204, 166, 166));
       tf3= new JTextField("--------------------------------------");
       tf3.setBounds(300,490,130,30);
       
       f.add(title);f.add(tf1);f.add(name);f.add(rb1);f.add(cleaning);
       f.add(rb1);f.add(rb2);f.add(rb3);f.add(filling);f.add(canal);
       f.add(rb4);f.add(cb1);f.add(cb2);f.add(cb3);f.add(discounts);
       f.add(tf3);f.add(b1);f.add(a);f.add(rb5);f.add(b);f.add(rb6);f.add(c);
   }
   public void actionPerformed(ActionEvent e) 
   {
       float amount=0;
       String msg="";
      
        if(rb1.isSelected()){
           amount +=1;
           msg += "Apples 1lb: 1 \n";
       }
        if(rb2.isSelected()){
           amount +=1.22;
           msg += "Avocado 6pcs: 1.22 \n";
       }
        if(rb3.isSelected()){
           amount +=11;
           msg += "Chicken Breast: 11 \n";
       }
        if(rb4.isSelected()){
           amount +=9;
           msg += "Milk (1 bag): 9 \n";
       }
        if(rb5.isSelected()){
           amount +=5.50;
           msg += "Beef (1lb): 5.50 \n";
       }
        if(rb6.isSelected()){
           amount +=2.50;
           msg += "Onion (1lb): 2.5 \n";
       }
       if(cb1.isSelected()){
         amount -= (amount*0.05);
       }
       if(cb2.isSelected()){
         amount -= (amount*0.25);
       }
      tf3.setText(String.valueOf(amount));
      JOptionPane.showMessageDialog(this,msg+"Total: " +amount);
   }
     public static void main(String args[])
    {
        groceryStore ob = new groceryStore();
        
        new groceryStore();
    }   
    }    
    

 
