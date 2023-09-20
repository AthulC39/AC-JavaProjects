import java.util.Scanner;

public class firstTask
{
Scanner input= new Scanner(System.in);
    String firstName="blank";
    String lastName="blank";
public  void main(String[] args){
    System.out.println("Please enter author first and last name please");
    setfirstName(sc.nextLine());
    setlastName(sc.nextLine());
    System.out.println("Please enter book title and price please");
    setBookTitle(sc.nextLine());
    setPrice(input.nextInt());
    AuthorDetails(firstName,lastName);
    Book_Detail(bookTitle);
}
  
    public String setFirstName(String a)
    {
       firstName=a;
       return a; 
    }
    public String setLastName(String a)
    {
        lastName=a;
        return a;
    }
    public String getFirstName(String a)
    {
    firstName=a;
       return firstName; 
   
}
public String getLastName(String a)
{
   lastName=a;
        return lastName; 
}
public String AuthorDetails(String a,String b)
{
    System.out.println("Author Details: ");
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    return a;
}
String bookTitle="blank";
String authorName = "";
int price=0;
public String setBookTitle(String a){
 bookTitle=a;
 return a;
}
public String setAuthorName(String a){
    authorName= firstName + " " + lastName;
    return authorName;
}
public int setPrice(int a){
    price=a;
    return price;
}
public void Book_Detail(String a){
    System.out.println("Book Details: ");
    System.out.println("Book Name " + bookTitle);
    System.out.println("Author Name " + authorName);
    System.out.println("Price $" + price);
}
}

