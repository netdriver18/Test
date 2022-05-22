package HomeTask2.Flower;

import java.util.Scanner;

public class Tulip extends Flower{
    public String setColor(){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Введіть колір тюльпану: ");
        color = scanner.nextLine();
        return  color;
    }

    public double setPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціну тюльпану: ");
        price = scanner.nextDouble();
        return  price;
    }

    public String getColor(){

        return  color;
    }

    public double getPrice(){

        return  price;
    }
}
