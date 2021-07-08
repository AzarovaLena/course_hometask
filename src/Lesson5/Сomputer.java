package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Сomputer {
    public double processor=2.4;
    public int ram=8;
    public int hdd=1000;
    public int fullCycleLife=8;

    public void description() {
        System.out.println ("Характеристики компьютера:");
        System.out.println ( "Процессор " + processor);
        System.out.println ( "Оперативка " +ram);
        System.out.println ("Жёсткий диск " + hdd);
        System.out.println ("Ресурс полных циклов работы " + fullCycleLife);
    }

    public void turnON() {
        while (true) {
            Random rnd1 = new Random();
            int nr = rnd1.nextInt(1)+1;

            boolean flag = true;
            System.out.println("При включении может произойти сбой! Введите число 0 или 1");
            Scanner scan1 = new Scanner(System.in);
            int number1 = scan1.nextInt();

            if (nr == number1) {
                System.out.println("Всё отлично, компьютер включается. Привет!");
                break;
            } else {
                flag = false;
                System.out.println("Вы ошиблись, компьютер сгорел!");
            }
            if (flag == false) {
                System.out.println("При включении может произойти сбой! Введите число 0 или 1");
                Scanner scan2 = new Scanner(System.in);
                int number2 = scan2.nextInt();
                System.out.println("Компьютеру конец, его не вернуть!");
                break;
            }
        }
    }
    public void turnOFF () {
        while (true) {
            Random rnd2 = new Random();
            int nr2 = rnd2.nextInt(1)+1;

            boolean flag = true;
            System.out.println("При вылючении может произойти сбой! Введите число 0 или 1");
            Scanner scan3 = new Scanner(System.in);
            int number3 = scan3.nextInt();

            if (nr2 == number3) {
                System.out.println("Всё отлично, компьютер выключается! До свидания!");
                break;
            } else {
                flag = false;
                System.out.println("Вы ошиблись, компьютер сгорел!");
            }
            if (flag == false) {
                System.out.println("При выключении может произойти сбой! Введите число 0 или 1");
                Scanner scan4 = new Scanner(System.in);
                int number4 = scan4.nextInt();
                System.out.println("Компьютеру конец, его не вернуть!");
                break;
            }
        }
    }
    public void limit (int useResource) {
            if (useResource > fullCycleLife) {
                System.out.println("Лимит ресурса превышен, компьютер сгорел!");

            }

        }
    }


