package Lesson6;

public class Transport {
    double power;
    int maxSpeed;
    int weight;
    String brand;


    public double calcPower(double power) {
        double kw = power * 0.74;
        return kw;
    }

    public void display() {
        double kv = calcPower(power);
        System.out.print("Мощность " + power + " л.с. , ");
        System.out.print("Мощность " + kv + " кВ , ");
        System.out.print("Максимальная скорость " + maxSpeed + " км/ч, ");
        System.out.print("Масса " + weight + " кг, ");
        System.out.print("Марка " + brand + ", ");
    }
}
