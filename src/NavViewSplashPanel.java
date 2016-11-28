
import javax.swing.*;

/**
 *
 * @author jrimland
 */
public class NavViewSplashPanel extends JPanel{
    JButton splashButton;
    JLabel optionsLabel;
     JLabel information1;
    JLabel information2;
    NavViewSplashPanel()
    {
            splashButton = new JButton(new ImageIcon("C:\\Users\\yifeng\\DesktopWu\\Final\\src\\images\\background.jpg"));    
             splashButton.setHorizontalTextPosition(JButton.CENTER);
                splashButton.setVerticalTextPosition(JButton.TOP);
            add(splashButton);
            
            optionsLabel = new JLabel("No options selected yet.");
            add(optionsLabel);
            
            information1 = new JLabel ("");
           information1.setHorizontalTextPosition(JButton.CENTER);
            information1.setVerticalTextPosition(JButton.BOTTOM);
          add(information1);
          
          
          
          information2 = new JLabel (" .");
          information2.setHorizontalTextPosition(JButton.CENTER);       
            information2.setVerticalTextPosition(JButton.CENTER);
          add(information2);
            
    }    
}
