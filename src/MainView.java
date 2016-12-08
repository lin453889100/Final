
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annmw820
 */
public class MainView extends JPanel {

    OptionsView o_view;
    JLabel output;
    GridLayout grid;
    JButton start;

    MainView() {
        grid = new GridLayout(10,3);
        setLayout(grid);
        output = new JLabel(" Info hasn't set yet! ");
        start = new JButton (" Play! ");
        add(output);
        add(start);
    }

    public JButton getStart() {
        return start;
    }

    public void setStart(JButton start) {
        this.start = start;
    }
    
     public void addStartButtonListener(ActionListener al) {
        this.start.addActionListener(al);
    }

    public JLabel getOutput() {
        return output;
    }

    public void setOutput(JLabel output) {
        this.output = output;
    }
}
