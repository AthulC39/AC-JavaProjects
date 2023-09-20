import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color; 

public class grid extends assignment
{
 JFrame f;
 JLabel i1;
 grid(){
     f = new JFrame();
     f.getContentPane().setBackground(Color.RED);
         ImageIcon r1 = new ImageIcon("a.png");
        ImageIcon r2 = new ImageIcon("b.png");
     
        ImageIcon r3 = new ImageIcon("c.png");
        ImageIcon r4 = new ImageIcon("d.png");
        ImageIcon r5 = new ImageIcon("e.png");
        ImageIcon r6 = new ImageIcon("f.png");
        ImageIcon r7 = new ImageIcon("g.png");
        ImageIcon r8 = new ImageIcon("h.png");
        ImageIcon r9 = new ImageIcon("i.png");
        
        
       // r1 = new JLabel(on);
        JLabel fr = new JLabel(r1);
        
       // fr.setBounds(300,300,150,100);
       // r2 = new JLabel(r2);
       // r3 = new JLabel(r3);
       // r4 = new JLabel(r4);
     //  r5 = new JLabel(r5);
        //r6 = new JLabel(r6);
      // r7 = new JLabel(r7);
       //r8 = new JLabel(r8);
      // r9 = new JLabel(r9);
    
    f.add(fr); // f.add(r2);  f.add(r3);  f.add(r4);  f.add(r5);  f.add(r6);
      //f.add(r7);  f.add(r8);  f.add(r9);
      f.setLayout(new GridLayout(3,3));
      f.setSize(600,600);
      f.setVisible(true);
 }
 public static void main(String[] args) {
     new grid();
 }
}
