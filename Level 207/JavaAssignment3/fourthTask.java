
import java.util.Scanner;

public class fourthTask{

public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter a single alphabet character: ");
char letter=sc.next().charAt(0);
if (letter=='a' || letter=='e' ){
    System.out.print("Your letter is a Vowel");
}else if(letter=='i'||letter=='o' || letter=='u'){
System.out.print("Your letter is a Vowel");
}else{
 System.out.print("Your letter is Consonant");
}
 }   
}



