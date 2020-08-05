
/**
 * 'Blueprint' for Dog objects
 *
 * @author (zyu9)
 * @version (8/4/2020)
 */
public class Dog
{
    String name; 
    
    public void name(String n)
    {
        name = n; 
    }
    
    public void bark()
    {
        System.out.println("\n"+ name + " says Ruff!");
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
