package Lesson8;

import java.util.Arrays;
/*
      3)В исходном строке находятся слова. После
  запуска программы должен создать новая строка, который будет содержать в себе
  только полиндромы
       */

public class Palindrom {
    public static void main(String[] args) {

        Palindrom p = new Palindrom();
        p.sub3("топот\n дуд \n лена \n довод \n саша");
    }



    public static void sub3(String str1) {
        String[] words = str1.split("\n");

        System.out.println("Палиндромы в строке:");
        for (int i = 0; i < words.length; i++) {
            StringBuilder s = new StringBuilder(words[i]);
            String str2 = s.reverse().toString();
            if (words[i].equalsIgnoreCase(str2)) {
                System.out.println(words[i]);
            } else {
                continue;
            }
        }
    }
}
