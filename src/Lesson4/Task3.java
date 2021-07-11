package Lesson4;

import java.util.Random;
import java.util.Scanner;

/*
3)Проверить произведение элементов какой диагонали больше.
 */
public class Task3 {
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
        int mult = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) { }
            mult *= matrix[i][i];
        }
        System.out.println("Произведение элементов главной диагонали: " + mult);

        int mult2 = 1;
        for(int i=0; i<matrix.length; i++){
            int j=matrix.length-1-i;
            mult2 *= matrix[i][j];
        }
        System.out.println("Произведение элементов побочной диагонали: " + mult2);
        if (mult>mult2){
            System.out.println("Произведение элементов главной диагонали: " + mult + ", больше произведения элементов побочной диагонали: "+ mult2);
        } else {
            System.out.println("Произведение элементов главной диагонали: " + mult + ", меньше произведения элементов побочной диагонали: "+ mult2);
        }

    }
}
