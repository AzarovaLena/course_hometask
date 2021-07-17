package Lesson7.odezhda.shoes;

public class NikeShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("надел обувь nike");
    }

    @Override
    public void takeOff() {
        System.out.println("снял обувь nike");
    }
}
