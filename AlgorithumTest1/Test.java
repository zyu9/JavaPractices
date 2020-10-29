import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Cisco Algorithum Assessment: largest sub array 
 * cheeborad problem, this problem 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String args[] )
    {
	// Write your code here
    	// System.out.println("Please enter the size of the array: ");
	Scanner s = new Scanner(System.in);
	int num = s.nextInt(); //Get the input of size
	int[] array = new int[num]; //Declare an array of size num
	int odd = 0; //Declare number of odds 
	int repeat = 0;
	
	for(int i = 0; i < num; i++){
	    //System.out.println("Please enter the value of the array: ");
	    int n = s.nextInt(); //Get the input of the array
	    array[i] = n; 
	}
		
	//Find the odd integers in the array
	//Find the repeated odd values in the array
	//Count the number of odds - repeated value and print it out
	for(int j = 0; j < num; j++){
	    if(array[j] % 2 != 0){
	        odd = odd + 1; 
	        for(int k = j + 1; k < num; k++){
	           if(array[j] == array[k]){
	               repeat = repeat + 1; 
	           }
	        }
	    }
	}
	System.out.println(odd - repeat + 1);
		
    }
}
