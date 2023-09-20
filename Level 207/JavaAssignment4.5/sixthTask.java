
import java.util.Scanner;

public class sixthTask{

public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Select a number to print odd natural numbers upto: ");
int limit=input.nextInt();
int sum=0;
for (int i=1; i<=limit; ++i) {
    System.out.println((i * 2)-1);
    sum= sum + (i * 2)-1;
}
System.out.println("The sum of odd natural numbers upto " + limit + " is " + sum); 
}
}



