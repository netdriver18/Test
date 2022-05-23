package Module2.HomeTask2.InterfaceSecond;

import Module2.HomeTask2.InterfacesFirst.Numerable;

import java.util.Scanner;

public class MyCalculator implements Numerable {
    public Integer a,b = 0;


@Override
    public void Devide(int a, int b) {
        System.out.println(a%b);
    }

    @Override
    public void Minus(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void Multiply(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public  void Plus(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть a :");
        int a = sc.nextInt();
        System.out.println("Введіть b :");
        int b = sc.nextInt();
        MyCalculator mccalc = new MyCalculator();
        {
            mccalc.Plus(a,b);
            mccalc.Multiply(a,b);
            mccalc.Devide(a,b);
            mccalc.Minus(a,b);
        }

    }

}
