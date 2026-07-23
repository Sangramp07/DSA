package PATTERNS;

public class Pattern20 {
    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int i = 1; i <= n; i++) {

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}