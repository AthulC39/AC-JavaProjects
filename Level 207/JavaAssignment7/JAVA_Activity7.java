class JAVA_Activity7
{
public static void disp(char c)
{
System.out.println(c);
}
public static void disp(char c, int num)
{
System.out.println(c + " "+num);
}
public static void main(String args[])
{
DisplayOverloading obj = new DisplayOverloading();
obj.disp('a');
obj.disp('a',10);
}}