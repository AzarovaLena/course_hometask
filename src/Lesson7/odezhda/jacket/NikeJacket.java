package Lesson7.odezhda.jacket;

public class NikeJacket implements IJacket{
   @Override
   public void putOn () {
       System.out.println("надел куртку nike");
   }

    @Override
    public void takeOff() {
        System.out.println("снял куртку nike");
    }
}
