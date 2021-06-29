package Lesson2;

public class Runner {
    public static void main(String args[]) {
        double km =10;
        double sum =10;
        for (int i=1; i<7; i++) {
            km += km*0.10;
            sum +=km;
        }
        System.out.println(sum);
    }
}
