import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Image;


public class password implements ActionListener
{
    JTextField tf1,tf2,tf3;
    JButton b1;
    JLabel l1,l2,l3,l4;
    boolean passt;
    JPasswordField value1,value2;
    String user[]={"coders","athulc","google1"};
    String pass[]={"jcc","2005","lpage"};
    ImageIcon image = new ImageIcon("google.png");
    Image img= image.getImage();
    Image newimg = img.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
    ImageIcon newIcon = new ImageIcon(newimg);
    password()
    {
        JFrame f = new JFrame("Gmail Login");
        l4 = new JLabel(newIcon);
        l1= new JLabel("Username: ");
        l1.setBounds(50,200,160,20);
        l3 = new JLabel("Password: ");
        l3.setBounds(50,260,160,20);
        l2= new JLabel();
        l2.setBounds(50,400,300,30);
        value1 = new JPasswordField();
        value1.setBounds(50,220,100,30);
        value2 = new JPasswordField();
        value2.setBounds(50,280,100,30);
        b1 = new JButton("Login");
        b1.setBounds(50,350,150,50);
        b1.addActionListener(this);
        f.add(l1);f.add(l2);f.add(l3);f.add(value1);f.add(value2);
        f.add(b1);
        f.setSize(900,900);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==b1)
      {
        passt=false;
          for(int i=0; i<3;i++)
          {
              if(user[i].equals(value1.getText()) && pass[i].equals(value2.getText()))
              {
                l2.setText("Login Sucessfull,"+ " Password: " +new String(value2.getPassword())); 
                passt=true;
              }
              
          }   
          if(passt==false)
          {
              l2.setText("Login failed, please try again");
          }
                  
              
      }
    }
    public static void main(String[] args)
    {
        new password();
    }
}
