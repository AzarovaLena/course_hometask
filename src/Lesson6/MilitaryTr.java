package Lesson6;

public class MilitaryTr extends AirTr {
    boolean catapult;
    int rockets;
    public MilitaryTr (int power, int maxSpeed, int weight, String brand, double wings, int minLine,  boolean catapult, int rockets) {
        this.power = power;
        this.maxSpeed =maxSpeed;
        this.weight=weight;
        this.brand=brand;
        this.wings=wings;
        this.minLine=minLine;
        this.catapult=catapult;
        this.rockets=rockets;
    }

    @Override
    public void display() {
        System.out.println("Военный транспорт:");
        super.display();
        System.out.print("Наличие системы катапультирования "+ this.catapult + ", ");
        System.out.println("Кличество ракет на борту "+ this.rockets + "шт., ");
    }
}
