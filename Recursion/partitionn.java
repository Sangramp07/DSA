import java.util.ArrayList;
import java.util.List;

public class partitionn {
     public List<List<String>> partition(String s) { 
        List<List<String>> res = new ArrayList<>(); 
        List<String> path = new ArrayList<>(); 
        func(0, s, path, res); 
        return res; 
    } 

    void func(int index, String s, List<String> path, List<List<String>> res) { 
        if (index == s.length()) { 
            res.add(new ArrayList<>(path)); 
            return; 
        } 
        for (int i = index; i < s.length(); ++i) { 
            if (ispalindrome(s, index, i)) { 
                path.add(s.substring(index, i + 1)); 
                func(i + 1, s, path, res); 
                path.remove(path.size() - 1); 
            } 
        } 
    } 

    boolean ispalindrome(String s, int start, int end) { 
        while (start < end) { // Changed to 'start < end' since a single character is always a palindrome
            if (s.charAt(start++) != s.charAt(end--)) { // Added end-- here
                return false; 
            } 
        } 
        return true; 
    } 

}
