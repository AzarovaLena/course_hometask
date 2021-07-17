package Lesson7.odezhda;

import Lesson7.odezhda.jacket.IJacket;
import Lesson7.odezhda.jacket.NikeJacket;
import Lesson7.odezhda.pants.AdidasPants;
import Lesson7.odezhda.pants.IPants;
import Lesson7.odezhda.shoes.IShoes;
import Lesson7.odezhda.shoes.NikeShoes;

public class Test {
    public static void main(String[] args) {
        IJacket jacket = new NikeJacket();
        IPants pants = new AdidasPants();
        IShoes shoes = new NikeShoes();


        Human stive = new Human(jacket, pants, shoes);
        stive.setName("Stiv");
        System.out.println(stive.getName());
        stive.getDress();
        stive.unDress();
    }
}
