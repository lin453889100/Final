
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
    Random r = new Random();
    int badFruitCurrX= r.nextInt(800);
    int badFruitCurrY = 0;
    
    
    public badFruit(){
        
        badFruit =new ImageIcon("src/images/apple.jpg").getImage();
    }
    
    public void randomPosition(){
        badFruitCurrX = r.nextInt(800);
        badFruitCurrY= 0;
    }
    
    
    public int getCurrX(){
        return badFruitCurrX ;
    }
    public int getCurrY(){
        return badFruitCurrX;
    }
    
    public Image getImage(){
        return badFruit;
    }
    
    public Rectangle getRect(){
	return new Rectangle(getCurrX(),getCurrY(),50,50);
    }
    
    public void drop(){
	if(badFruitCurrY >=600){ 
	randomPosition();
        }
	else
	badFruitCurrY++; 
	}
    
    

    
}