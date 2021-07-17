package Lesson7.odezhda;


import Lesson7.odezhda.jacket.IJacket;
import Lesson7.odezhda.pants.IPants;
import Lesson7.odezhda.shoes.IShoes;

public class Human implements IHuman {
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;
    private String name;

    public Human( IJacket jacket, IPants pants, IShoes shoes) {

        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;

    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setHand(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setLeg(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setName(IShoes shoes) {
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void getDress() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void unDress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
