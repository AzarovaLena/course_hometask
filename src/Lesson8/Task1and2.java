package Lesson8;

import java.util.Arrays;

public class Task1and2 {
    public static void main(String[] args) {
        Task1and2 test = new Task1and2();
        test.sub("Привет", "Катя", "Привет Катя, как дела, Катя?");
        test.sub2("Мирра");

    }

    /*
    1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
    последнего вхождения сивола(B).
     */
    public static void sub(String a, String b, String str1) {
        int firstIndex = str1.indexOf(a);
        int lastIndex = str1.lastIndexOf(b);
        str1.substring(firstIndex, lastIndex);
        System.out.println(str1.substring(firstIndex, lastIndex));

    }

    /*
    2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
позиции 0
     */
    public static void sub2(String str) {
        char oldChar = str.charAt(3);
        char newChar = str.charAt(0);
        str.replace(oldChar, newChar);
        System.out.println(str.replace(oldChar, newChar));
    }

    }



