import java.util.Calendar; 
/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (8/16/2020)
 */
public class Time
{
    public static void main(String[] args){
       Calendar c = Calendar.getInstance();
       c.set(2020,7,16,14,40);
       long day1 = c.getTimeInMillis();
       day1 += 1000 * 60 * 60;
       c.setTimeInMillis(day1);
       System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
       c.add(c.DATE,35);
       System.out.println("add 35 days " + c.getTime());
       c.roll(c.DATE,35);
       System.out.println("roll 35 days " + c.getTime());
       c.set(c.DATE, 1);
       System.out.println("set to 1 " + c.getTime());
    }
}
