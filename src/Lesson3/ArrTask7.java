package Lesson3;

import java.util.Random;

/*
Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив
 */
public class ArrTask7 {
    public static void main(String args[]) {
        Random rnd = new Random();
        int[] arrRandom = new int[12];
        for (int i = 0; i < 12; i++) {
            arrRandom[i] = rnd.nextInt(16);
            System.out.print(arrRandom[i] + " ");
        }
        System.out.println();
        int max = arrRandom[0];
        int index = 0;
        for (int i = 0; i < arrRandom.length; i++) {
            if (arrRandom[i] > max) {
                max = arrRandom[i];
                index = i;
            }
        }System.out.println(max);
        System.out.println(index);
    }
}
