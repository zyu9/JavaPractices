
/**
 * Write a description of class MammalInt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MammalInt implements Animal
{
    public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
}
