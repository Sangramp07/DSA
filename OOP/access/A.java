package OOP.access;

public class A {
    int num;
    int[] arr;
    String name;

    public A(int num, String name, int[] arr){
        this.num=num;
        this.name=name;
        this.arr=arr;
    }
    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num=num;
    }

}
