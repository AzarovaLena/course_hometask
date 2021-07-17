package Lesson7.space;

import Lesson7.space.spaceships.IStart;
import Lesson7.space.spaceships.Shuttle;
import Lesson7.space.spaceships.SpaceShip1;
import Lesson7.space.spaceships.SpaceShip2;

public class Сosmodrome {
    public static void main(String[] args) {
        Сosmodrome cos = new Сosmodrome();
        IStart shuttle = new Shuttle();
        IStart ship1 = new SpaceShip1();
        IStart ship2 = new SpaceShip2();
        cos.launch(shuttle);
        System.out.println();
        cos.launch(ship1);
        System.out.println();
        cos.launch(ship2);

    }

    public static void launch(IStart ship) {
        boolean result = ship.check();
        if (result == false) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            ship.engineStart();
            System.out.println("Обратный отсчёт запущен:");
            for (int i = 10; i > 0; i--) {
                System.out.print(i + ", ");
            }
            ship.start();
        }
    }

}
