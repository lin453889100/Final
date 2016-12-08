import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 *
 *  The Nav View exposes methods to the Nav Controller that allow it to switch panels
 * 
 * @author jrimland
 */
public class NavView extends JFrame{
    
    NavModel model;
    NavViewPanel nVpanel;
    
    NavView(NavModel model)
    {
        super("Primary View");
        this.model = model;
                          
        setSize(900, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel);    
    }
    
    public void switchToOptionsPanel(OptionsView o_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeInstruction();
        nVpanel.removeCredit();
        nVpanel.removeGame();
        nVpanel.addOptions(o_view);        
    }
    
    public void switchToMainPanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.removeCredit();
        nVpanel.removeGame();
        nVpanel.addMain(m_view);        
    }
    public void switchToInstructionPanel(InstructionView i_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeCredit();
        nVpanel.removeGame();
        nVpanel.addInstruction(i_view);  
    }
    
    public void switchToCreditPanel(CreditView c_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.removeGame();
        nVpanel.addCredit(c_view);
    }
    
    public void switchToStartPanel(GameView g_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.removeCredit();
        nVpanel.addStart(g_view);
    }

    
    public void addOptionsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.optionsButton.addActionListener(al);
    }    
                    
    public void addMainButtonListener(ActionListener al) 
    {    
        nVpanel.menu.mainButton.addActionListener(al);
    }
    public void addInstructionButtonListener(ActionListener al)
    {
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
    public void addCreditButtonListener(ActionListener al)
    {
        nVpanel.menu.creditsButton.addActionListener(al);
    }
    
    //TODO: Add listeners to switch to other Panels
    
}
