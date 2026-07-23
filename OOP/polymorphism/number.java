package OOP.polymorphism;

public class number {
    double sum(double a,int b){
        return a+b;
    }
    int sum(int a,int b){
        return  a+b;
    }
    public static void main(String[] args) {
        number obj=new number();//created a class object
        obj.sum(2,3);//calling the object
        obj.sum(4,5,6);

    }
}
