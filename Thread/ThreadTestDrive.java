
/**
 * Write a description of class ThreadTestDrive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThreadTestDrive
{
    public static void main(String[] args){
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        
        myThread.start();
        
        System.out.println("back in main");
    }
}
