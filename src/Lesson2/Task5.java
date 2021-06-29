package Lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main (String args[]) {
        System.out.println("Введите три целых числа:");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int plus =0;
        int minus =0;
        if (number1>0) {
            ++plus;
        } else {
            ++minus;
        }if (number2>0){
            ++plus;
        } else {
            ++minus;
        } if (number3>0) {
            ++plus;
        } else {
            ++minus;
        }
        System.out.println("Количество положительных чисел в наборе:" + plus);
        System.out.println("Количество отрицательных чисел в наборе:" + minus);

    }
}
