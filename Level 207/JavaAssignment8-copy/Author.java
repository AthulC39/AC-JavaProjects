
import java.util.Scanner;
public class Author
{

    static String  firstName;
    static String lastName;
    static String BookName;
    static double price;
    
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        Author obj = new Author();
        
        obj.setFirstName("Russel");
        obj.setLastName("Winderand");
        obj.setBookName("Developing Java Software") ;
        obj.setPrice(79.75);
        AuthorDetails(firstName,lastName);
        BookDetails(BookName,price);
    }
  public  void setPrice(double a)
    {
          price =  a;
    }
    public  static void setFirstName(String ab)
    {
          firstName =  ab;
    }
    public  void setBookName(String ab)
    {
         BookName =  ab;
    }
    public void setLastName(String a)
    {
        lastName=a;
        
    }
    public String  getFirstName()
    {
       return firstName; 
   
    }
    public String getLastName()
    {
    
            return lastName; 
    }
    public static void AuthorDetails(String a, String b)
    {
         System.out.println("Author Details:"); 
         System.out.println("First name: " + a);
         System.out.println ("Last Name: " + b);
    }
    public static void BookDetails(String a, double b)
    {
         System.out.println("Book Details:"); 
         System.out.println("Name: " + a);
         System.out.println ("Price: " + b);
    }
}

