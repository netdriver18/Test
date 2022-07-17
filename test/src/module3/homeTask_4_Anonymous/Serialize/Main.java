package module3.homeTask_4_Anonymous.Serialize;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Nasty", 0102, 2500);
        Methods methods = new Methods();
        methods.serializeObject(employee);
        methods.deserializeObject("D:/backup/Idea/outputObject.txt");
    }


}
