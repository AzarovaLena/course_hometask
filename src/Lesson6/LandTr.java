package Lesson6;

public class LandTr extends Transport {
    int wheels;
    int oilRate;


    @Override
    public void display () {
        super.display();
        System.out.print("Колёса " + this.wheels + " шт., ");
        System.out.print("Расход топлива " + this.oilRate + " л/100км, ");
    }

}
