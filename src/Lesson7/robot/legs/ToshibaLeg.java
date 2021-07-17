package Lesson7.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg (int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Робот стоит на ноге Samsung ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
