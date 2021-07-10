package Lesson6;

public class TruckTr extends LandTr {
    double loadLifting;

    public TruckTr (int power, int maxSpeed, int weight, String brand, int wheels,int oilRate, double loadLifting){
        this.power = power;
        this.maxSpeed =maxSpeed;
        this.weight=weight;
        this.brand=brand;
        this.wheels=wheels;
        this.oilRate=oilRate;
        this.loadLifting=loadLifting;

    }
    @Override
    public void display() {
        System.out.println("Грузовой транспорт:");
        super.display();
        System.out.println("Грузоподъёмность " + this.loadLifting + " т");
    }
}
