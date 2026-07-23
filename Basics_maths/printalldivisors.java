import java.util.Scanner;

public class printalldivisors {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=in.nextInt();
        for(int i=1;i<n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
            else{
                continue;
            }
        }
    }
}