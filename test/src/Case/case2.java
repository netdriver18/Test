package Case;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        switch (k){
            case 1: System.out.println("ploho");
            break;
            case 2: System.out.println("Neudavletvoritelno");
            break;
            case 3: System.out.println("udovletvoritelno");
            break;
            case 4: System.out.println("horosho");
            break;
            case 5: System.out.println("otlichno");
            break;

            default:
                if (k>5){
                    System.out.println("osibka");
                }
                else if (k<1){
                    System.out.println("osibka");

                }
        }
    }
}
