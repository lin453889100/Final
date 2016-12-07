
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yifeng
 */
public class badFruit  {
    
   Image badFruit;
   Random rand = new Random();
   
    int x_badFruit= rand.nextInt(800);
    int y_badFruit = 0;
    
    
    public badFruit(){
        
        badFruit =new ImageIcon("src/images/apple.jpg").getImage();
    }
    
    public void randomPosition(){
        x_badFruit = rand.nextInt(800);
        y_badFruit= 0;
    }
    
    
    public int getCurrX(){
        return x_badFruit ;
    }
    public int getCurrY(){
        return y_badFruit;
    }
    
    public Image getImage(){
        return badFruit;
    }
    
    public Rectangle getBound()
	{
		return new Rectangle(getCurrX(),getCurrY(),50,50);
	}
    public void fallBadFruit(){
	if(y_badFruit >=600){ 
		randomPosition();
        }
	else
		y_badFruit++; 
	}
    
    

    
}