import javax.sound.midi.*; 
/**
 * Write a description of class MusicTest1 here.
 *
 * @author (zyu9)
 * @version (8/17/2020)
 */
public class MusicTest1
{
    public void play(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        }catch(MidiUnavailableException ex){
            System.out.println("Bummer");
        }
        
    }//close play
    
    public static void main(String[] args){
            MusicTest1 mt = new MusicTest1();
            mt.play(); 
    }//close main
}//close class
