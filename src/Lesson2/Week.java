package Lesson2;

import java.util.Scanner;

public class Week {
    public static void main(String args[]) {
        System.out.println("Введите число от 1 до 7");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int days = number;
        switch (days) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Выходной");
                break;
            case 7:
                System.out.println("Выходной ");
                break;
            default:
                System.out.println("Неверная цифра");
        }
    }
}
