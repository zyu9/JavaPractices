import java.io.*;
/**
 * Write a description of class GameHelper here.
 *
 * @author (your name)
 * @version (8/6/2020)
 */
public class GameHelper
{
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(
            new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0 ) return null;            
        }catch(IOException o){
            System.out.println("IOException: " + o);
        }
        return inputLine; 
    }
}
