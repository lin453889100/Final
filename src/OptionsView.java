
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author jrimland-air
 */
public class OptionsView extends JPanel{
        JButton retButton;
        JTextField playerName;
        JLabel EnterDiff;
        JSlider difficulty;
        JComboBox sex;
        
       
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
            
                   
            
            playerName = new JTextField("--Enter Player Name--");
            difficulty = new JSlider(JSlider.HORIZONTAL, 1,10,5);
            difficulty.setMajorTickSpacing(1);
            difficulty.setPaintLabels(true);
            difficulty.setPaintTicks(true);

            EnterDiff = new JLabel("  Enter Difficulty:");
            
            sex = new JComboBox<Object>();
            sex.addItem("male");
            sex.addItem("female");

            
            
            retButton = new JButton("Save and Return");

            add(playerName);
            add(EnterDiff);
            add(difficulty);
            add(retButton);
            add(sex);
        } 
   
            public void addButtonListener(ActionListener bl)
            {    
            retButton.addActionListener(bl);
            
            }
            
            String getplayerName()
            {
            return playerName.getText();
            }
            
            int getDifficulty()
            {
            return difficulty.getValue();
            }
            Object getSex()
            {
            return sex.getSelectedItem();
            }
            
            
           
        
}
