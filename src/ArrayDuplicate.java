import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayDuplicate {
    public static void main(String[] args){
       // String str="abcabc";
       // str=str.toLowerCase();

       int[] arr={1,2,3,3,4,4};

        Map<Integer, Integer> freqMap = new LinkedHashMap<>();

        for(Integer ch: arr){
            freqMap.put(ch, freqMap.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
                }
        }

    }
}
