package Lesson3;

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




