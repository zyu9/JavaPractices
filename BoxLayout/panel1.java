import javax.swing.*;
import java.awt.*; 
/**
 * Write a description of class panel1 here.
 *
 * @author (zyu9)
 * @version (8/25/2020)
 */
public class panel1
{
    public static void main(String[] args){
       panel1 gui = new panel1();
       gui.go();
   }
   
   public void go(){
       JFrame frame = new JFrame();
       JPanel panel = new JPanel();
       panel.setBackground(Color.darkGray);
       
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       
       JButton button = new JButton("shock me");
       JButton buttonTwo = new JButton("bliss");
       
       panel.add(button);
       panel.add(buttonTwo);
       
       frame.getContentPane().add(BorderLayout.EAST, panel);
       
       frame.setSize(250,200);
       frame.setVisible(true);
   }
}
