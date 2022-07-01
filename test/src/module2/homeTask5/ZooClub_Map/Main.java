package module2.homeTask5.ZooClub_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Person, List<Animal>> personListHashMap = new HashMap<>();
        ZooClub zooClub = new ZooClub(personListHashMap);
        Scanner scanner = new Scanner(System.in);
        boolean ExitFlag = false;
        while (!ExitFlag) {
            System.out.println("Add person-> press P");
            System.out.println("Add animal-> press A");
            System.out.println("Delete person-> press D");
            System.out.println("Delete animal-> press F");
            System.out.println("Print map of animals->K");
            System.out.println("Exit program-> press E");
            String flag = scanner.next();
            if (flag.equals("P")) {

                System.out.println("Input name of person:");
                String namePer = scanner.next();

                if (zooClub.existingPerson(personListHashMap, namePer)) {
                    System.out.println("The person already exists");
                } else
                    zooClub.addPerson(personListHashMap, namePer);

            } else if (flag.equals("A")) {

                System.out.println("Input name of person :");
                String namePerson = scanner.next();

                System.out.println("Input name of animal :");
                String nameAn = scanner.next();

                if (zooClub.existingPerson(personListHashMap, namePerson)) {

                    zooClub.addAnimal(personListHashMap, nameAn,
                            namePerson);
                } else {
                    System.out.println("Can't put animal because such person doesn't exists:");

                }

            } else if (flag.equals("D")) {

                System.out.println("Input name of person for deleting:");
                String namePerDel = scanner.next();

                if (zooClub.existingPerson(personListHashMap, namePerDel)) {
                    zooClub.delPerson(personListHashMap, namePerDel);
                } else
                    System.out.println("The person is not exists in base");
            } else if (flag.equals("F")) {

                System.out.println("Input name of animal for deleting:");
                String nameAnimalDel = scanner.next();
                System.out.println("Input name of person for deleting:");
                String namePerDelAn = scanner.next();

                if (zooClub.existingPerson(personListHashMap, namePerDelAn)) {
                    zooClub.delAnimal(personListHashMap, nameAnimalDel, namePerDelAn);
                } else
                    System.out.println("The person is not exists in base");
            } else if (flag.equals("E")) {
                System.out.println("Exit!");
            } else if (flag.equals("K")) {
                zooClub.printMap(personListHashMap);
            }
        }
    }
}
