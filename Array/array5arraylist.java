import java.util.*;
import java.util.ArrayList;

public class array5arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(5);   
        list.add(6);        
        list.add(7);        
        list.add(8);        
        list.add(9);      
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);  
        //input
        for(int i=0;  i<5;i++){ //fix array size
            list.add(in.nextInt());
        }
        //print
        for(int i=0;i<5;i++){
            System.out.print(list.get(i));
        }

    }
}
