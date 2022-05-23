package Module1.book;
/* комментарий множественный*/
//еденичная строка комментарий

public class Constants {
    public static void main(String[] args){
        final int TOUCHDOWN = 6;
        final int CONVERSION = 7;
        final int FIELDGOAL = 3;

        int td = 4*TOUCHDOWN;
        int pat = 5 * CONVERSION;
        int fg = 6 * FIELDGOAL;
        int total = td+pat+fg;
        System.out.println(total);
    }
}
