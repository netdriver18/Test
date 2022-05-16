package String;

import java.util.Scanner;

/*
String10◦
. Дана строка. Вывести строку, содержащую те же символы, но расположенные в обратном порядке.
 */
public class ST10 {
    public static void main(String[] args){
    System.out.println("Vvedite stroky.....");
    Scanner input = new Scanner(System.in);
    String k = input.next();
    if(k.isEmpty()!=true){
       String s = "";
       for (int i = k.length()-1; i >= 0; i--){
          s = s+ k.charAt(i);
       }
        System.out.println(s);
    }

    {
    }
}
}