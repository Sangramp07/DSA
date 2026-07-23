package OOP.interfaces.nested;

public class A {
    public interface nestedint{
        boolean isOdd(int num);
    }

}
class B implements A.nestedint {

    @Override
    public boolean isOdd(int num){
        return (num&1)==1;
    }
}
