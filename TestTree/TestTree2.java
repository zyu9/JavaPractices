import java.util.*; 
/**
 * Write a description of class TestTree2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestTree2
{
   public static void main(String[] args){
        new TestTree().go();
   }
    
   class Book implements Comparable{
      String title;
      public Book(String t){
          title = t; 
      }
        
      public int compareTo(Object b){
          Book book = (Book) b; 
          return title.compareTo(book.title);
      }
   }
    
    public class BookCompare implements Comparator<Book>
   {
     public int compare(Book one, Book two){
         return (one.title.compareTo(two.title));
     }
   }
   
   class Test{
       public void go(){
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        BookCompare bCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<Book> (bCompare);
        tree.add(new Book("How Cats Work"));
        tree.add(new Book("Remix your Body"));
        tree.add(new Book("Finding Emo"));
        System.out.println(tree);
        }
    }
}
