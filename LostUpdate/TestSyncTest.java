
/**
 * Write a description of class TestSyncTest here.
 *
 * @author (zyu9)
 * @version (9/3/2020)
 */
public class TestSyncTest
{
    public static void main(String[] args){
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start(); 
    }
}
