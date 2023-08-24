package file;

import java.io.*;

class Car implements Serializable {
    String name;
    String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

public class SerializationDeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car("Ferrari", "Red");

        //Serialization
        //FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

        //Deserialization
        //FileInputStream fileInputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
        Car car1 = (Car) objectInputStream.readObject();

        System.out.println(car1.color);
        System.out.println(car1.name);
    }
}


/*Serialization and deserialization in ja
 * important classes/ interfaces for serialization and deserialization
 * serializable interface, you don't have to implement methods.
 * ObjectInputStream and FileInputStream
 * FileOutputStream and ObjectOutputStream
 */

