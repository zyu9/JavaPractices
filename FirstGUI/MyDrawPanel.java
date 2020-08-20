import java.awt.*;
import javax.swing.*; 
/**
 * Write a description of class MyDrawPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyDrawPanel extends JPanel
{
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
        
        //Display a JPEG
        //Image image = new ImageIcon("catzilla.jpg").getImage();
        //g.drawImage(image,3,4,this);
        
        //Paint a randomly-colored circle on a black background
        //g.fillRect(0,0,this.getWidth(),this.getHeight());
        //int red = (int) (Math.random() * 255);
        //int green = (int)(Math.random() * 255);
        //int blue = (int)(Math.random() * 255);
        //Color randomColor = new Color(red, green, blue);
        //g.setColor(randomColor);
        //g.fillOval(70,70,100,100);
    }
}
