public class rec1 {
    public static void main(String[] args) {
        print(1 );
    }

    static void print(int i){
        if(i>5){
            return ;
        }
        // System.out.println(i);  //reverse order
        print(i+1);
        System.out.println(i); //squencily
        
    }
}
