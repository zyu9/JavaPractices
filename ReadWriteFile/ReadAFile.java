import java.io.*; 
/**
 * Write a description of class ReadAFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadAFile
{
    public static void main(String[] args){
        try{
            File myFile = new File("MyText.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();            
        }catch(Exception ex){
            ex.printStackTrace(); 
        }
    }
}
