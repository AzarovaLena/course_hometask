package Lesson9;

import java.util.Comparator;

public class Sort implements Comparator <Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getId() - p1.getId();
    }

}
