
import java.awt.Graphics;
import java.awt.Image;
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
public class goodFruit {
      private GamePanel gamePanel;
    private final Image goodFruitImage;
    
    
    private String GoodFruitImagePath="Final\\src\\images\\banana.jpg"; 
    // Link to the picture : http://www.yooyoo360.com/photo/2009-1-4/20090114131115526.jpg
    

    
    public goodFruit(int panelHeight, int panelWidth, GamePanel gamePanel)
            
    {
        super(panelHeight, panelWidth, gamePanel);
        goodFruitImage=new ImageIcon(GoodFruitImagePath).getImage();
    }
    
    
    public Image getCatImage()
            
    {
        return goodFruitImage;
    }
    
    
    public void paintComponent(Graphics g)
            
    {
        move();
        g.drawImage(goodFruitImage,this.x,this.y, 36, 32, gamePanel);


}
}
