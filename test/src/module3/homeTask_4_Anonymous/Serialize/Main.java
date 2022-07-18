package module3.homeTask_4_Anonymous.Serialize;

import module1.lists.List;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static final String PATH_TO_FILE = "D:/backup/Idea/outputObject.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee employee = new Employee("Nasty", 102, 2500);

        Methods.serializeObject(employee, PATH_TO_FILE);
        Employee deserializeObject = Methods.deserializeObject(PATH_TO_FILE);

        System.out.println(deserializeObject);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Nasty", 102, 2500));
        employeeList.add(new Employee("Koly", 103, 5500));
        employeeList.add(new Employee("Koly", 103, 5500));

        employeeList.forEach(e -> {
            try {
                Methods.serializeObject(e, PATH_TO_FILE);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Employee deserializeEmployee1 = Methods.deserializeObject(PATH_TO_FILE);

        System.out.println(deserializeEmployee1);

    }
}
