package module3.homeTask_4_Anonymous.Serialize;

import java.io.*;

public class Methods {
    public void serializeObject(Employee employee) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:/backup/Idea/outputObject.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        fileOutputStream.flush();
        fileOutputStream.close();
        objectOutputStream.close();
        System.out.println("Object was serialized.....");
    }

    public Employee deserializeObject(String PathToFile) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(PathToFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = (Employee) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        System.out.println("Object was deserialized....");
        return (Employee) object;

    }
}
