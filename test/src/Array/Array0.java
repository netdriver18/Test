package Array;

public class Array0 {
    public static void main(String[] args) {
        String[] str = {"Java", "Хороший", "Язык"};
        Boolean[] bln = {true,true};
        int[] num = new int[3];
        num[0] = 100;
        num[1] = 200;
        str[2] = "Лучший";
        System.out.println("rozmer strokovogo vfssiva :" + num.length);
        System.out.println("rozmer strokovogo vfssiva :" + str.length);
        System.out.println(num[0] + "," + num[1] + "," + num[2]);
        System.out.println(bln[0] + "," + bln[1]);
    }
}
