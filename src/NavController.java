
/**
 *
 *  The Nav Controller handles logic to switch between Views
 * 
 * @author jrimland
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavController {
    
    NavModel n_model;
    NavView n_view;
    
    //Instance Variables for Options Model, View, and Controller
    OptionsModel o_model;
    OptionsView o_view;
    OptionsController o_Controller;  
    
    InstructionModel i_model;
    InstructionView i_view;
    InstructionController i_Controller;
    
    CreditModel c_model;
    CreditView c_view;
    CreditController c_Controller;
           
    // TODO: Create instances of your MainModel and MainController once you implement them
    MainView m_view;
    
    GameView g_view;
    GameController g_controller;
    
    public NavController(NavModel n_model, NavView n_view ) {
        this.n_model = n_model;
        this.n_view = n_view;
        
        o_model = new OptionsModel();        
        o_view = new OptionsView(o_model);
        o_Controller = new OptionsController(o_model, o_view); 
        
        i_model = new InstructionModel();
        i_view = new InstructionView(i_model);
        i_Controller = new InstructionController(i_model, i_view);
        
        c_model = new CreditModel();
        c_view = new CreditView(c_model);
        c_Controller = new CreditController(c_model, c_view);
        
        m_view = new MainView();
        
        g_view = new GameView();
        g_controller = new GameController(g_view);
                
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addInstructionButtonListener(new InstructionButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());        
        n_view.addCreditButtonListener(new CreditButtonListener());
        o_view.addButtonListener(new OptionRetButtonListener());
        m_view.addStartButtonListener(new startButtonListener());
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
        }
    }     
 
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a Main View object to our Navigation View
            n_view.switchToMainPanel(m_view);
        }
    }
    
    class InstructionButtonListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            n_view.switchToInstructionPanel(i_view);
        }
    }
    
    class CreditButtonListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            n_view.switchToCreditPanel(c_view);
        }
    }
    
    class OptionRetButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            
            o_view.getSettingSave().setText("Saved!");
            m_view.getOutput().setText("PlayerName: "+ o_view.getPlayerName().getText()+"   Gender:"+o_view.getSex().getSelectedItem()+"   Difficulty Level: "+o_view.getDifficulty().getValue());
            m_view.getStart().setText("Play!");
            n_view.switchToMainPanel(m_view);
            
        }
    }
    
    class startButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            
            if (o_view.getSettingSave().getText().equalsIgnoreCase("Saved!")) {
                g_view = new GameView();
                
                n_view.switchToStartPanel(g_view);
            } else {
                m_view.getStart().setText("Settings info first!");
            }
        }

    }
    
    
    //TODO: Add listeners on buttons to switch to other Panels
    
}
