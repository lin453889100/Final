
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annmw820
 */
public class CreditView extends JPanel{
        JLabel credits;
       
        CreditModel c_model;
        
        CreditView(CreditModel c_model)
        {
            this.c_model = c_model;
           
            credits = new JLabel ("<html> Credits by <br><br>" + "Mingyao Lin <br>"+"Yifeng Wu <br>"+"Wei Miao <html>");
            
            credits.setFont(new java.awt.Font("DialogInput", 0, 18));
            credits.setHorizontalAlignment(SwingConstants.CENTER);
            
            add(credits);
        } 
        
}

