import java.io.*;
public class task4 {
public static void main(String[] args) {
FileOutputStream fos = null;
File file;
String mycontent = "This is the program of File handling in JAVA";
try {

file = new File("C:\\Users\\ATHUL\\OneDrive\\Desktop\\myfile1.txt");
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
}