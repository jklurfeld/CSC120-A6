import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    collection = new Hashtable<String, Boolean>();
  }

  public void addTitle(String title){
    collection.put(title,true);
  }

  public String removeTitle(String title){
    collection.remove(title);
    return title;
  }

  public void checkOut(String title){
    if (collection.containsKey(title)){
      collection.replace(title,false);
    }
  }

  public void returnBook(String title){
    if (collection.containsKey(title)){
      collection.replace(title,true);
    }
  }
  // returns true if the title appears as a key in the Libary's collection, false otherwise
  public boolean containsTitle(String title){
    return collection.containsKey(title);
  }

  // returns true if the title is currently available, false otherwise
  public boolean isAvailable(String title){
    return collection.get(title);
  }

  // used https://www.programiz.com/java-programming/library/hashmap/foreach for an example on how to use the forEach() method
  // prints out the entire collection in an easy-to-read way (including checkout status)
  public void printCollection(){
    System.out.println("Printing this library's collection...");
    collection.forEach((key, value) -> {
      System.out.print(key);
      if (value == true){
        System.out.println(" is available.");
      }
      else {
        System.out.println(" is not available.");
      }
    });
  }
  
  public static void main(String[] args) {
    Library myLib = new Library("Neilson", "1 Green Street", 4);
    myLib.addTitle("The Lorax by Dr. Seuss");
    myLib.addTitle("Harry Potter by JK Rowling");
    myLib.checkOut("Harry Potter by JK Rowling");
    myLib.checkOut("The Lorax by Dr. Seuss");
    myLib.returnBook("The Lorax by Dr. Seuss");
    System.out.println(myLib.containsTitle("The Lorax by Dr. Seuss"));
    System.out.println(myLib.isAvailable("The Lorax by Dr. Seuss"));
    myLib.printCollection();
  }
  
}