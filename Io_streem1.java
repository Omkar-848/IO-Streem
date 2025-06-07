package IO_streem;
import java.io.*;


public class Io_streem1 {

    public static void main(String[] args) {

        try {
            FileOutputStream file1 = new FileOutputStream("abc.txt");

            String S = "Welcome To the Felix_its";

            byte[] b = S.getBytes(); // convert string to byte array

            file1.write(b); // write byte data to file

            file1.close(); // close the stream

            System.out.println("success......");
            
            }
            catch (IOException e) {
            System.out.println(e);
        }
    }
}
