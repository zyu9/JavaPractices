
/**
 * 'Blueprint' for Dog objects
 *
 * @author (zyu9)
 * @version (8/4/2020)
 */
public class Dog
{
    int size; 
    String name; 
    
    public void name(String n)
    {
        name = n; 
    }
    
    public void bark(int numOfBarks)
    {
        while (numOfBarks > 0){
        if(size > 60){
            System.out.println("\n"+ name + " says Wooof!");
        }else if(size > 14 && size < 60){
            System.out.println("\n"+ name + " says Ruff!");
        }else{
            System.out.println("\n"+ name + " says Yip!");
        }
        numOfBarks = numOfBarks - 1; 
       }
    }
    
    public void eat()
    { 
        System.out.println("\n"+ name + " eats dinner!");
    }
    
    public void chaseCat()
    {
        System.out.println("\n"+ name + " chases a cat!");
    }
}
