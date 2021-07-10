package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Сomputer {
    double processor;
    int ram;
    int hdd;
    int fullCycleLife;

    public void description() {
        System.out.println("Характеристики компьютера:");
        System.out.println("Процессор " + this.processor + " ГГц");
        System.out.println("Оперативка " + this.ram + " ГБ");
        System.out.println("Жёсткий диск " + this.hdd + " ГБ");
        System.out.println("Ресурс полных циклов работы " + this.fullCycleLife);
    }


    public void turnON() {
        Random rnd1 = new Random();
        int nr = rnd1.nextInt(1) + 1;
        int attempt = 0;

        System.out.println("При включении может произойти сбой! Введите число 0 или 1");
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();
        if (nr == number1) {
            System.out.println("Всё отлично, компьютер включается. Привет!");
        } else {

            System.out.printf("Вы ошиблись, компьютер сгорел");
            System.out.println();
        }
        this.fullCycleLife--;
        if (this.fullCycleLife == 0) {
            System.out.println("Компьютеру конец, его не вернуть!");

        }
    }

    public void turnOFF() {

        Random rnd1 = new Random();
        int nr = rnd1.nextInt(1) + 1;
        int attempt = 0;

        System.out.println("При вылючении может произойти сбой! Введите число 0 или 1");
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();
        if (nr == number1) {
            System.out.println("Всё отлично, компьютер включается. Привет!");
        } else {

            System.out.printf("Вы ошиблись, компьютер сгорел");
            System.out.println();
        }
        this.fullCycleLife--;
        if (this.fullCycleLife == 0) {
            System.out.println("Компьютеру конец, его не вернуть!");
        }
    }
}



