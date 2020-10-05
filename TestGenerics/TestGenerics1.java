import java.util.*; 
/**
 * Write a description of class TestGenerics1 here.
 *
 * @author (zyu9)
 * @version (10/4/2020)
 */
public class TestGenerics1
{
    public static void main(String[] args){
        new TestGenerics1().go();
    }
    
    public void go(){
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }
    
    public void takeAnimals(Animal[] animals){
        for(Animal a: animals){
            a.eat(); 
        }
    }
}
