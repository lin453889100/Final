
import java.awt.GridLayout;
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
        
        JLabel settingSave;
       
        MainView m_view;
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
            
            GridLayout grid = new GridLayout(10,17);
            setLayout(grid);

            playerName = new JTextField("--Update Player Name--");
            
            sex = new JComboBox<Object>();
            sex.addItem("male");
            sex.addItem("female");
            
            difficulty = new JSlider(JSlider.HORIZONTAL, 1,3,1);
            difficulty.setMajorTickSpacing(1);
            difficulty.setPaintLabels(true);
            difficulty.setPaintTicks(true);

            EnterDiff = new JLabel("  Enter Difficulty:");

            retButton = new JButton("Save and Return");

            settingSave = new JLabel(" Settings haven't been Saved! ");
                    
            add(playerName);
            add(sex);
            add(EnterDiff);
            add(difficulty);
            add(retButton);
            add(settingSave);
        
        } 
   
    public void addButtonListener(ActionListener bl){    
    retButton.addActionListener(bl);
    }
           
    public void setRetButton(JButton retButton) {
    this.retButton = retButton;
    }
            
    public JButton getRetButton() {
    return retButton;
    }

    public JLabel getSettingSave() {
        return settingSave;
    }

    public void setSettingSave(JLabel settingSave) {
        this.settingSave = settingSave;
    }

    public JLabel getEnterDiff() {
        return EnterDiff;
    }

    public void setEnterDiff(JLabel EnterDiff) {
        this.EnterDiff = EnterDiff;
    }

    public JSlider getDifficulty() {
        return difficulty;
    }

    
    public JTextField getPlayerName() {
        return playerName;
    }

    public void setPlayerName(JTextField playerName) {
        this.playerName = playerName;
    }

    public JComboBox getSex() {
        return sex;
    }

    public void setSubject(JComboBox sex) {
        this.sex = sex;
    }

}
