package OOP.BASICS;

public class oop3 {
    static void fun(){//static dosnt depend on another object
        //in static fxn we cant access variblaes of another constructor
        // so we need to create object and call for getting instance variables
//      greeting(); cant use this bcz it req instance

        oop3 obj=new oop3();
        obj.greeeting();
    }
    void greeeting(){//we can access these instance varibles in any another object
        // called anywhre
        System.out.println("hey");
        
    }
    public static void main(String[] args) {
        
        fun();
    }
}
