public class demo {
    
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{5,6,7}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){
        //persons=row
        //acc=col
        int ans=Integer.MAX_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;;
            for(int account=0;account<accounts.length;account++){
                sum+=accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
