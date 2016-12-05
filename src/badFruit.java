
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
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
public class badFruit extends Rectangle {
    
    GamePanel gamePanel;
    int x;
    int y;
    int speed;
    int size;
    Dimension dim;
    Image badFruitImage;

    String BadFruitImageDirection="Final\\src\\images\\apple.jpg";
      // Picture Link: http://images.clipartlogo.com/files/images/41/418414/apple-food-fruit-apples-bitten-dan-worm-gerh-ger-cartoon-worms_t.jpg
  
    
    public badFruit(int panelHeight, int panelWidth, GamePanel gamePanel){
       this.gamePanel = gamePanel;
       this.dim = new Dimension (panelHeight, panelWidth);
       this.speed=5;
       this.size=10;
       
       int randomPosition = (int) (panelHeight * Math.random() - 20);
        
       this.setBounds(randomPosition,0,speed,size);
        
       badFruitImage = new ImageIcon(BadFruitImageDirection).getImage();
    }

    public Image getBadFoodImage()
    {
        return badFruitImage;
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
        
        g.drawImage(badFruitImage,this.x,this.y, 36, 32, gamePanel);
    }
}
