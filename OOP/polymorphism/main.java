package OOP.polymorphism;

public class main {
    public static void main(String[] args) {
        shapes shape=new shapes();//creating object calls this for outpt
        circle Circle=new circle();
        square Square=new square();
        triangle Triangle= new triangle();
        shape.area();
        Square.area();
        Triangle.area();
        Circle.area();// call on object notby class name
    }
}
