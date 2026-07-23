import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        int reversed=0;
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
        System.out.println(reversed);
    }
}
