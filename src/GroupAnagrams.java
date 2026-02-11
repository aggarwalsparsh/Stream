import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] str= {"eat","tea","tan","ate","nat","bat"};
        //OUTPUT:  [[eat, tea, ate], [tan, nat], [bat]]
        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String s: str){
            char[] chars = s.toCharArray(); // eat
            Arrays.sort(chars); // aet
            String key= new String(chars);  //aet
            map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }

        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
