package STRING;

import java.util.HashSet;
import java.util.Set;

public class longestKSubstr {
    public int longestKSubstr(String s,int k){
        int n=s.length();
        int maxlen=-1;
        
        for(int i=0;i<n;i++){
            Set<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(s.charAt(j));

                if(set.size()==k){
                    maxlen=Math.max(maxlen, j-i+1);
                }
                if(set.size()>k)break;
            }
        }
        return maxlen;
    }
}
