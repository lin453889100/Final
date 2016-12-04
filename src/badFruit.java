
import java.awt.Graphics;
import java.awt.Image;
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
public class badFruit {
    private GamePanel gamePanel;
    private final Image badFruitImage;
    
    
    
    private String BadFruitImagePath="Final\\src\\images\\apple.jpg";
      // Picture Link: http://images.clipartlogo.com/files/images/41/418414/apple-food-fruit-apples-bitten-dan-worm-gerh-ger-cartoon-worms_t.jpg
    
    
    public static ArrayList<String> FruitImages = new ArrayList<String>();
  
    
    public badFruit(int panelHeight, int panelWidth, GamePanel gamePanel)
            
    {
        super (panelHeight, panelWidth, gamePanel);
        
       badFruitImage = new ImageIcon(BadFruitImagePath).getImage();
    }

    public Image getBadFoodImage()
    {
        return badFruitImage;
    }
    
    
    public void paintComponent(Graphics g)
    {
        move();
        
        g.drawImage(badFruitImage,this.x,this.y, 36, 32, gamePanel);
    
}
