import java.util.*; 
/**
 * Write a description of class TestGenerics2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestGenerics2
{
    public static void main(String[] args){
        new TestGenerics2().go();
    }
    
    public void go(){
        ArrayList<Animal> animals = new ArrayList<Animal>(); 
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        
        takeAnimals(animals);
    }
    
    public void takeAnimals(ArrayList<? extends Animal> animals){
        for(Animal a: animals){
            a.eat(); 
        }
    }
}
