import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {

        String str = "abcabc";

/*
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.valueOf(str.charAt(i)))) {
                System.out.println(list.size());
                break;
            } else {
                list.add(str.valueOf(str.charAt(i)));
            }
 }*/

        Set<String> set = new HashSet<>();
        int maxLen=0, j=0;
        for(int i=0; i<str.length();i++){
            if(set.contains(str.valueOf(str.charAt(i)))){
                set.remove(str.charAt(j++));
            }
            set.add(str.valueOf(str.charAt(i)));
            maxLen=Math.max(maxLen, i-j+1);
        }
          System.out.println(maxLen);

    }
}
