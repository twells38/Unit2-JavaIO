package file;

import java.io.IOException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader= new FileReader("abc.txt");
       // int i = fileReader.read();
       /* while(i != -1){
            System.out.println((char)i);
            i = fileReader.read();
        }*/
       /* char[] c = new char[100];
        fileReader.read(c);
        System.out.println(c);

        */

        char []c = new char[10];
        fileReader.read(c,2,5);
       // System.out.println(c);
        for(char i :c){
            System.out.println("Char: "+ i);
        }
        fileReader.close(); // file object
    }
}

/*
 *Constructors in FileReader class
 *FileReader input =  new FileReader(String name)
 * FileReader fileReader = new FileReader(File filename)
 * FileReader fileReader = new FileReader(File filename, Charset)*/

/*
 * Important methods in FIleReadr class
 * read() - reads a dingle character from the reader
 * read(char[]array) - read the characters from the reader and stores in specified array
 * read(char[]array, int offset, int length) - reads the number of character equal to length from the reader and stores in the specified array starting from the position offset. /
 */

