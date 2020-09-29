import java.util.*;
import java.io.*; 
/**
 * Write a description of class Jukebox1 here.
 *
 * @author (zyu9)
 * @version (9/29/2020)
 */
public class Jukebox1
{
   ArrayList<String> songList = new ArrayList<String>();
   
   public static void main(String[] args){
       new Jukebox1().go(); 
   }
   
   public void go(){
       getSongs();
       System.out.println(songList);
       Collections.sort(songList);
       System.out.println(songList);
   }
   
   void getSongs(){
       try{
           File file = new File("SongList.txt");
           BufferedReader reader = new BufferedReader(new FileReader(file));
           String line = null;
           while((line = reader.readLine()) != null){
               addSong(line);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
   
   void addSong(String lineToParse){
       String[] tokens = lineToParse.split("/");
       songList.add(tokens[0]);
   }
}
