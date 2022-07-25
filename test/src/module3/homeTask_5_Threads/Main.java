package module3.homeTask_5_Threads;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers: ");
        int size = sc.nextInt();

        MyThread myThread = new MyThread(size, new int[size]);
        myThread.start();
        myThread.join();

        RunnableThread runnableThread = new RunnableThread(size, new int[size]);
        new Thread(runnableThread).start();
    }


}
