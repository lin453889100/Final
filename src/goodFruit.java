
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
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
public class goodFruit {
   Image goodFruit;
   Random r = new Random();
   int goodFruitCurrX;
   int goodFruitCurrY;
   
   int speed;
    
    public goodFruit(int panelHeight, int panelWidth, GameView g_view){
        goodFruit =new ImageIcon("src/images/banana.jpg").getImage();
        this.speed = 1;
    }
    
    public void randomPosition(){
        goodFruitCurrX = r.nextInt(800);
        goodFruitCurrY= 0;
    }
    
    public int getCurrX(){
        return goodFruitCurrX ;
    }
    public int getCurrY(){
        return goodFruitCurrY;
    }
    
    public Image getImage(){
        return goodFruit;
    }
    
    public void move()
    {
        this.goodFruitCurrY += this.speed;
    }
    
    public Rectangle getRect(){
        return new Rectangle(getCurrX(),getCurrY(),50,50);
    }
    
    public void drop(){
        if(goodFruitCurrY >=600){ 
            randomPosition();
        }
	else
            goodFruitCurrY++; 
	}
    
    
    
    
   
}
