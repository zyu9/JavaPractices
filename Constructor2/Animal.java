
/**
 * Abstract class Animal - write a description of the class here
 *
 * @author (your name here)
 * @version (8/13/2020)
 */
public abstract class Animal
{
   private String name;
   
   public String getName(){
       return name; 
   }
   
   public Animal(String theName){
       name = theName; 
   }
}
