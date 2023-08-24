package file;
import java.io.*;
class Car1 implements Serializable{
    String name;
    transient String color;

    public Car1(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
public class TransientDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car1 car = new Car1("Ferrari", "Red");

        //Serialization
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

        //Deserialization
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("abc.txt"));
        Car1 car1 = (Car1) objectInputStream.readObject();

        System.out.println(car1.name);
        System.out.println(car1.color);
    }
}

/*
* Transient means "do not serialize"
* You can only use the transient keyword with in variables'
* While deserialization, transient variable is initialized with default value based on the data type.
*  */

