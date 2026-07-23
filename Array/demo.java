import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int[] a= new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=30;
        // a[6]=5;
        for(int i=0; i<a.length; i++){
            System.out.println(i);
        }
        int[] b=new int[4];
        Scanner in=new Scanner(System.in);
        System.out.println("enter elements in b=");
        for(int i=0; i<b.length;i++){
            b[i]=in.nextInt();

        }
        for(int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
