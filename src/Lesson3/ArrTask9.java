package Lesson3;

import java.util.Random;
import java.util.Scanner;

/*
 Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение
 */
public class ArrTask9 {
    public static void main(String args[]) {
        System.out.println("Введите положительное чётное целое число:");
        Scanner scan = new Scanner(System.in);
        double number =0;
        do {
            number = scan.nextDouble();
            if (number % 2 != 0 || number < 1 || number % 1 != 0)
                System.out.println("некорректный ввод, введите чётное целое число!");
        }
        while (number % 2 != 0 || number < 1 || number % 1 != 0);

        Random rnd = new Random();
        int[] arrRandom = new int[ (int) number];
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = rnd.nextInt(15) + 1;
            System.out.print(arrRandom[i] + " ");
        }
        int sumLeft = 0;
        int sumRight = 0;
        for (int l = 0; l < arrRandom.length / 2; l++) {
            sumLeft += arrRandom[l];
        }
        for (int r = arrRandom.length / 2; r < arrRandom.length; r++) {
            sumRight += arrRandom[r];
        }
        System.out.println();
        if (sumLeft > sumRight) {
            System.out.println("Сумма левой половины массыва: " + sumLeft + " больше суммы правой половины массива: " + sumRight);
        } else if (sumLeft < sumRight) {
            System.out.println("Сумма левой половины массыва: " + sumLeft + " меньше суммы правой половины массива: " + sumRight);
        } else {
            System.out.println("Сумма левой половины массыва: " + sumLeft + " ровна сумме правой половины массива: " + sumRight);
        }
    }
}


