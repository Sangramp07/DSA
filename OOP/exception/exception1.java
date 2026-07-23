package OOP.exception;

public class exception1 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            devide(a,b);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("this will always execyte");
        }
    }
    static int devide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not devide by zero ");
        }
        return a/b;
    }
}
