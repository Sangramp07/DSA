package OOP.Abstract;

public abstract class parent {
    //this methods does not have body
    abstract void career(String name);
    abstract void partner(String name,int age);
    int age;
    public parent(int age){
        this.age=age;
    }
    static void hey(){
        System.out.println("Hey");
    }
}
