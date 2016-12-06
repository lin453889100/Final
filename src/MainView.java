
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
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
    Image background;
    Image backgroundNew;
    Image player;
    Image goodFruit;
    Image badFruit;
    JLabel ScoreLabel;
    JLabel MissingLabel;
    JLabel LivesLabel;
    int x_player,y_player;
    int x_goodFruit,y_goodFruit;
    int x_badFruit, y_badFruit;
    Random rand=new Random();
    int Score ;
    int Missing;
    int Lives =8;
    boolean gameStatus = true; 
    
    public MainView(){
        
        backgroundNew = background;
        ScoreLabel = new JLabel("Current Score: 0");
        ScoreLabel.setBounds(20, 10, 40, 10);
        add(ScoreLabel);
        
        MissingLabel = new JLabel("Total Missing: 0");
	MissingLabel.setBounds(40, 20, 50, 20); //setting the time label on screen    
        add(MissingLabel);
	LivesLabel = new JLabel("Lives: 0");
	LivesLabel.setBounds(100,10,100,20);
        add(LivesLabel);
        
        x_player=250;
        y_player=400;
        x_goodFruit=(int)rand.nextInt(100);
        y_goodFruit = 0;
        x_badFruit=(int)rand.nextInt(100);
        y_badFruit = 0;
    
        background =new ImageIcon("src/images/MainViewBackground.jpg").getImage();
        player =new ImageIcon("src/images/player.jpg").getImage();
        goodFruit =new ImageIcon("src/images/banana.jpg").getImage();
        badFruit =new ImageIcon("src/images/apple.jpg").getImage();
        
        addKeyListener(new Navigate());
        
	

    setFocusable(true);
    
}
    public void fallGoodFruit(){
	if(y_goodFruit >=450){ //when one egg has completely fallen
		y_goodFruit = 0;   //set the y cord of next egg to 0
		x_goodFruit = rand.nextInt(100); // randomize next eggs x coord
	}
	else
		y_goodFruit++; //otherwise fall the egg down 
	}//end fallEgg
    
    public void fallBadFruit(){
	if(y_badFruit >=450){ //when one egg has completely fallen
		y_badFruit = 0;   //set the y cord of next egg to 0
		x_badFruit = rand.nextInt(100); // randomize next eggs x coord
	}
	else
		y_badFruit++; //otherwise fall the egg down 
	}//end f
    
    
    void detectCollision(){
	Rectangle playerRect = new Rectangle(x_player,y_player,50,50); //making a rectangle on the basket
	Rectangle gfRect    = new Rectangle(x_goodFruit,y_goodFruit,10,10);
        Rectangle bfRect    = new Rectangle(x_badFruit,y_badFruit,10,10);//making a rectangle on egg
        
	if(gfRect.intersects(playerRect)){
	   
            ScoreLabel.setText("Score:"+Score); // set the count
	   
            Score+=1; // give 5 points on each catch
	   
    	   y_goodFruit = 0; // for next egg
	   x_goodFruit = rand.nextInt(100); // again randomizing x axis of egg
	}
        if(bfRect.intersects(playerRect)){
            
           Lives-=1;
           LivesLabel.setText("Lives: "+Lives);
	   
    	   y_badFruit = 0; // for next egg
	   x_badFruit = rand.nextInt(100); // again randomizing x axis of egg
	}
        
}//end collision detection
    
    void checkGameOver(){
	if(Lives <= 0)
	   {
		JLabel yourScore = new JLabel("Your SCORE :" + Score);
		yourScore.setBounds(400, 400, 200, 100);
                gameStatus = false;
		yourScore.setForeground(Color.RED);
		add(yourScore);
	    }
	}//end gameOver
    
    public void paintComponent(Graphics g){
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D)g;
        
	
 
	checkGameOver();
        gameStatus = true;
 
	if(gameStatus == true){
	   setFocusable(true);
	   grabFocus();
	  
 
	   fallGoodFruit();
           fallBadFruit();
   	   detectCollision();
           MainView m_view = null;
 
	   g2d.drawImage(goodFruit, x_goodFruit, y_goodFruit,20,20,m_view); 
           g2d.drawImage(badFruit, x_badFruit, y_badFruit,20,20,m_view);
	   g2d.drawImage(player, x_player, y_player,60,60,m_view); //drawing basket
	}	
	repaint();	
    }
    
    
    public class Navigate extends KeyAdapter {
        public void keyReleased(KeyEvent k){
        }
        public void keyPressed(KeyEvent k){
 
		if(k.getKeyCode() == k.VK_LEFT & x_player>10){
			x_player-=10;
			repaint(); // redraw at new position
		}
		if(k.getKeyCode() == k.VK_RIGHT & x_player<1000){
			x_player+=10; // redraw at new position
			repaint();
		}
	}
    };
}
    

    






