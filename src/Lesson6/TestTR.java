package Lesson6;

public class TestTR {

    public static void main(String[] args) {


        LightTr car = new LightTr(150, 180, 1800, "KIA", 4, 8, "седан", 5);
        car.display();
        car.hour = 4;
        System.out.println("За время " + car.hour + " ч, автомобиль " + car.brand + " двигаясь с максимальной скоростью " +car.maxSpeed + " км/ч " +
                "проедет " + car.kilometer(car.hour) + "км.,и израсходует " +car.getRate() + " л. топлива.");
        System.out.println();

        TruckTr truck = new TruckTr(400, 150, 2000, "МАЗ", 8, 10, 5);
        truck.display();
        truck.load=6;
        truck.realLoad(truck.load);
        System.out.println();

        CivilT civil = new CivilT(110000, 1050, 280000, "Airbus A380", 80, 3300, 525, true);
        civil.display();
        civil.quantityPas=125;
        civil.realPassengers(civil.quantityPas);
        System.out.println();

        MilitaryTr military = new MilitaryTr(50000, 2500, 16380, "СУ-27", 15, 2500, true, 6);
        military.display();
        military.shot();
        military.systemСatapult();

    }

}




