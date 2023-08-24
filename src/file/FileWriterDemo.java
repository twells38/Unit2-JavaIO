package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileWriter fileWriter = new FileWriter("abc.txt");
        fileWriter.write("ABC");

        fileWriter.write(("\n"));
        char[] ch = new char[]{'x','y','z'};
        fileWriter.write(ch);
        fileWriter.flush();
        fileWriter.close();
    }
}

/*
 * Using FileWriter Class
 * Constructors in FileWriter class
 * FileWriter fileWriter = new FileWriter(String Filename)
 * FileWriter fileWriter = new FileWriter(File filename)
 * FileWriter fileWriter = new FileWriter(String filename, boolean append)
 * FileWriter fileWriter = new FileWriter(File filename, boolean boolean append)
 * FileWrite fileWriter = new FileWriter(String file, Charset cs
 * */


