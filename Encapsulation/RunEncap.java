
/**
 * Benefits of Encapsulation: 
 * -The fields of a class can be made read-only or write-only.
 * -A class can have total control over what is stored in its 
 *   fields.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RunEncap
{
    public static void main(String[] args){
        EncapTest encap = new EncapTest();
        encap.setName("Tom");
        encap.setAge(27);
        encap.setIdNum("54321ns");
        
        System.out.print("Name: " + encap.getName() 
        + "\nAge: " + encap.getAge());
    }
}
