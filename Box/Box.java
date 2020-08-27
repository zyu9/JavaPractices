import java.io.*; 
/**
 * Write a description of class Box here.
 *
 * @author (zyu9)
 * @version (8/27/2020)
 */
public class Box implements Serializable
{
    private int width;
    private int height;
    
    public void setWidth(int w){
        width = w; 
    }
    
    public void setHeight(int h){
        height = h; 
    }
    
    public static void main(String[] args){
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);
        
        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close(); 
        }catch(Exception ex){
            ex.printStackTrace(); 
        }
    }
}
