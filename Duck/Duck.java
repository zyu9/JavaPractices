
/**
 * Write a description of class Duck here.
 *
 * @author (your name)
 * @version (8/14/2020)
 */
public class Duck
{
    private int size;
    private static int duckCount = 0;
    
    public Duck(){
        duckCount++; 
    }
    
    public void setSize(int s){
        size = s; 
    }
    
    public int getSize(){
        return size; 
    }
}
