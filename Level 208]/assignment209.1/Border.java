import javax.swing.*;
import java.awt.*;
import java.awt.Color; 

public class Border extends assignment
{
    JFrame f;
  Border(){
      ImageIcon up = new ImageIcon("up.png");
    ImageIcon south = new ImageIcon("south.png");
    ImageIcon west = new ImageIcon("west.png");
    ImageIcon east = new ImageIcon("east.png");
    ImageIcon center = new ImageIcon("center.png");
      f = new JFrame();
      f.getContentPane().setBackground(Color.RED);
      JButton b1 = new JButton(up);
      JButton b2 = new JButton(south);
      JButton b3 = new JButton(west);
      JButton b4 = new JButton(east);
      JButton b5 = new JButton(center);
      
      f.add(b1,BorderLayout.NORTH);
      f.add(b2,BorderLayout.SOUTH);
      f.add(b3,BorderLayout.EAST);
      f.add(b4,BorderLayout.WEST);
      f.add(b5,BorderLayout.CENTER);
      
      f.setSize(600,600);
      f.setVisible(true);
  }
  public static void main(String[] args){
      new Border();
  }
  
}
