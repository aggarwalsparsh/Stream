import java.util.HashMap;
import java.util.Map;

public class CharCountInString {
    public static void main(String[] args){
        String str="Sparsh Aggarwal";
        str=str.toLowerCase();
        Map<Character,Integer> reqMap = new HashMap<>();

        for(char ch: str.toCharArray()) {
            if (ch!=' ') {
                reqMap.put(ch, reqMap.getOrDefault(ch, 0) + 1);

            }
        }
        for(Map.Entry<Character,Integer> entry: reqMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
