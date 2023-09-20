
 
public class SavingsAccount extends Account
{
static double interestRate=0.13;
    public static double addInterest(double a){
        //assuming a is the balance or value
        a *= interestRate;
        
        return a;
    }
   
   
}
