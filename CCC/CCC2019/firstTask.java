import java.util.Scanner;

public class firstTask
{
   static int [] nums={1,2,3,4};
   
   
       public static void main(String[] args) {
           Scanner input= new Scanner(System.in);
           int count=0;
         String in=input.nextLine();
           for(int i = 0; i < in.length(); i++) {    
            if(in.charAt(i) != ' ')    
                count++;    
        }    
         for(int i=0; i<count; i++)
         {
    
          flip(input.next().charAt(i));
            
        }
            System.out.println(nums[0] + " " + nums[1] );
              System.out.println(nums[2] + " " + nums[3] );

}
public static void flip(char a)
{
    if(a=='h')
    {
        int temp1=nums[2];
        nums[2]=nums[0];
        nums[0]=temp1;
        
        temp1=nums[3];
        nums[3]=nums[1];
        nums[3]=temp1;
        
    }
    if(a=='v')
    {
        int temp1=nums[1];
        nums[1]=nums[0];
        nums[0]=temp1;
        
        temp1=nums[2];
        nums[2]=nums[3];
        nums[3]=temp1; 
    }
 
}

}
