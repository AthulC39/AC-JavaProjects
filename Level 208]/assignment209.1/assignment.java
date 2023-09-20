import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color; 
import javax.swing.*;

public class assignment extends JFrame implements ActionListener
{ 
    JButton b1,b2,b3;
    void assignment()
    {
        JFrame f = new JFrame();
        JPanel j = new JPanel();
       f.getContentPane().setBackground(Color.RED);
        JButton b1 = new JButton("Grid");
        b1.setBounds(50,100,100,100);
        JButton b2 = new JButton("Flow");
        b2.setBounds(250,100,100,100);
        JButton b3 = new JButton("Border");
        b3.setBounds(450,100,100,100);
        f.setSize(600,600);
        f.setVisible(true);
        f.setLayout(null);
        f.add(b1);
        f.add(b2);
       f.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
     public void actionPerformed(ActionEvent e){
      
        }
        
    public static void main(String[] args){
        assignment ob = new assignment();
        ob.assignment();
    }
     
}
