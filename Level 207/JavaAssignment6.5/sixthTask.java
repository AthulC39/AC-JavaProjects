import java.util.Scanner;

public class sixthTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
int[] array= new int[10];
int[] array2=new int[10];
int positive=0;
int negative=0;
int odd=0;
int even=0;
int zero=0;
int positive1=0;
int negative1=0;
int odd1=0;
int even1=0;
int zero1=0;
System.out.println("Please enter 10 integers");
for (int i=0; i<=9; ++i) {
    array[i]=input.nextInt();
    if (array[i]>0) {
         positive=positive + 1;
        }else{
            if (array[i]<0) {
                negative=negative + 1;
            }else{
                if (array[i]==0) {
                    zero=zero + 1;
                }else{
                    if (array[i]%2==0) {
                        even=even+1;
                    }else{
                        if (array[i]%2!=0) {
                            odd=odd + 1;
                        }
                    }
                    }
                }
                }
            }
            System.out.println("Please enter 10 more integers");
            for (int i=0; i<=9; ++i) {
    array2[i]=input.nextInt();
    if (array2[i]>0) {
         positive1=positive1 + 1;
        }else{
            if (array2[i]<0) {
                negative1=negative1 + 1;
            }else{
                if (array2[i]==0) {
                    zero1=zero1 + 1;
                }else{
                    if (array2[i]%2==0) {
                        even1=even1+1;
                    }else{
                        if (array2[i]%2!=0) {
                            odd1=odd1 + 1;
                        }
                    }
                    }
                }
                }
            }
if (positive==positive1) {
         System.out.println("Both arrays have the same amount of positive numbers");
        
            if (negative==negative1) {
                System.out.println("Both arrays have the same amount of negative numbers");
            
                if (zero==zero1) {
                  System.out.println("Both arrays have the same amount of zero numbers");
                
                    if (even==even1) {
                    System.out.println("Both arrays have the same amount of even numbers");
                    }else{
                        if (odd==odd1) {
                  System.out.println("Both arrays have the same amount of odd numbers");
                        }
                    }
                    }
                }
                }
            }
            
        }
             
         
    

