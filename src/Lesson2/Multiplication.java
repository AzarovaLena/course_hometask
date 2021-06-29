package Lesson2;

import java.util.Scanner;

public class Multiplication {
    public static void main(String args[]) {
        System.out.println("Ведите множители А и В:");
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int sum = 0;
        for (int i = 0; i<B; i++) {
            sum = A + sum;
                    }
        System.out.println("Сумма:" + sum);
    }
}
