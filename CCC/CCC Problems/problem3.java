import java.util.Scanner;


public class problem3
{
      
    static int totalTime=0;
       public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         int amountOfFriends= input.nextInt();
         for(int i=0; i<amountOfFriends; i++)
         {
    
          findTime(input.nextInt(),input.nextInt(),input.nextInt());
            
        }
            System.out.println(totalTime);
    }
    public static void findTime(int p,int w, int d)
    {
        int c =15;
        int LRange=p-d;
        int RRange=p+d;
        int distanceTraveled=0;
        if(c>=LRange && c<=RRange) //might  be irreleveant
        {
            totalTime += 0;
        }
        while(c>RRange && c>=p)
        {
           distanceTraveled++;
           RRange++;
        }
        while(c<LRange && c<=p)
        {
           distanceTraveled++;
           LRange--;
        }
        totalTime += (distanceTraveled*w);
    }
    
}
