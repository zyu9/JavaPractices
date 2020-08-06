
/**
 * Write a description of class DotComGame here.
 *
 * @author (your name)
 * @version (8/6/2020)
 */
public class DotComGame
{
    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        
        int[] locations = {randomNum,randomNum+1,randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true; 
        
        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++; 
            if(result.equals("Kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + "guesses");
            } //close if
        }//close while
    }//close main
}
