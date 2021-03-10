package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author luliangliang9534@100.me
 */
public class SerializableTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(16);
        person.setName("jack");

        Person.setHeight(15);

        InnerPerson innerPerson = new InnerPerson();
        innerPerson.setHobby("badminton");
        person.setInnerPerson(innerPerson);

        try {
            FileOutputStream fs = new FileOutputStream("D:\\person.text");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(person);
            os.close();
            FileInputStream fi = new FileInputStream("D:\\person.text");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Person result = (Person) oi.readObject();
            oi.close();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
