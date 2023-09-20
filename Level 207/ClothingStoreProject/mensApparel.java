import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class mensApparel extends GUI implements ActionListener
{
  JFrame frame = new JFrame();
  JButton TopsB = new JButton("Tops");
  mensApparel(){
      
      TopsB.setBounds(100,150, 300,300);
      TopsB.setFocusable(false);
      TopsB.addActionListener(this);
      
      frame.add(TopsB);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,600);
      frame.setLayout(null);
      frame.setVisible(false);
      
  }
  public static void main(String[] args) {
        new mensApparel();
        // mensApparel MensApparel = new mensApparel(); 
    }
  public void actionPerformed(ActionEvent e){
      if(e.getSource()==TopsB)
      {
          frame.dispose();
          mensApparelW MensApparelW = new mensApparelW();
      }
  }
}
