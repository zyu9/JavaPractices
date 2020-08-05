
/**
 * Encapsulation
 *
 * @author (your name)
 * @version (8/5/2020)
 */
public class GoodDog
{
    //Make the instance variable private
    private int size;
   
    /**
     * Make the getter and setter methods public
     */
    public int getSize(){
        return size; 
    }
    
    public void setSize(int s){
        size = s; 
    }
    
    void bark(){
        if(size > 60){
            System.out.println("Wooof! Wooof!");
        }else if(size > 14 && size < 60){
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("Yip! Yip!");
        }
    }
}
