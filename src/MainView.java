import static java.awt.AWTEventMulticaster.remove;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
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
    Image background;
    Image player;
    goodFruit gf;
    badFruit bf;
    
    JLabel ScoreLabel;
    JLabel MissingLabel;
    JLabel LivesLabel;
    JLabel output;
    
    Random rand = new Random();
    int x_player=250;
    int y_player=440;
    
    
    int Score = 0;
    int Missing = 0;
    int Lives = 8;
    
    boolean gameStatus = true; 
    
    public MainView(){
        
        output= new JLabel();
        gf = new goodFruit();
        bf = new badFruit();      
        
        ScoreLabel = new JLabel("Current Score: 0");
        ScoreLabel.setBounds(30,20,200,15);
        add(ScoreLabel);
        
        MissingLabel = new JLabel("Total Missing: 0");
	MissingLabel.setBounds(30,40,200,15); 
        add(MissingLabel);
	LivesLabel = new JLabel("Lives: 8");
	LivesLabel.setBounds(30,60,200,15);
        add(LivesLabel);
        
        background =new ImageIcon("src/images/MainViewBackground.jpg").getImage();
        player =new ImageIcon("src/images/player.jpg").getImage();
        
        addKeyListener(new Navigate());
        setFocusable(true);
    
}

    void notCollision(){
        
        if(gf.getCurrX() > 500){
            Missing =Missing+1; 
            MissingLabel.setText("Total Missing: "+ Missing); 
            gf.randomPosition();
        }
    }

    void detectCollision(){
	Rectangle playerRect = new Rectangle(x_player,y_player,200,150); 
	Rectangle gfRect    = gf.getBound();
        Rectangle bfRect    = bf.getBound();
        
	if(gfRect.intersects(playerRect)){
	   Score=Score+1; 
           ScoreLabel.setText("Current Score:"+Score); 
    	   gf.randomPosition();
	}
        
        else if(bfRect.intersects(playerRect)){ 
           Lives-=1;
           LivesLabel.setText("Lives: "+Lives);
    	   bf.randomPosition();
	}
        
}
    
    public void paintComponent(Graphics g){
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D)g;
        g.drawImage(background,0,0,null); 
        
        gf.fallGoodFruit();
        bf.fallBadFruit();
	
	if(Lives <= 0 || Missing >4){
                gameStatus = false;
	    }
 
	if(gameStatus == true){
	   
           gf.fallGoodFruit();
           bf.fallBadFruit();
           notCollision();
   	   detectCollision();
           MainView m_view = null;

	   g.drawImage(player, x_player, y_player,200,150,m_view); 
           g.drawImage(bf.getImage(), bf.getCurrX(), bf.getCurrY(),50,50, m_view);
           g.drawImage(gf.getImage(), gf.getCurrX(), gf.getCurrY(),50,50,m_view); 
           
           grabFocus();
	}
        else if (gameStatus == false){
            Font f=new Font("Times",Font.BOLD,40);
            g.setFont(f);
            g.drawString("Game Over", 300,200);
            g.drawString("Final Score: "+Score, 200, 300);
            g.drawString("Total Missing: "+ Missing ,200, 400);
            
        }
        
	repaint();	
    }

    public class Navigate extends KeyAdapter {
        
        
        public void keyReleased(KeyEvent k){
        }
        public void keyPressed(KeyEvent k){
 
		if(k.getKeyCode() == k.VK_LEFT & x_player>10){
                    
                     x_player-=10;
                     repaint();   
                    
		}
		if(k.getKeyCode() == k.VK_RIGHT & x_player<1000){
	
                     x_player+=10;
    
		}
	}
    };
    
    public void setOutput(){
        this.output=output;
    }
    public JLabel getOutput(){
        return output;
    }
}