
import java.util.Scanner;

public class fifthTask{

public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.print("Enter a year:  ");
int number= input.nextInt();
if(number %4==0 || number %400==0) {
   System.out.print("This year is a leap year");
    
}else

    System.out.print("Your entered year is not a leap Year"); 
}
}

   




