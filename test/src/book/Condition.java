package book;

public class Condition {
    public static void main(String[] args){
        int num1 = 1234;
        int num2 = 4356;
        String result;

        result = (num1%2 != 0) ? "Нечетное": "Четное";
        System.out.println(result);

        result = (num2%2!=0) ? "Нечетное":"Четное";
        System.out.println(result);

    }

}
