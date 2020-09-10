import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.event.*; 
/**
 * Write a description of class BeatBoxFinal here.
 *
 * @author (zyu9)
 * @version (9/9/2020)
 */
public class BeatBoxFinal
{
    JFrame theFrame;
    JPanel mainPanel;
    JList incomingList;
    JTextField userMessage;
    ArrayList<JCheckBox> checkboxList;
    int nextNum;
    Vector<String> listVector = new Vector<String>();
    String userName;
    ObjectOutputStream out;
    ObjectInputStream in; 
    HashMap<String, boolean[]> otherSeqsMap = new HashMap<String, boolean[]>();
    
    Sequencer sequencer;
    Sequence sequence;
    Sequence mySequence = null;
    Track track; 
    
   String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat",
    "Open Hi-Hat","Acoustic Snare", "Crash Cymbal", "Hand Clap",
  "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga",
  "Cowbell", "Vibraslap","Low-mid Tom", "High Agogo", "Open Hi Conga"};
  int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
  
  public static void main(String[] args){
      new BeatBoxFinal().startUp(args[0]);
  }
  
  public void startUp(String name){
      userName = name;
      //open connection to the server
      try{
          Socket sock = new Socket("127.0.0.1", 4242);
          out = new ObjectOutputStream(sock.getOutputStream());
          in = new ObjectInputStream(sock.getInputStream());
          Thread remote = new Thread(new RemoteReader());
          remote.start();
      }catch(Exception ex){
          System.out.println("couldn't connect - you'll have to play alone.");
      }
      setUpMidi();
      buildGUI();
  }//close startUp
  
  public void buildGUI(){
      theFrame = new JFrame("Cyber BeatBox");
      BorderLayout layout = new BorderLayout();
      JPanel background = new JPanel(layout);
      background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
      
      checkboxList = new ArrayList<JCheckBox>();
      
      Box buttonBox = new Box(BoxLayout.Y_AXIS);
      JButton start = new JButton("Start");
      start.addActionListener(new MyStartListener());
      buttonBox.add(start);
      
      JButton stop = new JButton("Stop");
      start.addActionListener(new MyStopListener());
      buttonBox.add(stop);
      
      JButton upTempo = new JButton("Tempo Up");
      upTempo.addActionListener(new MyUpTempoListener());
      buttonBox.add(upTempo);
      
      JButton downTempo = new JButton("Tempo Down");
      downTempo.addActionListener(new MyDownTempoListener());
      buttonBox.add(downTempo);
      
      JButton sendIt = new JButton("sendIt");
      sendIt.addActionListener(new MySendListener());
      buttonBox.add(sendIt);
      
      userMessage = new JTextField();
      buttonBox.add(userMessage);
      
      incomingList = new JList();
      incomingList.addListSelectionListener(new MyListSelectionListener());
      incomingList.setSelectionMods(ListSelectionModel.SINGLE_SELECTION);
      JScrollPane theList = new JScrollPane(incomingList);
      buttonBox.add(theList);
      incomingList.setListDate(listVector);
      
      Box nameBox = new Box(BoxLayout.Y_AXIS);
      for(int i = 0; i < 16; i++){
          nameBox.add(new Label(instrumentNames[i]));
      }
      background.add(BorderLayout.EAST, buttonBox);
      background.add(BorderLayout.WEST, nameBox);
      
      theFrame.getContentPane().add(background);
      GridLayout grid = new GridLayout(16,16);
      grid.setVgap(1);
      grid.setHgap(2);
      mainPanel = new JPanel(grid);
      background.add(BorderLayout.CENTER, mainPanel);
      
      for(int i = 0; i < 256; i++){
          JCheckBox c = new JCheckBox();
          c.setSelected(false);
          checkboxList.add(c);
          mainPanel.add(c);
      }//end loop
      
      setUpMidi();
      
      theFrame.setBounds(50,50,300,300);
      theFrame.pack();
      theFrame.setVisible(true);
  }//close method
  
  public void setUpMidi(){
      try{
          sequencer = MidiSystem.getSequencer();
          sequencer.open();
          sequence = new Sequence(Sequence.PPQ, 4);
          track = sequence.createTrack();
          sequencer.setTempoInBPM(120);
      }catch(Exception e){e.printStackTrace();}
  }//close method
  
  
}
