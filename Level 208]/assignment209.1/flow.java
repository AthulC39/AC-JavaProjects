import javax.swing.*;
import java.awt.*;
import java.awt.Color; 

public class flow extends assignment
{
    JFrame f;
    flow(){
        f=new JFrame();
    ImageIcon s1 = new ImageIcon("i1.png");
    ImageIcon s2 = new ImageIcon("i2.png");
    ImageIcon s3 = new ImageIcon("i3.png");
    ImageIcon s4 = new ImageIcon("i4.png");
    ImageIcon s5 = new ImageIcon("i5.png");
        f.getContentPane().setBackground(Color.RED);
        JButton b1 = new JButton(s1);
        JButton b2 = new JButton(s2);
        JButton b3 = new JButton(s3);
        JButton b4 = new JButton(s4);
        JButton b5 = new JButton(s5);
        f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
        f.setLayout(new FlowLayout());
        f.setSize(600,600);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new flow();
    }
    
    
       }

   

