import java.util.Scanner;

public class palindrome {
    // reversed is same as input
    public static void main(String[] args) {
        int reversed=0;
        
        int dup=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers:");

        int n = in.nextInt();
        System.out.println("is:");
        while (n > 0) {
            int lastd = n % 10;
            reversed=(reversed*10)+lastd;
            n = n / 10;
        ;
        }
        if(dup==reversed){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
