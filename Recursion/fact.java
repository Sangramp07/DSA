public class fact {
    public static void main(String[] args) {
        int fact=factorial(5);
        System.out.println(fact);
    }
    static  int factorial(int n){
        if(n<2) return 1;

        return factorial(n-1)*n;
    }
}
