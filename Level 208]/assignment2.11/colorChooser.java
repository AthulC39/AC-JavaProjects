import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.*;


public class colorChooser extends JFrame implements ActionListener
{
   JCheckBox cb1,cb2,cb3,cb4,cb5;
   JLabel l;
   JButton b1,b2,b3,b4,b5;
   JFrame f;
   void order()
   {
    //final Color Dark_RED= new Color(255,0,255);
    Image icon = Toolkit.getDefaultToolkit().getImage("C://Users//ATHUL//Downloads");
    f.setIconImage(icon);
    Icon icon2 = new ImageIcon("C:\\Users\\ATHUL\\Downloads");
    Icon icon3 = new ImageIcon("C:\\Users\\ATHUL\\Downloads");
    Icon icon4 = new ImageIcon("C:\\Users\\ATHUL\\Downloads");
    Icon icon5 = new ImageIcon("C:\\Users\\ATHUL\\Downloads");
    
    
    
    f = new JFrame();
    l = new JLabel("Color Chooser");
    l.setBounds(100,50,150,30);
    b1= new JButton(icon2);
    b1.setBounds(100,180,80,30);
    b2= new JButton(icon3);
    b2.setBounds(200,180,80,30);
    b3= new JButton(icon4);
    b3.setBounds(100,250,80,30);
    b4= new JButton(icon5);
    b4.setBounds(200,250,80,30);
    b5 = new JButton("Change Bg color");
    b5.setBounds(100,100,185,50);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(l);
    f.setSize(900,900);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
   }
   public void actionPerformed(ActionEvent e)
   {
       
    
       if(e.getSource() == b5)
       {
           Color initialcolor = Color.RED;
       Color color = JColorChooser.showDialog(this,"Select a color",initialcolor);
              f.getContentPane().setBackground(color);
       }
       if(e.getSource() == b1)
       {
          l.setForeground(Color.RED);
       }
        if(e.getSource() == b2)
       {
           l.setForeground(Color.BLUE);
       }
        if(e.getSource() == b3)
       {
           l.setForeground(Color.GREEN);
       }
        if(e.getSource() == b4)
       {
           l.setForeground(Color.YELLOW);
       }
      
       }
        public static void main()
   {
       colorChooser ob = new colorChooser();
       ob.order();
    //new ToolkitExample();
   }

   }
  

    
