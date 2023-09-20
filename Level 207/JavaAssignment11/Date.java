public class Date{
    int day;
    int month;
    int year;
    String date;
Date(int dayn, int monthn, int yearn){
    day=dayn;
    month=monthn;
    year=yearn;
    
}
public int setDay(int a){
    day=a;
    return day;
}
public int setMonth(int a){
    month=a;
    return month;
}
public int setYear(int a){
    year=a;
    return year;
}
public String setDate(int a, int b, int c){
    date= "The Date is: " + a + " of " + b + c;
    return date;
}
}