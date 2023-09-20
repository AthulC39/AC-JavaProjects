import java.util.Scanner;

public class secondTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
int []array= new int[10];
int True=0;
System.out.println("Please enter 10 integers");
for (int i=0; i<=9; ++i) {
     array[i] =input.nextInt();
   
}
System.out.println("Please enter one integer");
int number=input.nextInt();
for (int i=0; i<=array.length; ++i){
    if (number==array[i]) {
       System.out.println("Your entered number is part of the original 10");
        True=1;
       break;    
}
}
if (True!=1) {
    System.out.println("Your entered number is not part of the original 10");
}
}
}
