package Lesson5;

public class Main {

    public static void main(String[] args) {
        Сomputer lena = new Сomputer();
        lena.processor = 2.4;
        lena.ram = 8;
        lena.hdd = 100;
        lena.fullCycleLife = 5;

        lena.description();
        lena.turnON();
        lena.turnOFF();

        for (int i = lena.fullCycleLife; i >0; i--) {
            lena.turnON();
        }


    }
}

