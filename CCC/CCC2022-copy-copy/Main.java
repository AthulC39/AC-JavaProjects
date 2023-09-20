import java.util.Scanner;


public class Main
{
     public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    int val1=input.nextInt();
    int val2=input.nextInt();
    int val3=input.nextInt();
    
    
      System.out.println(sample(val1,val2,val3));


}
public static int[] sample(int a,int b, int c)
{
    int gSamples[]= new int[a];
    int samples=0;
    gSamples[0]=1;
    for (int i=0; i<=a; i++)
    {
        gSamples[i]=b-1;
    }
    for(int k=0; k<a; k++)
    {
        for(int j=0; j<a; j++)
        {
            samples++;
        }
    }
    if(samples!= c)
    {
       
        return null;
    }
    return gSamples;
}
}
