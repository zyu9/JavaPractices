
/**
 * Write a description of class TestSync here.
 *
 * @author (zyu9)
 * @version (9/3/2020)
 */
class TestSync implements Runnable
{
    private int balance;
    
    public void run(){
        for(int i = 0; i < 50; i++){
            increment();
            System.out.println("balance is " + balance);
        }
    }
    
    public synchronized void increment(){
        int i = balance;
        balance = i + 1;
    }
}
