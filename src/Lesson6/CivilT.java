package Lesson6;

public class CivilT extends AirTr{
    int passengersC;
    boolean BClass;
    public CivilT (int power, int maxSpeed, int weight, String brand, double wings, int minLine, int passengersC, boolean BClass) {
        this.power = power;
        this.maxSpeed =maxSpeed;
        this.weight=weight;
        this.brand=brand;
        this.wings=wings;
        this.minLine=minLine;
        this.passengersC=passengersC;
        this.BClass=BClass;
    }

    @Override
    public void display() {
        System.out.println("Гражданский транспорт:");
        super.display();
        System.out.print("Количество пассажиров " + this.passengersC + "шт., ");
        System.out.println("Наличие бизнес класса " + this.BClass);
    }
}
