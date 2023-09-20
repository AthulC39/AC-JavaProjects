import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class task2 extends JFrame implements ActionListener
{
 JFrame f;JButton b; JButton change;
 JLabel textLabel,imageLabel;
 ImageIcon treeImage;
 task2(){
 Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 25);
 f= new JFrame("task1");
 treeImage = new ImageIcon("tree.png");
 imageLabel= new JLabel(treeImage);
 textLabel=new JLabel("Question 1");
 textLabel.setBounds(60,100,500,100);
 textLabel.setFont(f1);
 textLabel.setForeground(color.WHITE);
 b= new JButton("click this");
 b.setBounds(90,200,100,50);
 b.addActionListener(this);
 change = new JButton("change image");
 change.setBounds(200,200,100,50);
 change.addActionListener(this);
 f.add(b);f.add(textLabel);f.add(imageLabel);
 f.pack();
 f.setResizable(false);
 f.setLayout(null);
 f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
     if(e.getSource()==change)
     {
       treeImage= new ImageIcon("tree2.png");
     }
 }
 public static void main(String[] args)
 {
     new task2();
 }
}
