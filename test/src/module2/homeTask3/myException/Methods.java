package module2.homeTask3.myException;

public class Methods {
    public static double add(double a, double b) throws MyException, IllegalAccessException {
        check(a, b);
        return a + b;
    }

    public static void check(double a, double b) throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if ((a == 0 && b == 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        } else if (a > 0 && b > 0) {
            throw new MyException();
        }

    }
}
