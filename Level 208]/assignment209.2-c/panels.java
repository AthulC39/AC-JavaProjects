import javax.swing.*;
import java.awt.*;


public class panels
{
    JFrame frame;
    JPanel contentPane, pinkPanel,yellowPanel,bluePanel,twoPanelContainer,threePanelContainer;
    JPanel redPanel;
    public panels(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane = new JPanel(new GridLayout(2,2));
        pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.PINK);
        
         redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        
        yellowPanel= new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        
        bluePanel= new JPanel();
        bluePanel.setBackground(Color.BLUE);
        
        twoPanelContainer = new JPanel(new GridLayout(1,2));
        twoPanelContainer.add(yellowPanel);
        twoPanelContainer.add(bluePanel);
        
          threePanelContainer = new JPanel(new GridLayout(1,2));
        threePanelContainer.add(pinkPanel);
        threePanelContainer.add(redPanel);
        
        contentPane.add(threePanelContainer);
        contentPane.add(twoPanelContainer);
        
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,600);
    }
    public static void main(String[] args   ){
        new panels();
    }
}
