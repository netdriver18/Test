package book;

public class Comparison {
    public static void main(String[] args){
        String txt = "Java";
        String lang ="Fantastic";
        Boolean state = (txt==lang);
        System.out.println(state);

        state = (txt!=lang);
        System.out.println(state);
    }
}
