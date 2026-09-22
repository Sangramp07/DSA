public class rec2 {
    public static void main(String[] args) {
        print(5, 5);
    }
    static void print(int i,int n){
        if(i<1){
            return ;
        }
        // System.out.println(i);  reverse order
        print(i-1,n);
        System.out.println(i); //squencily
    }
}
