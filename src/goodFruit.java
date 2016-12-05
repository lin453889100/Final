
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yifeng
 */
public class goodFruit extends Rectangle {
   
    GamePanel gamePanel;
    int x;
    int y;
    int speed;
    int size;
    Dimension dim;
    Image goodFruitImage;
    String GoodFruitImageDirection="Final\\src\\images\\banana.jpg"; 
    // Link to the picture : http://www.yooyoo360.com/photo/2009-1-4/20090114131115526.jpg
    
    public goodFruit(int panelHeight, int panelWidth, GamePanel gamePanel){
        
        this.gamePanel = gamePanel;
        this.dim = new Dimension (panelHeight, panelWidth);
        this.speed=5;
        this.size=10;
       
        int randomPosition = (int) (panelHeight * Math.random() - 20);
        
        this.setBounds(randomPosition,0,speed,size);
        goodFruitImage=new ImageIcon(GoodFruitImageDirection).getImage();
    }
     
    public Image getGoodFruitImage(){
        return goodFruitImage;
    }
    
    public int getCurrX(){
        return x;
    }
    public int getCurrY(){
        return y;
    }
    public void move(){
        this.y += this.speed;
    }

    public void paintComponent(Graphics g){
        move();
        g.drawImage(goodFruitImage,this.x,this.y, 35, 35, gamePanel);


}
}
