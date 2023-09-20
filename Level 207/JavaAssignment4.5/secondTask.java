
import java.util.Scanner;

public class secondTask{

public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Select a number to print sums of natural numbers up to: ");
int Limit=input.nextInt();
for (int i=1; i<=Limit; ++i) {
    System.out.println(i + i);
    
}
}
}

