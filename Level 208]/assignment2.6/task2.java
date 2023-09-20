import java.io.*;
import java.util.Scanner;

public class task2 {
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
System.out.println("Enter the directory of the file you would like read out");
File file = new File(input.nextLine());
BufferedInputStream bis = null;
FileInputStream fis= null;


try
{

fis = new FileInputStream(file);
bis = new BufferedInputStream(fis);

while( bis.available()>0 ){
System.out.print((char)bis.read());
}
}catch(FileNotFoundException fnfe)
{
System.out.println("The specified file not found" + fnfe);
}

catch(IOException ioe)
{
System.out.println("I/O Exception:" + ioe);
}

finally
{
try{
fis.close();
bis.close();
}catch(IOException ioe)
{
System.out.println("Error in InputStream close()" + ioe);
}
}
}
}