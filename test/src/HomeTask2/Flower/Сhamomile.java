package HomeTask2.Flower;

import java.util.Scanner;

public class Сhamomile extends Flower{
    public String setColor(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть колір ромашки: ");
        color = scanner.nextLine();
        return  color;
    }

    public Double setPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціну ромашки: ");
        price = scanner.nextDouble();
        return  price;
    }

    public String getColor(){

        return  color;
    }

    public Double getPrice(){

        return  price;
    }
}
