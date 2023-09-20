
import java.util.Scanner;

public class firstTask{
    static int width=0;
   static int height=0;
public static void main(String[] args){
     Scanner input= new Scanner(System.in);
    Rectangle r;
     Rectangle obj = new Rectangle();
   
System.out.println("Areas of 3 different Rectangles below:");
System.out.println("Rectangle 1:");
obj.npRectangle();
System.out.println("Rectangle 2:");
obj.rectangle(2,4);
System.out.println("Rectangle 3:");
obj.onepRectangle(3);
}
public  static class Rectangle{
   
    public static  void npRectangle(){
    width=0;
    height=0;
    System.out.println("Area = " + width*height);
    
}
public static void rectangle(int a, int b){
    width=a;
    height=b;
    System.out.println("Area = " + a*b);
    
}
public static void onepRectangle(int a){
   width=a;
   height=a;
   System.out.println("Area = " + a*a);
    
}
}
}





