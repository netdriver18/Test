package module2.homeTask1.objectRectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       System.out.println("Введіть ширину прямокутника :");
       Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
       System.out.println("Введіть довжину прямокутника :");
       double b = sc.nextDouble();
       Rectangle rec = new Rectangle(a,b);
       rec.Plosha();
       rec.Perimetr();

    }
}