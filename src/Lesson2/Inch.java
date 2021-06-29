package Lesson2;

public class Inch {
    public static void main(String args[]) {
        double cof = 2.54;
        double sm = 0;
        System.out.println("Таблица перевода расстояний из дюймов (дм) в сантиметры (см):");
        for (int i=1; i<=20; i++) {
            sm = i*cof;
            System.out.println(i + " дм" + " = " +  + sm + " см");
        }
    }
}
