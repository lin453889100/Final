
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
        JLabel difficultyLabel;
        JLabel playerNameLabel;
        JLabel sexLabel;
        
        
       
        
        OptionsModel o_model;
        MainView m_view;
        
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

            
            
            retButton = new JButton("Save");
            playerNameLabel = new JLabel("Player name is empty");
            difficultyLabel = new JLabel("Difficulty is not selected yet");
            sexLabel = new JLabel("Sex is not selected yet");
            
            

            add(playerName);
            add(EnterDiff);
            add(difficulty);
            add(retButton);
            add(sex);
            add(playerNameLabel);
            add(difficultyLabel);
            add(sexLabel);
            
        } 
   
            public void addButtonListener(ActionListener e)
            {    
            this.retButton.addActionListener(e);
            
            }
            
            public JTextField getplayerName()
            {
                return playerName;
            }
            public void setplayerName(JTextField playername)
            {
                this.playerName = playerName;
            }
            
            public JButton getretButton()
            {
                return retButton;
            }
            public void setretButton(JButton retButton)
            {
                this.retButton = retButton;
            }
            public JLabel getEnterDiff()
            {
                return EnterDiff;
            }
            public void setEnterDiff(JLabel EnterDiff)
            {
                this.EnterDiff = EnterDiff;
            }
            public JSlider getDifficulty()
            {
                return difficulty;
            }
            public void setDifficulty()
            {
                this.difficulty = difficulty;
            }
            public JComboBox getSex()
            {
                return sex;
            }
            public void setSex(JComboBox sex)
            {
                this.sex = sex;
            }
            
            public JLabel getsexLabel()
            {
                return sexLabel;
            }
            public void setsexLabel(JLabel sexLabel)
            {
                this.sexLabel = sexLabel;
            }
            
            public JLabel getDifficultyLabel()
            {
                return difficultyLabel;
            }
            public void setDifficultyLabel(JLabel difficultyLabel)
            {
                this.difficultyLabel = difficultyLabel;
            }
            
            public JLabel getplayerNameLabel()
            {
                return playerNameLabel;
            }
            public void setplayerNameLabel(JLabel playerNameLabel)
            {
                this.playerNameLabel = playerNameLabel;
            }
           
        
}
