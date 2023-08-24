package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("abc.text");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //writing a string
        bufferedWriter.write("ABCD");

        //adding new line
        bufferedWriter.newLine();
        char[] ch = new char[]{'a','b','c'};
        bufferedWriter.write(ch);
        bufferedWriter.close();
    }
}

/*
 * Important methods in BufferedWriter class
 * write() -> writes a single character to the internal buffer of writer
 * write(char[]array) - writes a array of characters to the internal buffer of writer
 * write(String s)- writes specified String to writer
 * */
