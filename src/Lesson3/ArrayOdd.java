package Lesson3;
/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 … 7 5 3 1).
 */
public class ArrayOdd {
    public static void main(String args[]) {
        int odds[] = new int[50];
        int j = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                odds[j] = i;
                System.out.print(odds[j] + " ");
                j++;
            }
        } System.out.println ();
        for (int i =odds.length-1; i>=0; i--) {
                System.out.print(odds[i] + " ");

            }
        }


        }




