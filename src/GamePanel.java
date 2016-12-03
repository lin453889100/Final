
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
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
    private OptionsView difficultyChange;
    private ArrayList<GoodFruit> goodFruits;
    private ArrayList<BadFruit> badFruits;
    private final JPanel gamePanel = new JPanel();
    private JLabel score;
    private JLabel lives;
    private final int panelHeight = 500 ;
    private final int panelWidth = 700;
    private boolean ingame;
    public Timer gameTimer;
    public Timer fruitTimer;
    

    public GamePanel()
    {
        
    }
    
    

    public void scoreStatus()
    {
        goodFruits = new ArrayList<>();
        badFruits = new ArrayList<>();
        gameTimer = new Timer(70, this);
        fruitTimer = new Timer(1000, this);
        
        gamePanel.setSize(500, 500);
        gamePanel.setBorder(new LineBorder(Color.BLACK));
     
        player = new Player("1P",0);
        score = new JLabel("Your Score: "+ player.getScore());
        gamePanel.add(score);
        
        lives = new JLabel("Your Lives: "+ player.getLives());
        gamePanel.add(lives);
        
    }
    
    public void difficultyLevel()
    {
        int value = difficultyChange.getDifficulty().getValue();
        if(value == 1)
        {
            this.repaint();
            goodFruit good1 = new goodFruit(panelWidth,panelWidth,this);
            badFruit bad1 = new badFruit(panelWidth,panelWidth,this);
            
            for(int i = 0; i < goodFruit.size(); i++)
            {
                goodFruit.get(i).move();
            }
            
            for(int i = 0; i < badFruit.size(); i++)
            {
                badFruit.get(i).move();
            }
        }
        else if(value == 2)
        {
            this.repaint();
            goodFruit good1 = new goodFruit(panelWidth,panelWidth,this);
            badFruit bad1 = new badFruit(panelWidth,panelWidth,this);
            badFruit bad2 = new badFruit(panelWidth,panelWidth,this);
            
            for(int i = 0; i < goodFruit.size(); i++)
            {
                goodFruit.get(i).move();
            }
            
            for(int i = 0; i < badFruit.size(); i++)
            {
                badFruit.get(i).move();
            }
        }
        else if(value == 3)
        {
            this.repaint();
            goodFruit good1 = new goodFruit(panelWidth,panelWidth,this);
            badFruit bad1 = new badFruit(panelWidth,panelWidth,this);
            badFruit bad2 = new badFruit(panelWidth,panelWidth,this);
            badFruit bad3 = new badFruit(panelWidth,panelWidth,this);
            
            for(int i = 0; i < goodFruit.size(); i++)
            {
                goodFruit.get(i).move();
            }
            
            for(int i = 0; i < badFruit.size(); i++)
            {
                badFruit.get(i).move();
            }
        }
        
        goodFruit.add(good1);
        badFruit.add(bad1);
        badFruit.add(bad2);
        badFruit.add(bad3);
    }

}