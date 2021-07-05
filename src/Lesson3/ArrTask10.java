package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
 */
public class ArrTask10 {
    public static void main(String args[]) {
        System.out.println("Введите целое число больше 3:");
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int even = 0;
        do {
            n = scan.nextInt();
            if (n <= 3)
                System.out.println("некорректный ввод, введите целое число больше 3!");
        }
        while (n <= 3);
        int[] arrRandom = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = rnd.nextInt(n) + 1;
            if (arrRandom[i] % 2 == 0) {
                even++;
            }
        } System.out.println(Arrays.toString(arrRandom));
        int [] arrRandom2 = new int [even];
        int j = 0;
        for (int i = 0; i < arrRandom.length; i++) {
            if (arrRandom[i] % 2 == 0) {
                arrRandom2 [j] = arrRandom[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrRandom2));
    }
}



