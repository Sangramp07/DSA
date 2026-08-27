public class longestPalindrome {
    public String longestPalindromeString(String s){
        int n=s.length();
        int start=0,end=0;

        for(int i=0;i<n;i++){
            int len1=expand(s, i, i);
            int len2=expand(s, i, i+1);
            int len=Math.max(len1, len2);

            if(len>(end-start)){
                start=i-(len-1)/2;
                end=i+len/2;
            }

        }return s.substring(start, end+1);
    }
    private int expand(String s,int left,int right){
        while(left<right && right<s.length() && left>=0){
            left--;
            right++;
        }
        return right-left-1; //length
    }
}
