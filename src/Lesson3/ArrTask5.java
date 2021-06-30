package Lesson3;

import java.util.Random;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
 */
public class ArrTask5 {
    public static void main(String args[]) {
        Random rnd = new Random();
        int[] arrRandom1 = new int[5];
        int[] arrRandom2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arrRandom1[i] = rnd.nextInt(16);
            System.out.print(arrRandom1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            arrRandom2[i] = rnd.nextInt(16);
            System.out.print(arrRandom2[i] + " ");
        }
        System.out.println();
        double sumArrRandom1 = 0;
        double sumArrRandom2 = 0;
        for (int i = 0; i < arrRandom1.length; i++) {
            sumArrRandom1 = (sumArrRandom1+arrRandom1[i]);
    } System.out.println("Среднее арифметическое элементов первого массива: " + sumArrRandom1/5);

        for (int i = 0; i < arrRandom2.length; i++) {
            sumArrRandom2 = (sumArrRandom2+arrRandom2[i]);
        } System.out.println("Среднее арифметическое элементов второго массива: " + sumArrRandom2/5);

        if (sumArrRandom1/5 < sumArrRandom2/5 ) {
            System.out.println("Среднее арифметическое элементов второго массива больше");
        } else if (sumArrRandom1/5 > sumArrRandom2/5) {
            System.out.println("Среднее арифметическое элементов первого массива больше");
        } else {
            System.out.println("Средние арифметические элементов массивов равны");
        }

    }
}
