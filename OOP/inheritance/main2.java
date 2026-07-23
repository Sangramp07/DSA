package OOP.inheritance;

public class main2 extends box{
    double weight;
    public main2(){
        this.weight=-1;
    }
    main2(main2 other){
        super(other);
        weight=other.weight;
    }
    main2(double side,double weight){
        super(side);
        this.weight=weight;
    }
    public main2(double l, double h, double w, double weight){
        super(l, h, weight);//calls the parent  class constructor
        //used to intialize values present in parent class
        this.weight=weight;
    }
}
