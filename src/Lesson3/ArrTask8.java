package Lesson3;

import java.util.Arrays;
import java.util.Random;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.
 */
public class ArrTask8 {
    public static void main(String args[]) {
        Random rnd = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = rnd.nextInt(9) + 1;
            arr2[i] = rnd.nextInt(9) + 1;
            arr3[i] = (double) arr1[i] / arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (arr3[i]%1==0) {
                counter++;
            }
        } System.out.println (counter);
    }

}
