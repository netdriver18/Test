package Module1.book;

public class Logic {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;
        System.out.println("Результат выражения: "+ (yes && yes));
        System.out.println("Результат выражения: "+ (yes && no));
        System.out.println("Результат выражения: "+ (yes || no));
        System.out.println("Результат выражения: "+ (yes || yes));
        System.out.println("Результат выражения: "+ (no || no));
        System.out.println(!no);
        System.out.println(!yes
        );
    }
}
