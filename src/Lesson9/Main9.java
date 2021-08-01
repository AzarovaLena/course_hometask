package Lesson9;

import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args) {
        Shope sp = new Shope();
        sp.setList(new ArrayList<>());
        Product p1 = new Product(0, "шапка", 30);
        Product p2 = new Product(1, "куртка", 100);
        Product p3 = new Product(2, "платье", 40);
        Product p4 = new Product(3, "брюки", 50);
        Product p5 = new Product(4, "юбка", 60);
        Product p6 = new Product(5, "шарф", 20);

        sp.add(p1);
        sp.add(p2);
        sp.add(p3);
        sp.add(p4);
        sp.add(p5);
        sp.getProductAscending();
        sp.remove(3);
       sp.getProductId();
       sp.changes(p6);
       sp.getProductId();

    }
}

