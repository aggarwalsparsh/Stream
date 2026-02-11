import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingFirstCharacter {
    public static void main(String[] args){
        String str="abcabc";
        str=str.toLowerCase();
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
            else {
                System.out.println("null");
                break;
            }
        }

    }
}
