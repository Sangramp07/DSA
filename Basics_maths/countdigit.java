

public class countdigit {
    public static int main(String[] args) {
        int count=0;
        int n=1234;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        return count;
    }
}
