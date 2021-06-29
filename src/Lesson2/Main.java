package Lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите целое число:");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();

            if (number > 0) {
                System.out.println("Результат:" + (number + 1));
            } else if (number < 0) {
                System.out.println("Результат:" + (number - 2));
            } else if (number == 0) {
                System.out.println("Результат:" + ("1" + number));
            }
            System.out.println("Введите Stop, если хотите завершить или No");
            Scanner scan1 = new Scanner(System.in);
            String finish = scan1.nextLine();
            if (finish.equals("Stop")) {
                System.out.println("Спасибо, до свидания!");
                break;
            }
        }

    }


}










