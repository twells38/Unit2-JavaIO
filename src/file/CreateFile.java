package file;

import java.io.File;

public class CreateFile {
    public static void main(String[] ars){
        //create the object that represents that particular file on the system.
        File textFile = new File("abc.txt");
        //check if the particular file exist or not
        System.out.println(textFile.exists());

       String currentDirectory =  System.getProperty("user.dir");
        System.out.println("The current working directory is: " + currentDirectory);

        File srcFolder = new File("src");
        System.out.println(srcFolder.exists());
    }
}

/*
* Methods in File class
* createNewFile()
* canWrite()
* canRead()
* isDirectory()
* getName()
* lastModified()
* mkdir()
* delete()
* list()
* */

/*
* Base classes in java.io package
* inputStream - class for all input bye stream
* outputStream - class for all output byte stream
* Reader - class for all input character stream
* Writer = class for all output character stream
*/

/*
* FileInputStream -> it reads file data as the stream of byte.
* FileOutputStream -> it writes to the file as the stream of bytes.
* FileReader -> it reads file as the stream of characters
* FileWriter -> it writes to the file as the stream of characters.
* BufferedInputStream -> Read data as bytes from the existing stream to improve its performance
* BufferedOutputStream => write data as byes to the exist stream to improve its performance
* BufferedReader -> read data as characters from the exist in stream to improve its performance
* BufferedReader -> read data as characters from the existing stream to improve its performance.
* BufferedWrite => writes data as characters to the existing stream to improve its performance.
* ObjectInStream => it deserializes the java objects from an input stream
* ObjectOutputStream => it serializes the java objects to the output stream.*/


