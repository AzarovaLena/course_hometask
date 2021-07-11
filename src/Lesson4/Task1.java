package Lesson4;

import java.util.Random;
import java.util.Scanner;

/*
Начало всех задач:
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
1)Почитать сумму четных элементов стоящих на главной диагонали.
 */
public class Task1 {
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
        int summ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                if (matrix[i][i] % 2 == 0) {
                    summ += matrix[i][i];
                }
            }
        }
            System.out.println("Сумма: " + summ);
    }
}
