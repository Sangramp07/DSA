public class summ {
    public static void main(String[] args) {
        // int ans= sum(10);
        int ans= sum(10,0);
        System.out.println(ans);
    }
    // static int sum( int n){
    //     if(n==0) return 0;
    //      return n+sum(n-1);
        
    // }

    static int sum(int i,int sum){
        if(i<1) return sum;

        return sum(i-1,sum+i);
    }
    
    

}
