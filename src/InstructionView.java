
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glennlin
 */

import javax.swing.*;

public class InstructionView extends JPanel{
        JLabel instructions;
        JLabel contents;
        JSeparator Separator1;
        
        InstructionModel i_model;
        
        InstructionView(InstructionModel i_model)
        {
            this.i_model = i_model;
            instructions = new JLabel("Instructions", SwingConstants.CENTER);
            contents = new JLabel("<html> Welcome! In this game farmers are busy to pick up ripe fruits and take out tainted fruits.<br>You will be asked to select a game level and navigate the “farmer” figure by controlling the keyboard (A,D) to move left and right </html>", SwingConstants.CENTER);
            Separator1 = new JSeparator();
            
            instructions.setFont(new java.awt.Font("DialogInput", 0, 18));
            instructions.setHorizontalAlignment(SwingConstants.CENTER);
            
            contents.setFont(new java.awt.Font("DialogInput", 0, 14));
            contents.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            
                   
            


            
            add(instructions);
            add(contents);
        } 
        
    
    
}
