import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JLabel;

public class guessingGame implements ActionListener
{
     JTextField t1;
      JLabel l1,l2,l3;
      JButton b1;
      ImageIcon image = new ImageIcon("guess.png");
      int min=1;
      int max=10;
  guessingGame()
  {
      JFrame f = new JFrame("Guessing Game");
      l3 = new JLabel(image);
      l2= new JLabel("");
      l2.setBounds(600,400,200,90);
      t1 = new JTextField("");
      t1.setBounds(300,400,100,90);
      l1= new JLabel("Enter a number 1-10:");
      l1.setBounds(100,400,300,90);
      b1 = new JButton("Guess");
      b1.setBounds(300,500,100,90);
      b1.addActionListener(this); 
      f.add(t1);f.add(l1);f.add(b1);f.add(l2);
      f.setLayout(null);
      f.setVisible(true);
      f.setSize(900,900);
  }
  public void actionPerformed(ActionEvent e)
  {
      int random = (int)Math.floor(Math.random()*(max-min+1)+min);
      String s1=t1.getText();
      int a=Integer.parseInt(s1);
      if(e.getSource()==b1)
      {
          if(a==random)
          {
              l2.setText("Nice! You got it!");
              
          }
          else
          {
              l2.setText("Not quite, try again!");
          }
      }
      
  }
  public static void main(String args[])
  
  {
      new guessingGame();
      
  }
}
