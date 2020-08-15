
/**
 * Write a description of class TestFormats here.
 *
 * @author (your name)
 * @version (8/15/2020)
 */
public class TestFormats
{
    public static void main(String[] args){
        String s = String.format("%,d", 1000000000);
        System.out.println("I have $" + s);
        String n = String.format("I have %.2f bugs to fix.",476578.09876);
        System.out.println(n);
        String n2 = String.format("I have %,.2f bugs to fix.",476578.09876);
        System.out.println(n2);
        int one = 20456654;
        double two = 100567890.248907;
        String e = String.format("The rank is %,d out of %,.2f",one,two);
         System.out.println(e);
    }
}
