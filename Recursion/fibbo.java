public class fibbo {
    public static void main(String[] args) {
        int ans=fibonaci(5);
        System.out.println(ans);
    }
    static   int fibonaci(int n){
        if(n<2) return n;

        return  fibonaci(n-1)+fibonaci(n-2);
    }
}
