package PATTERNS;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter no:");
        int n=in.nextInt();
    for(int i=0;i<n;i++){
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
            //prints space
        }
        //star
        for (int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    }
}
// 
// 0     *
// 1    ***
// 2   *****
// 3  *******
// 4 ********* 