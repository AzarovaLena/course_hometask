package Lesson2;

public class Amoeba {
    public static void main(String args[]) {
        int amoeba1 = 1;
        for (int i=3; i<=24; i=i+3) {
            amoeba1 = amoeba1*2;
            System.out.println(i);
        }
        System.out.println("Итого амеб:" +amoeba1);

    }
}
