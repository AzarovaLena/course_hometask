package Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Shope {

    private ArrayList <Product> list;
    public ArrayList<Product> getList() {
        return list;
    }
    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public void add (Product p) {
       if (list.size() == 0) {
          list.add(p);
           return;
      }
        for (Product i : list) {
           if (i.getId() == p.getId()) {
               System.out.println("Товар существует");
               return;
            }
        }
        list.add (p);
    }

    public ArrayList<Product> getProductAscending() {
        Collections.sort(list);
        System.out.println(list.toString());
        return list;
    }

    public void getProductId() {
        Comparator<Product> idComparator = new Sort();
        Collections.sort(list, idComparator);
        System.out.println(list);
    }

    public void remove (int id) {
        Iterator<Product> pI = list.iterator();
        while (pI.hasNext()) {
            Product nextProduct = pI.next();
            if ( nextProduct.getId() == id) {
                pI.remove();
            }
        }
    }
    public void changes (Product p) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == p.getId()) {
                list.set(i, p);
                return;
            }
        }
    }
    }

