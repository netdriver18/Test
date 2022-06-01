package module2.homeTask1.objectClasses;

import java.util.Scanner;

public class ObjectWorker {
    public static void main(String[] args) {
        Worker worker = new Worker("Bob");
        Scanner sc = new Scanner(System.in);
        System.out.println("Вести кількість років робітника: ");
        int k = sc.nextInt();
        worker.setAge(k);


        System.out.println("Установлен возраст :"+worker.getAge());

        System.out.println("Установлено имя: "+ worker.getName());


    }
}
