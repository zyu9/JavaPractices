import javax.swing.*;
import java.awt.*; 
/**
 * Write a description of class Button1 here.
 *
 * @author (zyu9)
 * @version (8/24/2020)
 */
public class Button1
{
    public static void main(String[] args){
        Button1 gui = new Button1();
        gui.go(); 
    }
    
    public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("Click This!");
        Font bigFont = new Font("serif", Font.BOLD,28);
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}