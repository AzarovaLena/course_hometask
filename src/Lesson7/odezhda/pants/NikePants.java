package Lesson7.odezhda.pants;

public class NikePants implements IPants{
    @Override
    public void putOn() {
        System.out.println("надел штаны nike");
    }

    @Override
    public void takeOff() {
        System.out.println("снял штаны nike");
    }
}
