package Matrix;

import java.util.Arrays;
import java.util.Scanner;

//Matrix49. Дана матрица размера M × N. Преобразовать матрицу, поменяв
//местами минимальный и максимальный элемент в каждой строке.
public class MX49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite dlinnu massiva/dlinnu nabora");
        int n = input.nextInt();
        int m = input.nextInt();
        int min,max = 0;
        int imax,jmax,imin,jmin;
        System.out.println("Vvedite  massiv");
        int[][] array = new int[n][m];
        for (int i = 0; i<array.length; i++ ) {
            for (int j = 0; j < m; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i<array.length; i++ ){
            min = array[i][0];
            imin = 0;
            jmin = 0;
            imax = 0;
            jmax = 0;
            for (int j = 0; j<array[0].length; j++){
                if (min > array[i][j]){
                    min = array[i][j];
                    imin = i;
                    jmin = j;
                }
                if(max < array[i][j]){
                    max = array[i][j];
                    imax = i;
                    jmax = j;
                }

            }
            array[imin][jmin] = max;
            array[imax][jmax] = min;
            System.out.println("min: "+min);
            System.out.println("max: "+max);
        }
        System.out.println(Arrays.deepToString(array));
    }
    }
