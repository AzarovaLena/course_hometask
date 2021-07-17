package Lesson7.space.spaceships;

import java.util.Random;

public class SpaceShip2 implements IStart{
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
        System.out.println("Двигатели SpaceShip2 запущены. Все системы в норме!");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceShip2");

    }
}
