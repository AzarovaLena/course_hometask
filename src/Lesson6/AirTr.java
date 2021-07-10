package Lesson6;

public class AirTr extends Transport{
    double wings;
    int minLine;

    @Override
    public void display() {
        super.display();
        System.out.print("Размах крыльев " + this.wings + "м., ");
        System.out.print("Минимальная длина взлётно-посадочной полосы " + this.minLine + "м., ");
    }
}
