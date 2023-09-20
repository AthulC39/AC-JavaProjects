import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedCalculator implements ActionListener
{
JTextField tf1,tf2,tf3;
JButton b1,b2,b3,b4;
JLabel l1,l2,l3,imageLabel;
AdvancedCalculator(){
    JFrame f= new JFrame("Advanced Calculator");
    ImageIcon calcImage= new ImageIcon("math.png");
    imageLabel = new JLabel(calcImage);
    l1=new JLabel("Enter first number here");
    l1.setBounds(50,30,160,20);
    tf1= new JTextField();
    tf1.setBounds(50,50,160,20);
    l2=new JLabel("Enter second number here");
    l2.setBounds(50,80,160,20);
    l3=new JLabel("Result");
    l3.setBounds(50,130,160,20);
    tf2= new JTextField();
    tf2.setBounds(50,100,160,20);
    tf3= new JTextField();
    tf3.setBounds(50,150,140,20);
    tf3.setEditable(false);
    b1=new JButton("Addition");
    b1.setBounds(50,200,100,50);
    b2= new JButton("Subtract");
    b2.setBounds(160,200,100,50);
    b3= new JButton("Multiply");
    b3.setBounds(270,200,100,50);
    b4= new JButton("Divide");
    b4.setBounds(380,200,100,50);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);
    f.add(l1);f.add(l2);f.add(l3);
    f.add(imageLabel);
    f.pack();
    f.setSize(600,400);
    f.setLayout(null);
    f.setVisible(true);
    
}
public void actionPerformed(ActionEvent e) {
    String s1=tf1.getText();
    String s2=tf2.getText();
    int a= Integer.parseInt(s1);
    int b= Integer.parseInt(s2);
    int c=0;
    if(e.getSource()==b1){
        c=a+b;
    }
    else if(e.getSource()==b2){
        c=a-b;
    }
    else if(e.getSource()==b3){
        c=a*b;
    }
    else if(e.getSource()==b4){
        c=a/b;
    }
    String result=String.valueOf(c);
    tf3.setText(result);
}
public static void main(String[] args) {
    new AdvancedCalculator();
}
}
