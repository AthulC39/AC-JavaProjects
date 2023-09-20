import javax.swing.JFrame; // import all the required assets
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener
{
    private int count=0; //declare the labels, frames, and panels for the GUI
    private JLabel titleNameLabel;
    private JFrame frame;
    private JPanel panel, titleNamePanel, mensButtonPanel,womensButtonPanel;
    private JLabel title;
    private JButton mensButton,womensButton;
    
    public GUI(){
        
       Font titleFont = new Font("Times New Roman", Font.PLAIN, 72);
       Font normalFont = new Font("Times New Roman", Font.PLAIN, 26); // set font
        
       //setup
         frame = new JFrame(); // create mainframe
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setTitle("Graphix Online Store");
         frame.setLayout(null);     
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800,700);
     
      //create Mens Button
        mensButtonPanel = new JPanel();
        mensButtonPanel.setBounds(200,400,200,100);//sets size and position
        mensButtonPanel.setBackground(Color.black);
        mensButton = new JButton("Men's Apparel");
        mensButton.setBackground(Color.black);
        mensButton.setForeground(Color.white);
        mensButton.setFont(normalFont);
        mensButton.setFocusPainted(false);//false=doesn't show highliting when selcted
        mensButtonPanel.add(mensButton);
        frame.add(mensButtonPanel);

        //create Womens Button
        womensButtonPanel = new JPanel();
        womensButtonPanel.setBounds(400,400,200,100);//sets size and position
        womensButtonPanel.setBackground(Color.black);
        womensButton = new JButton("Women's Apparel");
        womensButton.setBackground(Color.black);
        womensButton.setForeground(Color.white);
        womensButton.setFont(normalFont);
        womensButton.setFocusPainted(false);//false=doesn't show highliting when selcted
        womensButtonPanel.add(womensButton);
        frame.add(womensButtonPanel);

        
        
        
        
        
        //create the title panel
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,500);//sets size and position
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Graphix Apparel");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        frame.add(titleNamePanel);
        
        
        
        
    
       
    }
    public static void main(String[] args) {
        new GUI();
        
    }
   public void actionPerformed(ActionEvent e){
      if(e.getSource()==mensButton)
      {
        mensApparel MensApparel = new mensApparel(); 
               }
   }
}
