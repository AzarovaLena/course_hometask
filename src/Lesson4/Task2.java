package Lesson4;

import java.util.Random;
import java.util.Scanner;

/*
2)Вывести нечетные элементы находящиеся под главной
диагональю(включительно).
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        int matrixSize = size.nextInt();

        Random rnd = new Random();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rnd.nextInt(50) + 1;
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(i>=j && (matrix[i][j])%2 !=0){
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
    }
}
