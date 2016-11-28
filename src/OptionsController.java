
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrimland-air
 */
import java.awt.event.*;

public class OptionsController {
    private OptionsView o_view;
    private OptionsModel o_model;
    
    OptionsController(OptionsModel o_model, OptionsView o_view)
    {
        this.o_model = o_model;
        this.o_view = o_view;

        o_view.addButtonListener(new ButtonListener());
    }
    class ButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                String playerName = "";
                int difficulty;
                Object sex;
                

                JButton clicksource = (JButton) e.getSource();
                if (clicksource == o_view.retButton)
                {
                    playerName = o_view.getplayerName();
                    o_model.setName(playerName);
                    
                    difficulty = o_view.getDifficulty();
                    o_model.setDifficulty(difficulty);
                    
                    sex = o_view.getSex();
                    o_model.setSex(sex);
                    
                   
                    
                }
            }
            
        }
}

    

