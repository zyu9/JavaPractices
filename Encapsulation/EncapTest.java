
/**
 * From https://www.tutorialspoint.com/java/java_encapsulation.htm
 * Four fundamental OOP concepts: Encapsulation, inheritance, 
 * polymorphism, and abstraction. 
 * 
 * wrapping variables and methods together as a single unit.
 *
 *In encapsulation, the variables of a class will be hidden from 
 * other classes, and can be accessed only through the methods of 
 * their current class. (data hiding)
 *
 * @author (zyu9)
 * @version (8/5/2020)
 */
public class EncapTest
{
    private String name;
    private String idNum;
    private int age; 
    /**
     * getters and setters => accessing points
     * any class that wants to access the variables should access 
     * them through these getters and setters
     */
    public int getAge(){
        return age; 
    }
    
    public String getName(){
        return name; 
    }
    
    public String getIdNum(){
        return idNum;
    }
    
    public void setAge(int newAge){
        age = newAge; 
    }
    
    public void setName(String newName){
        name = newName; 
    }
    
    public void setIdNum(String newId){
        idNum = newId; 
    }
}
