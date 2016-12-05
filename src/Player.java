
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annmw820
 */
public class Player  extends Rectangle {
    GamePanel gamePanel;
    int panelWidth = 500;
    int panelHeight = 600;
    Dimension dim;
    int playerHeight = 25;
    int playerWidth = 25;
    int playerSize;
    int score= 0; 
    int lives=8;
    int missing=0;
    private String playerName;
    int speed = 5;
    public int currX = 200;
    private final int currY = 300;
    private Image playerImage;
    //picture:
    
 
    public Player(String PlayerName, int score)
    {
        this.playerName = playerName;
        this.score = score;
        this.lives = lives;
        this.missing=missing;
        
        this.playerSize = 50;
        this.dim = new Dimension(panelWidth, panelHeight);
        this.setBounds(currX, currY, playerHeight, playerHeight);
    }
    
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    public void keyPressed(KeyEvent e)
    {
       if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
           if(this.currX != 0){
            this.currX = this.currX - speed;
        }  
        } 
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
           if(this.currX != panelWidth-playerSize){
            this.currX = this.currX + speed;
        }
        } 
    }
    
    public void paintComponent(Graphics g)
    {
        Image playerImage = new ImageIcon("src/images/player.jpg").getImage();
        g.drawImage(playerImage, currX, currY, playerWidth, playerHeight, gamePanel);
    }
    
    
     public void increaseScore()
        {
            score = score + 1;
        }
    public int getScore()
        {
            return score;
        }
    public void missingGoodFruit()
        {
            missing=missing+1;
        }
    public int getMissingValue()
        {
            return missing;
        }
    public void decreaseLives()
        {
            lives = lives-1;
        }
    public int getLives()
        {
            return lives;
        }
    public String getPlayerName()
        {
            return playerName;
        }
    public int getCurrX()
        {
           return this.currX;
        }
    public int getCurrY()
        {
            return this.currY;
        }
   
    
}

