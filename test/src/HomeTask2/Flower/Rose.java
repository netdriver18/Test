package HomeTask2.Flower;

import HomeTask2.Flower.Flower;

import java.util.Scanner;

public class Rose extends Flower {

    public String setColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть колір рози: ");
        color = scanner.nextLine();
        return  color;
    }

    public Double setPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціну рози: ");
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
