
import java.util.*;
public class main extends Marks
{
  public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Welcome, which class's marks would you like to see? Science,Math,or English?");
        String Class = sc.nextLine();
      if(Class=="Science"){
          Science.getMarks();
          System.out.println("Which student's marks would you like to see? Please type student's roll number (0-30)");
          System.out.println("Your mark is a " + ScienceMarks[sc.nextInt()]);
      }
      else if(Class=="Math"){
          Math.getMarks();
                System.out.println("Which student's marks would you like to see? Please type student's roll number (0-30)");
          System.out.println("Your mark is a " + MathMarks[sc.nextInt()]);
      }
      else{
          English.getMarks();
              System.out.println("Which student's marks would you like to see? Please type student's roll number (0-30)");
              System.out.println("Your mark is a " + EnglishMarks[sc.nextInt()]);
      }
}
}
