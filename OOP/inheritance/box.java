package OOP.inheritance;

public class box {
    double l;
    double h;
    double w;

    box(){     //constructor, calls when no argu passed
        this.l=1;
        this.h=2;
        this.w=3;
    }
    //cube
    box(double side){//when one argument passed 
        this.w=side;
        this.l=side;
    }
    box(double l, double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    box(box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void  information(){
        System.out.println("Running the box");
    }
}
