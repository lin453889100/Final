
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glennlin
 */
public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private Player player;
    private ArrayList<GoodFruit> goodFruits;
    private ArrayList<BadFruit> badFruits;
    private final JPanel scorePanel = new JPanel();
    private JLabel score;
    private JLabel lives;
    private final int panelHeight = 500 ;
    private final int panelWidth = 700;
    private boolean ingame;
    

    public GamePanel()
    {
        
    }
    
    

    public void scoreStatus()
    {
        scorePanel.setSize(500, 500);
        scorePanel.setBorder(new LineBorder(Color.BLACK));
     
        player = new Player("1P",0);
        score = new JLabel("Your Score: "+ player.getScore());
        gamePanel.add(scoreLabel);
        
        livesLabel = new JLabel("Your Lives: "+ player.getLives());
        gamePanel.add(livesLabel);
        
    }

}