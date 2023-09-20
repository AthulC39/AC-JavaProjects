import java.util.Scanner;

public class thirdTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
int[] array= new int[20];
int positive=0;
int negative=0;
int odd=0;
int even=0;
int zero=0;
System.out.println("Please enter 20 integers");
for (int i=0; i<=19; ++i) {
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
            System.out.println("The statistics of your entered 20 numbers are");
            System.out.println("positive # = " + positive);
            System.out.println("negative # = " + negative);
            System.out.println("zero # = " + zero);
            System.out.println("even #s = " + even);
            System.out.println("odd #s = " + odd);
            

            }
            
        }
             
         
    

