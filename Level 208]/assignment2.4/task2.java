import java.util.Scanner;

public class task2
{
   public static void main(String[] args)
   {
       Scanner input =new Scanner(System.in);
       int score=0;
       boolean questionDone=false;
       System.out.println("JAVA QUIZ GET READY!");
       System.out.println("This quiz is out of 10 marks.");
        System.out.println("enter the number your answer only ");
       System.out.println("-------------------");
       
       System.out.println("Q.a What Coding language is this quiz in?");
       System.out.println("1.Python");
        System.out.println("2. C# ");
        System.out.println("3. Java ");
        System.out.println("4. C++");
        if(input.nextInt() == 3)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q.b Which year did COVID-19 FIRST originate");
       System.out.println("1. 2019");
        System.out.println("2. 2020 ");
        System.out.println("3. 2024 ");
        System.out.println("4.1987");
        
        
         if(input.nextInt() == 1)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
        
       if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q.c  Who is the best NBA 3 Point Shooter of all time (statistically)");
       System.out.println("1.Lebron James");
        System.out.println("2. Micheal Jordan ");
        System.out.println("3. Larry Bird ");
        System.out.println("4.Stephen Curry");
        
        
         if(input.nextInt() == 4)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
        if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q.d  Who is the current Canadian Prime Minister");
       System.out.println("1. Joe Biden");
        System.out.println("2. Boris Johnson ");
        System.out.println("3. Angela Merkel ");
        System.out.println("4. Justin Trudeau");
        
        
         if(input.nextInt() == 4)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
        if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q. Which music artist has the most streams on their albums?");
       System.out.println("1. Taylor Swift");
        System.out.println("2. Eminem ");
        System.out.println("3. Kanye West ");
        System.out.println("4. Justin Bieber");
        
        
         if(input.nextInt() == 2)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
        if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q.f  Which one of the following is a co-founder of Google?");
       System.out.println("1. Bill Gates");
        System.out.println("2. Steve Jobs ");
        System.out.println("3. Larry Page ");
        System.out.println("4.Elon Musk");
        
        
         if(input.nextInt() == 3)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
        if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q.g  Who is the richest man in the world?");
       System.out.println("1. Elon Musk");
        System.out.println("2. Jeff Bezos ");
        System.out.println("3. Mukesh Ambani ");
        System.out.println("4. Mark Zukerberg");
        
        
         if(input.nextInt() == 1)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
       if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q.h Who is the tallest NBA Player ever? ");
       System.out.println("1. Yao Ming");
        System.out.println("2. Manute Bol ");
        System.out.println("3. Tacko Fall ");
        System.out.println("4. Anthony Davis");
        
        
         if(input.nextInt() == 2)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
       if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q.i  Who won the last FIFA World Cup?");
       System.out.println("1. Canada");
        System.out.println("2. England ");
        System.out.println("3. Italy ");
        System.out.println("4.France");
        
        
         if(input.nextInt() == 4)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
       if(questionDone==true)
       {
           questionDone=false;
           System.out.println("-------------------");
       
       System.out.println("Q.j When was the last time the Toronto Maple Leafs won a Stanley Cup");
       System.out.println("1. 2019");
        System.out.println("2. 1967 ");
        System.out.println("3. never ");
        System.out.println("4.2022");
        
        
         if(input.nextInt() == 2)
        {
            score++;
            questionDone=true;
        }
        else 
        {
        questionDone=true;
        }
       }
       System.out.println("-------------------------");
       System.out.println("Phew, finally done! Let's see how you did!");
       System.out.println("Your final Score:" + score);
        System.out.println("Thanks for playing!");
   }
}
