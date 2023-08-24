package file;

import java.io.*;

class CarInheritance {
    String name;
    String color;

    public CarInheritance() {
    }

    public CarInheritance(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
//create child class object
class Ferrari extends CarInheritance implements Serializable {
    int wheels;

    public Ferrari(String name, String color, int wheels) {
        super(name, color);
        this.wheels = wheels;
    }
}

public class InheritanceSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Ferrari ferrari = new Ferrari("Ferrari", "Red", 4);

        //Serialization
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(ferrari);

        //Deserialization
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("abc.txt"));
        Ferrari ferrari1 = (Ferrari) objectInputStream.readObject();

        System.out.println(ferrari1.color);
        System.out.println(ferrari1.name);
        System.out.println(ferrari1.wheels);
    }
}


