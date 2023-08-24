package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("abc.txt");
        BufferedReader bufferedReader = new BufferedReader((fileReader));

        //read character by character
        /*int i = bufferedReader.read();
        while (i != -1) {
            System.out.println((char)i);
            i = bufferedReader.read();
        }*/

        //read line by line
        /*String s = bufferedReader.readLine();
        while( s != null){
            System.out.println(s);
            s = bufferedReader.readLine();
        }*/

        //read with the help of array
        /*char[] c = new char[10];
        bufferedReader.read(c);
        System.out.println(c);
        */

        char[] c = new char[10];
        bufferedReader.read(c, 1,3);
        System.out.println(c);

        bufferedReader.close();
    }
}


/*
 * Using bufferedReader class
 * a high level stream
 * Important methods in BufferedReader class
 * read()-> reads a dingle character from the internal buffer of reader
 * read(char[]array)-> reads characters from internal buffer and stores in a specified array.
 * read(char[]array, int offset, int length)-> reads characters from the internal buffer as per the length specified and stores the on the specified array starting from the off set mentioned.
 * */

/*
 * Point to remember
 * BuffedReader class is one of the most enhanced wa of reading data since its faster and much more efficient than low level ways.
 * BufferedReader accepts a low level stream object as an input
 * When closing the stream, you only need to close the BufferedReader stream and not the underlying low level stream. Stream object passed as parameter is automatically closed anf is managed.
 */


