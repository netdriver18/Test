package module2.homeTask2.flower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input prise of rose :");
        double prise = scanner.nextDouble();

        Rose rose = new Rose(prise);
        rose.setPrice(prise);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Input prise of tulip :");
        double prise1 = scanner1.nextDouble();
        Tulip tulip = new Tulip (prise1);
        tulip.setPrice(prise1);

        double sumPrise = rose.getPrice() + tulip.getPrice();
        System.out.println("Bouquet price: "+sumPrise);
    }
}
