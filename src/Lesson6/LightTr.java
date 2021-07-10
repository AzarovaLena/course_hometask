package Lesson6;

public class LightTr extends LandTr {
    String carBody;
    int passengersL;

    public LightTr(int power, int maxSpeed, int weight, String brand, int wheels, int oilRate, String carBody, int passengersL) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.wheels = wheels;
        this.oilRate = oilRate;
        this.carBody = carBody;
        this.passengersL = passengersL;
    }

    @Override
    public void display() {
        System.out.println("Легковой транспорт:");
        super.display();
        System.out.print("Тип кузова " + this.carBody + ", ");
        System.out.println("Количество пассажиров " + this.passengersL + " шт.");
    }
    double hour;
    public double kilometer (double hour) {
        double km = hour*maxSpeed;
        return km;
    }
    private double rate ( double hour) {
        double km2=kilometer(hour);
        double litr =oilRate*km2/100;
        return litr;
    }
    public double getRate(){
        return rate(hour);
    }
}
