package module1.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MX2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i<array.length; i++ ){
            for (int j = 0; j<m; j++){
               array[i][j] = input.nextInt();
            }
        }
        for (int i = 1; i< array[0].length; i++){
            for(int j = 0; j<array.length; j++){
               array[i][j]= array[i][j]*5;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
