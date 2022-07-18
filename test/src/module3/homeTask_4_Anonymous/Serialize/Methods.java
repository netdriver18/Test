package module3.homeTask_4_Anonymous.Serialize;

import java.io.*;
import java.util.function.Consumer;

public class Methods {
    public static void  serializeObject(Employee employee, String pathToFile) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(pathToFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        fileOutputStream.flush();
        fileOutputStream.close();
        objectOutputStream.close();
        System.out.println("Object was serialized.....");
    }

    public static Employee deserializeObject(String pathToFile)  {
        Object object = null;
        try (FileInputStream fileInputStream = new FileInputStream(pathToFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            object = (Employee) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Object was deserialized....");
        return (Employee) object;
    }
}
