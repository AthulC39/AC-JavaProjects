import javax.swing.*;
import java.awt.*;


public class examinationPanel
{
   JFrame f;
    JPanel  onePanel,twoPanel,threePanel;

    public examinationPanel(){
        f= new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
        onePanel = new JPanel();
        onePanel.setBackground(Color.ORANGE);
        
        twoPanel = new JPanel();
        twoPanel.setBackground(Color.WHITE);
        
        threePanel = new JPanel();
        threePanel.setBackground(Color.ORANGE);
       
        f.add(onePanel,BorderLayout.NORTH);
        f.add(twoPanel,BorderLayout.CENTER);
        f.add(threePanel,BorderLayout.SOUTH);
       
        f.pack();
        f.setVisible(true);
        f.setSize(600,600);
    }
    public 
}
