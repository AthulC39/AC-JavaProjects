
import java.util.Scanner;

public class secondTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Please enter 5 groceries you'd like to purchase.");
String Item1=input.nextLine();
String Item2=input.nextLine();
String Item3=input.nextLine();
String Item4=input.nextLine();
String Item5=input.nextLine();
String [] Groceries={Item1,Item2,Item3,Item4,Item5};
int discount=0;
double [] Price={5.69,28.99,10.45,3.99,44.99};
double TotalPrice=(Price[0]+Price[1]+Price[2]+Price[3]+Price[4]);
if (TotalPrice<50){
    discount=5;
}
    else {
        if (TotalPrice<100 && TotalPrice>50){
            discount=10;
        }
            else{
                if (TotalPrice>100) {
                    discount=15;
                }
            }
        }
TotalPrice=TotalPrice-discount;
System.out.println("Your total is: ");
System.out.println("$" + TotalPrice + "with discount of $" + discount);

    }
}









