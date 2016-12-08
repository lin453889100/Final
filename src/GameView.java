import static java.awt.AWTEventMulticaster.remove;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
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
public class GameView extends JPanel implements KeyListener{
    
    Image background;
    Image player;
    goodFruit gf;
    badFruit bf;
    
    JLabel ScoreLabel;
    JLabel LivesLabel;
    JLabel output;
      
    int playerCurrX=250;
    int playerCurrY=440;
    
    int Score = 0;
    int Lives = 8;
    
    private ArrayList<goodFruit> goodFruits;
    private ArrayList<badFruit> badFruits;
    private final int panelHeight = 500;
    private final int panelWidth = 700;

    boolean gameStatus = true; 
    
    public GameView(){
        
        output= new JLabel();
        add(output);
    
        gf = new goodFruit(panelWidth,panelWidth,this);
        bf = new badFruit(panelWidth,panelWidth,this); 
        
        ScoreLabel = new JLabel("Current Score: 0");
        ScoreLabel.setBounds(30,20,200,15);
        add(ScoreLabel);
        
	LivesLabel = new JLabel("Lives: 8");
	LivesLabel.setBounds(30,60,200,15);
        add(LivesLabel);
        
        background =new ImageIcon("src/images/MainViewBackground.jpg").getImage();
        player =new ImageIcon("src/images/player.jpg").getImage();
        
        this.addKeyListener(this);
        setFocusable(true);
    
}
   

    public void Collision(){
	Rectangle playerNew = new Rectangle(playerCurrX,playerCurrY,200,150); 
	Rectangle gfNew    = gf.getRect();
        Rectangle bfNew    = bf.getRect();
        
	if(gfNew.intersects(playerNew)){
	   Score=Score+1; 
           ScoreLabel.setText("Current Score:"+Score); 
    	   gf.randomPosition();
	}
        else if(bfNew.intersects(playerNew)){ 
           Lives-=1;
           LivesLabel.setText("Lives: "+Lives);
    	   bf.randomPosition();
	}
}
    
    public void paintComponent(Graphics g){
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D)g;
        g.drawImage(background,0,0,null); 
        
        gf.drop();
        bf.drop();
	
	if(Lives <= 0 ){
                gameStatus = false;
	    }
 
	if(gameStatus == true){
           gf.drop();
           bf.drop();
   	   Collision();
           GameView g_view = null;

	   g.drawImage(player,playerCurrX,playerCurrY,200,150,g_view); 
           g.drawImage(bf.getImage(), bf.getCurrX(), bf.getCurrY(),50,50, g_view);
           g.drawImage(gf.getImage(), gf.getCurrX(), gf.getCurrY(),50,50,g_view); 
           
           grabFocus();
	}
        else if (gameStatus == false){
            Font f=new Font("Times",Font.BOLD,40);
            g.setFont(f);
            g.drawString("Game Over", 300,200);
            g.drawString("Final Score: "+Score, 200, 300);
            
        }
	repaint();	
    }

    @Override
    public void keyReleased(KeyEvent k){
    }
    
    @Override
    public void keyTyped(KeyEvent k){
        
    }
    
    @Override
    public void keyPressed(KeyEvent k){
        if(k.getKeyCode() == k.VK_LEFT & playerCurrX<700){
            playerCurrX-=20;
            repaint();      
	}
        else if(k.getKeyCode() == k.VK_RIGHT & playerCurrX<700){
            playerCurrX+=20;
	}
    }

    public void setOutput(){
        this.output=output;
    }
    public JLabel getOutput(){
        return output;
    }
   
}