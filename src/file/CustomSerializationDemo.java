package file;
import java.io.*;


class CarCustom implements Serializable{
    String name;
    transient String color;

    public CarCustom(String name, String color) {
        this.name = name;
        this.color = color;
    }
    //custom serialize method to encrypt the variable
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        String colorTemp = "aa"+color;
        objectOutputStream.writeObject(colorTemp);
    }
    //override
    //deserialization method to decrypt the variable to get the value.
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String colorTemp = (String) objectInputStream.readObject();
        color = colorTemp.substring(2); //skip firs 2 strings
    }

}

public class CustomSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarCustom car = new CarCustom("Ferrari", "Red");

        //Serialization
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

        //Deserialization
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("abc.txt"));
        CarCustom car1 = (CarCustom) objectInputStream.readObject();

        System.out.println(car1.name);
        System.out.println(car1.color);
    }
}

/*
* if the parent class implements te Serializable interface, child classes will be by default Serializable.
*
* */
