package Lesson9;

import Lesson7.robot.heads.IHead;

public class Product implements Comparable <Product>{
    private static int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product p) {
        int tmp = this.price - ((Product) p).price;
        if (tmp == 0) {
            return this.id - ((Product) p).id;
        } else {
            return tmp;
        }

    }
    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
    }
}