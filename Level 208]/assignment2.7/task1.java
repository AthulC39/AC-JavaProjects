import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class task1 extends JFrame implements ActionListener
{
 JFrame f;JButton b;
 JLabel textLabel,imageLabel;
 task1(){
 Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 25);
 f= new JFrame("task1");
 ImageIcon treeImage = new ImageIcon("tree.png");
 imageLabel= new JLabel(treeImage);
 textLabel=new JLabel("Question 1");
 textLabel.setBounds(60,100,500,100);
 textLabel.setFont(f1);
 //textLabel.setForeground(Color.WHITE);
 b= new JButton("click this");
 b.setBounds(90,200,100,50);
 b.addActionListener(this);
 f.add(b);f.add(textLabel);f.add(imageLabel);
 f.pack();

 f.setLayout(null);
 f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
     if(e.getSource()==b)
     {
         textLabel.setText("Clicked!");
     }
 }
 public static void main(String[] args)
 {
     new task1();
 }
}
