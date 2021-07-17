package Lesson7.space.spaceships;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean check() {
        Random rnd = new Random();
        int number = rnd.nextInt(10) + 1;
        if (number > 3) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме!");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла");

    }
}
