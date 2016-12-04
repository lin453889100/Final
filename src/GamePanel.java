
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
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
    
    public void Background(Graphics g)
    {
        Image backgound = new ImageIcon().getImage();
        g.drawImage(backgound, 0, 0, panelWidth, panelHeight, this.gamePanel);
    }
    
    public void GoodFruits(Graphics g)
    {
        for(int i = 0; i < goodFruits.size(); i++)
        {
            goodFruits.get(i).paintComponent(g);
        }
    }
    
    public void GoodCollision()
    {
        for(int i = 0; i < goodFruits.size(); i++)
        {
            if(player.intersects(goodFruits.get(i)))
            {
                player.increaseScore();
                score.setText("Your Score: " + player.getScore());
                goodFruits.remove(i);
            }
        }
    }
    
    public void BadFruits(Graphics g)
    {
        for(int i = 0; i < badFruits.size(); i++)
        {
            badFruits.get(i).paintComponent(g);
        }
    }
    
    public void BadCollision()
    {
        for(int i = 0; i < badFruits.size(); i++)
        {
            if(player.intersects(badFruits.get(i)))
            {
                player.decrementLives();
                score.setText("Your Lives: " + player.getScore());
                goodFruits.remove(i);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object j = e.getSource();
        
        if(j == gameTimer)
        {
            this.repaint();
            player.setLocation(player.currentX, player.getYCoord());
            
            if(player.getLives() == 0)
            {
                fruitTimer.stop();
                gameTimer.stop();
                
            }
        }
        
        else if(j == fruitTimer)
        {
            goodFruit good1 = new goodFruit(panelWidth,panelWidth,this);
            badFruit bad1 = new badFruit(panelWidth,panelWidth,this);
            badFruit bad2 = new badFruit(panelWidth,panelWidth,this);
            
            goodFruits.add(good1);
            badFruits.add(bad1);
            badFruits.add(bad2);
            
            for(int i = 0; i < goodFruits.size(); i++)
            {
                goodFruits.get(i).move();
            }
            
            for(int i = 0; i < badFruits.size(); i++)
            {
                badFruits.get(i).move();
            }
            
            difficultyLevel();
        }
    }
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        player.keyPressed(e);
    }
    
    @Override
    public void keyReleased(KeyEvent e)
    {
        player.keyReleased(e);
    }
   
    public Player getPlayer()
    {
        return this.player;
    }
    
    public void setInGame()
    {
        this.ingame = false;
    }
    
    public boolean getInGame()
    {
        return ingame = true;
    }

}