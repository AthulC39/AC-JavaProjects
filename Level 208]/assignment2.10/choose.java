import javax.swing.JRadioButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;


public class choose extends JFrame implements ActionListener
{
   JRadioButton rb1,rb2,rb3;
   JButton b;
   JFrame f;f.add
   void create_radiobutton()
   {
       rb1= new JRadioButton("Java");
       rb1.setBounds(100,50,100,30);
       rb2= new JRadioButton("Python");
       rb2.setBounds(100,100,100,30);
       rb3= new JRadioButton("C#");
       rb3.setBounds(100,150,100,30);
       ButtonGroup bg = new ButtonGroup();
       bg.add(rb1);bg.add(rb2);bg.add(rb3);
       b = new JButton("choose");
       b.setBounds(100,150,80,30);
       b.addActionListener(this);
       add(rb1);add(rb2);add(rb3);add(b);
       setSize(600,600);
       setLayout(null);
       setVisible(true);
   }
   public void actionPerformed(ActionEvent e){
       if(rb1.isSelected()){
           JOptionPane.showMessageDialog(this,"You Selected Java");
       }
       if(rb2.isSelected()){
           JOptionPane.showMessageDialog(this,"You Selected Python");
       }
       if(rb3.isSelected()){
           JOptionPane.showMessageDialog(this,"You Selected C#");
       }
   }
   public static void main(String args[])
   {
       choose ob = new choose();
       ob.create_radiobutton();
   }
}
