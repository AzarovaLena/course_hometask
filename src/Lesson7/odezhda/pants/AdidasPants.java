package Lesson7.odezhda.pants;

public class AdidasPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("надел штаны adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("снял штаны adidas");
    }
}
