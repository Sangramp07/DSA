package OOP.generics;

import java.util.ArrayList;

public class customArraylist {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add(45);
        System.out.println(list);
        list.add(54);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
    }
}
