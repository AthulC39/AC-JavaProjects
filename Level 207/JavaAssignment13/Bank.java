 import java.util.*;
public class Bank extends Account
{
    
     void update(double a,boolean savingsElse,double b)
    {
        if(savingsElse==true)
        {
             SavingsAccount.addInterest(a);
        }
        else
        {
            if(a>CurrentAccount.setOverdraftLimit(b))
            {
                System.out.println("A letter has been sent to your email regarding a limit violation");
            }
        }
    }
    void open(int a,String fullName, boolean savingsElse)
    {
        System.out.println("Account is opened in the name: " + fullName);
        accnum=a;
        if(savingsElse==true){
            System.out.println("A Savings Account has been opened");
        }
        else
        {
            System.out.println("A Chequeing account has been opened");
        }
    }
    void close( String fullName, double a)
    {
        System.out.println("An account under the name: " + fullName + "is being closed");
        System.out.println("$" + a + " was found in the account, and is being transfered in case.");
        
    }
}
