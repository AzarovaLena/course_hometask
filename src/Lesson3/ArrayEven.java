package Lesson3;

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


