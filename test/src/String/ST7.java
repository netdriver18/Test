package String;

import java.util.Scanner;

/*
String7. Дана непустая строка. Вывести коды ее первого и последнего символа.
 */
public class ST7 {
    public static void main(String[] args){
        System.out.println("Vvedite stroky.....");
        Scanner input  = new Scanner(System.in);
        String k = input.next();
        if (k.isEmpty() != true) {
            char p = k.charAt(0);
            char l = k.charAt(k.length()-1);
            System.out.println(p);
            System.out.println(l);
        }

    }

}
