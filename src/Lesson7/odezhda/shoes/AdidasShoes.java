package Lesson7.odezhda.shoes;

public class AdidasShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("надел обувь adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("снял обувь adidas");
    }
}
