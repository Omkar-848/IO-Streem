    package IO_streem;
    import java.io.FileOutputStream;
	import java.io.FileInputStream;
	import java.io.IOException;

	    public class ByteReadWriteExample {
	    public static void main(String[] args) { 
	    String message = "Hello, this is Java file I/O using bytes!";
	    String fileName = "message.txt";

	        try {
	            // Writing to file using write()
	            FileOutputStream fos = new FileOutputStream(fileName);
	            for (int i = 0; i < message.length(); i++) {
	            fos.write(message.charAt(i)); // write() writes one byte at a time
	            
	            }
	            fos.close();
	            System.out.println("Message written to file.");

	            // Reading from file using read()
	            FileInputStream fis = new FileInputStream(fileName);
	            int ch;
	            System.out.print("File content: ");
	            while ((ch = fis.read()) != -1) { 
	            System.out.print((char) ch); // read() returns one byte at a time
	            
	            }
	            fis.close();
	            } 
	            catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


