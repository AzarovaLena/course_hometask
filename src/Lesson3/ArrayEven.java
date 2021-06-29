package Lesson3;
/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементымассива на
экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.
 */
public class ArrayEven {
    public static void main(String args[]) {
        int evens [] = new int[10];
        int j = 0;
        for (int i = 2; i <=20; i++) {
            if (i % 2 == 0) {
                evens[j]=i;
                System.out.print(evens [j] + " ");
                j++;
            }
           } System.out.println();
        for (int even:evens) {
            System.out.println(even);
        }

            }
        }


