
/**
 * Test the Dog class
 *
 * @author (zyu9)
 * @version (8/4/2020)
 */
public class Driver
{
    String name;
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        dog1.name = "Luna";
        
        Dog[] myDogs = new Dog[3];
        for(int i = 0; i < myDogs.length; i++)
        {
            myDogs[i] = new Dog(); 
        }
        
        myDogs[0] =  dog1; 
        myDogs[1].name = "Cathy";
        myDogs[2].name = "Marge";
        
        System.out.print("First Dog's name is : " + myDogs[0].name);
             
        int n = (int)(Math.random() * myDogs.length);
        int d = (int)(Math.random() * 3); 
        int x = 0; 
        
        while(x < myDogs.length){
            switch(d)
            {
            case 0: myDogs[n].eat();
                  break;
            case 1: myDogs[n].chaseCat(); 
                  break;
            case 2: myDogs[n].bark(); 
                  break; 
            }
            x = x + 1;
        }
}
}
