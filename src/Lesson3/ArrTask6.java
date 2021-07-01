package Lesson3;

import java.util.Random;

/*
Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.
 */
public class ArrTask6 {
    public static void main(String args[]) {
        Random rnd = new Random();
        int[] arrRandom = new int[4];
        for (int i = 0; i < 4; i++) {
            arrRandom[i] = rnd.nextInt(11);
            System.out.print(arrRandom[i] + " ");
        }
        System.out.println();
        boolean flag =true;
        for (int i = 1; i < arrRandom.length; i++) {
            if (arrRandom[i]<=arrRandom[i-1]) {
                flag = false;
                break;
            }
        } if (flag) { System.out.print("массив является строго возрастающей последовательностью");
        } else {
            System.out.print("массив НЕ является строго возрастающей последовательностью");
        }
    }
}

