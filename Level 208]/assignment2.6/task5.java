import java.io.*;
public class task5 {
public static void main(String[] args) {
File file = new File("C:\\Users\\ATHUL\\OneDrive\\Desktop\\myfile1.txt");
BufferedInputStream bis = null;
FileInputStream fis= null;
int count=0;

try
{

fis = new FileInputStream(file);
bis = new BufferedInputStream(fis);

while( bis.available()>0 ){
System.out.print((char)bis.read());
count ++;
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
System.out.println("Total Words in this file:" + count);
}
}