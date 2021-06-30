package Lesson3;

import java.util.Random;

/*
Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.
 */
public class ArrTask4 {
    public static void main(String args[]) {
        Random rnd = new Random();
        int[] arrRandom = new int[20];
        for (int i = 0; i < 20; i++) {
            arrRandom[i] = rnd.nextInt(21);
            System.out.print(arrRandom[i] + " ");
        }
        System.out.println( arrRandom.length);

        for (int i = 0; i <=arrRandom.length-1; i++) {
            if (i % 2 != 0) {
                arrRandom [i] = 0;
            } System.out.print(arrRandom[i] + " ");
        }
    }
}
