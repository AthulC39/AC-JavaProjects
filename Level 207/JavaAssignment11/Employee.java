public class Employee{
    int id;
    String firstName;
    String lastName;
    int salary;
    
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int a){
        salary +=a;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int a){
        int percent= a/100;
        return salary * percent;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}