
/**
 * Write a description of class SimpleDotComTestDrive here.
 *
 * @author (your name)
 * @version (8/6/2020)
 */
public class SimpleDotComTestDrive
{
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}
