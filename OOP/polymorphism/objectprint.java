package OOP.polymorphism;

public class objectprint {
    int num;
    public objectprint(int num){
        this.num=num;
        System.out.println("The number is:"+num);
    }
    public static void main(String[] args) {
        objectprint obj=new objectprint(5);
    }
}
