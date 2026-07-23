package PATTERNS;

public class pattern16 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(char ch='A';ch<='A'+(5-i-1);ch++){
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
// ABCDE
// ABCD
// ABC
// AB
// A