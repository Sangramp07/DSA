package PATTERNS;

public class pattern19 {
    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int i = 0; i < n; i++) {

            // Left Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 0; i--) {

            // Left Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********