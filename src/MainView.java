
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 *  The View for your main gameplay or user interaction could go here.
 * 
 * @author jrimland
 */
public class MainView extends JPanel{

        OptionsView o_view;
        JLabel difficulty;
        JLabel playerName;
        JLabel sex;
        JButton welcomeButton;
        
    MainView()
    {
        welcomeButton = new JButton("Welcome to the Main View!");
        
        add(welcomeButton);
        
        playerName = new JLabel("Player name is empty");
        difficulty = new JLabel("Difficulty is not selected yet");
        sex = new JLabel("Sex is not selected yet");
        
        add(welcomeButton);
        add(difficulty);
        add(playerName);
        add(sex);
        
    }
            public JButton getWelcome()
            {
                return welcomeButton;
            }
            public void setWelcome(JButton welcomeButton)
            {
                this.welcomeButton = welcomeButton;
            }
            public JLabel getDifficulty()
            {
                return difficulty;
            }
            public void setDifficulty(JLabel difficulty)
            {
                this.difficulty = difficulty;
            }
            
            public JLabel getplayerName()
            {
                return playerName;
            }
            public void setplayerName(JLabel playerName)
            {
                this.playerName = playerName;
            }
            public JLabel getSex()
            {
                return sex;
            }
            public void setSex(JLabel sex)
            {
                this.sex = sex;
            }
   
    
    
}
