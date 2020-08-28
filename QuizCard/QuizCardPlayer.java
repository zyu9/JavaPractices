import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*; 
/**
 * Write a description of class QuizCardPlayer here.
 *
 * @author (zyu9)
 * @version (8/28/2020)
 */
public class QuizCardPlayer
{
    private JTextArea display;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private QuizCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer; 
    
    public static void main(String[] args){
        QuizCardPlayer reader = new QuizCardPlayer();
        reader.go(); 
    }
    
    public void go(){
        //build gui
        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);
        
        display = new JTextArea(10,20);
        display.setFont(bigFont);
        
        display.setLineWrap(true);
        display.setEditable(false);
        
        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       nextButton = new JButton("Show Question");
       mainPanel.add(qScroller);
       mainPanel.add(nextButton);
       nextButton.addActionListener(new NextCardListener());
       
       JMenuBar menuBar = new JMenuBar();
       JMenu fileMenu = new JMenu("File");
       JMenuItem loadMenuItem = new JMenuItem("Load card set");
       loadMenuItem.addActionListener(new OpenMenuListener());
       fileMenu.add(loadMenuItem);
       menuBar.add(fileMenu);
       frame.setJMenuBar(menuBar);
       frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
       frame.setSize(640, 500);
       frame.setVisible(true);
    }
}
