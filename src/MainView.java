import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 *  The View for your main gameplay or user interaction could go here.
 * 
 * @author jrimland
 */
public class MainView extends JPanel{
    OptionsView o_view;
    JLabel output;
    
    MainView()
    {
        JButton welcomeButton = new JButton("Welcome to the Main View!");
        add(welcomeButton);
        
        output = new JLabel("Click 'options' and set your info!");
        add(output);
    }
   
    public JLabel getOutput(){
        return output;
    }
    
    public void setOutput(JLabel output){
        this.output = output;
    }
 
}
