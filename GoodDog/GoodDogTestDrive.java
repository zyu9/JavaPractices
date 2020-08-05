
/**
 * Write a description of class GoodDogTestDrive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoodDogTestDrive
{
    public static void main(String[] args){
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        
        one.bark();
        two.bark(); 
    }
}
