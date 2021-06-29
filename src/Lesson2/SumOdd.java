package Lesson2;

public class SumOdd {
    public static void main(String args[]){
        ;
        int sum =0;
        for (int i=1; i<=99; i++) {
            if (i%2 !=0) {
                sum = sum +i;
                System.out.println(i);
                continue;
            } else {
            }
        }
        System.out.println("Сумма нечётных чисел: " +sum);
    }
}
