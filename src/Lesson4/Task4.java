package Lesson4;

import java.util.Random;
import java.util.Scanner;

/*
4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)
 */
public class Task4 {
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
        int summ=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=matrix.length-2-i; j>=0; j--){
                if (matrix[i][j]%2==0)
                summ+=matrix[i][j];
            }
        } System.out.println(summ);
    }
}
