package Lesson2;

public class Сalculation {
    public static void main(String args[]) {
        int sum =0;
        for (int i=1; i<=256; i=i*2) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Сумма итого:" +sum);

    }
}
