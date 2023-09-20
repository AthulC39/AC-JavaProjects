import javax.swing.JFrame;
import javax.swing.JLabel;


public class mensApparelW
{
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Sleevless Polo");
    mensApparelW(){
        
        label.setBounds(100,100,100,100);
       // label.setFont(new Font(null,Font.PLAIN,25));
        frame.add(label);
        
        
        
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,600);
      frame.setLayout(null);
      frame.setVisible(true);
      
    }
}
