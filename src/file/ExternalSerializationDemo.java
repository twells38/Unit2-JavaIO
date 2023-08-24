package file;
import java.io.*;

class CarExternal implements Externalizable{
    String name;
    String color;

    public CarExternal() {
    }

    public CarExternal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override //serialize, writeExternal used to save the external object
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(color);
    }

    @Override //deserialize, readExternal used for read and retrieve the object from the external source.
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        color = (String) in.readObject();
    }
}

public class ExternalSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CarExternal car = new CarExternal("Ferrari", "Red");

        //Serialization
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

        //Deserialization
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("abc.txt"));
        CarExternal car1 = (CarExternal) objectInputStream.readObject();

        System.out.println(car1.name);
        System.out.println(car1.color);
    }
}



/*Externalization
        * We have serialization in java where a java object is written to stream and saves in a file. In Serialization, everything is taken care of by JVM.
        * THere might be scenario where you might want to define your own logic for Serialization. This process is know as Externalization.
        * Externalization is an interface in java.io package and has two methods writeExternal() and readExternal() which are used to define custom implementations.
        */

/*writeExternal()
 * To save primary values to the file, we can call methods like writeInt(), writeBoolean(), writeByte()
 * to save object values like Strings, Arrays, custom classes method like writeObject() is used.
 */
/*readExternal()
 * This method is used to read data from the stream to that of object
 * To read primitive values from the file, we can call methods like readInt(), readBoolean(), readByte()
 * To read object values like Strings, Arrays, custom classes method like readObject() is used.*/

/*Serialization
* Serialization is a process where the entire process is taken care by JVM
* Entire object is safe always since that is the default implementation
* Programmer does not have any control
* Serialization is implemented using Serializable interface in java.io package
* Serialization interface does not have any methods since its a marker interface
* It is ok if the class defined as Serializable does not have public no arg constructor. */

/*Externalization is a process which is defined by programmer
* Programmers can choose to save partial object as per their requirements
* Programmers has completed control
* Externalization is implemented using Externalization interface in java.io package.
* Externalizable interface has 2 methods, Since it is not a marker interface.-> writeExternal() -> readExternal()
* Externalizable class should have a no argument constructor, else you get"invalidClassException.
*
* */