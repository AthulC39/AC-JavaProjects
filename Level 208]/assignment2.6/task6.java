import java.io.*;
public class task6 {
public static void main(String[] args) {
File file = new File("C:\\Users\\ATHUL\\OneDrive\\Desktop\\myfile1.txt");
BufferedInputStream bis = null;
FileInputStream fis= null;
char content;

try
{

fis = new FileInputStream(file);
bis = new BufferedInputStream(fis);

while( bis.available()>0 ){
content=(char)bis.read();
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


FileOutputStream fos = null;
String mycontent = content;
try {

file = new File("C:\\Users\\ATHUL\\OneDrive\\Desktop\\myfile2.txt");
fos = new FileOutputStream(file);

if (!file.exists()) {
file.createNewFile();
}

byte[] bytesArray = mycontent.getBytes();
fos.write(bytesArray);
fos.flush();
System.out.println("File Written Successfully");
}
catch (IOException ioe) {
ioe.printStackTrace();
}
finally {
try {
if (fos != null)
{
fos.close();
}
}
catch (IOException ioe) {
System.out.println("Error in closing the Stream");
}
}
}