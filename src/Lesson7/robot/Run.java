package Lesson7.robot;

import Lesson7.robot.hands.IHand;
import Lesson7.robot.hands.SamsungHand;
import Lesson7.robot.hands.SonyHand;
import Lesson7.robot.hands.ToshibaHand;
import Lesson7.robot.heads.IHead;
import Lesson7.robot.heads.SamsungHead;
import Lesson7.robot.heads.SonyHead;
import Lesson7.robot.heads.ToshibaHead;
import Lesson7.robot.legs.ILeg;
import Lesson7.robot.legs.SamsungLeg;
import Lesson7.robot.legs.SonyLeg;
import Lesson7.robot.legs.ToshibaLeg;
 /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

public class Run {
    public static void main(String[] args) {

        IHead samsungHead = new SamsungHead(100);
        IHand sonyHand = new SonyHand(100);
        ILeg toshibaLeg = new ToshibaLeg(150);

        Robot robot1 = new Robot(samsungHead, sonyHand, toshibaLeg);

        robot1.action();
        System.out.println(robot1.getPrice());

        IHead sonyHead = new SonyHead(200);
        IHand toshibaHand = new ToshibaHand(300);
        ILeg samsungLeg = new SamsungLeg(150);

        Robot robot2 = new Robot(sonyHead, toshibaHand, samsungLeg);

        robot2.action();
        System.out.println(robot2.getPrice());

        IHead toshibaHead = new ToshibaHead(90);
        IHand samsungHand = new SamsungHand(250);
        ILeg sonyLeg = new SonyLeg(180);

        Robot robot3 = new Robot(toshibaHead, samsungHand, sonyLeg);

        robot3.action();
        System.out.println(robot3.getPrice());


        int[] arreyR = {robot1.getPrice(), robot2.getPrice(), robot3.getPrice()};
        int maxPrice = 0;
        for (int i = 0; i < arreyR.length; i++) {
            if (arreyR[1] > maxPrice) {
                maxPrice = arreyR[1];
            }
        } System.out.println("Цена самого дорого робота ровна: " + maxPrice);


    }
}
