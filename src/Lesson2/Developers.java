package Lesson2;

import java.util.Scanner;

public class Developers {
    public static void main(String args[]) {
        while (true) {
            System.out.println("Введите количество программистов:");
            Scanner scan = new Scanner(System.in);
            int devs = scan.nextInt();
            int end1 = devs % 10;
            int end2 = devs % 100;
            if ((end1 < 10 && end1 > 4) || end1 == 0 || (end2 > 10 && end2 < 15)) {
                System.out.println(devs + " Программистов");
            } else if (end1 == 1) {
                System.out.println(devs + " Программист");
            } else if (end1 > 1 && end1 < 5) {
                System.out.println(devs + " Программиста");
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


