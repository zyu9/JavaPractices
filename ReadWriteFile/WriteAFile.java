import java.io.*; 
/**
 * Write a description of class WriteAFile here.
 *
 * @author (zyu9)
 * @version (8/29/2020)
 */
public class WriteAFile
{
   public static void main(String[] args){
       try{
           FileWriter writer = new FileWriter("Foo.txt");
           writer.write("hello foo!");
           writer.close();
       }catch(IOException ex){
           ex.printStackTrace(); 
       }
   }
}
