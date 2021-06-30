package Lesson3;

import java.util.Random;

/*
    Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.
     */
public class ArrTask3 {
    public static void main(String args[]){
        Random rnd = new Random();
        int [] arrRandom = new int [15];
        for (int i=0; i<15;i++) {
            arrRandom [i]=rnd.nextInt(100);
            System.out.print(arrRandom [i] + " ");
        }
        int j = 0;
        for (int i =0; i <= arrRandom.length-1 ; i++) {
            if (arrRandom[i]% 2 == 0) {
                j++;
            }
            }
        System.out.println ();
        System.out.print(j + " ");
    }
}
