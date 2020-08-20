import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class SimpleGui1B here.
 *
 * @author (zyu9)
 * @version (8/20/2020)
 */
public class SimpleGui1B implements ActionListener
{
    JButton button;
    
    public static void main(String[] args){
        SimpleGui1B gui = new SimpleGui1B();
        gui.go(); 
    }
    
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");
        
        button.addActionListener(this);
        
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
    }
}
