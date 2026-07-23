
public class modulo {
    public static void main(String[] args) {
        int N = 1234;
        while (N > 0) {
            int lastdigit = N % 10;
            // System.out.println(lastdigit);

            N = N / 10;
            System.out.println(N);
        }
    }
}
