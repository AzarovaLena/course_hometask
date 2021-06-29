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
            arrRandom [i]=rnd.nextInt(99);
            System.out.print(arrRandom [i] + " ");
        }
    }
}
