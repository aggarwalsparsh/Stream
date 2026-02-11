import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountStreamAPI {
    public static void main(String[] args){
        String str="Sparsh";

        Map<Character, Long> wordCount= str.toUpperCase() // convert it to upperCase
                .chars() // convert to int stream
                .mapToObj(c -> (char)c) //convert to char stream
                .filter(c->c != ' ') // ignore spaces
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting())
                        );
               // .forEach((k,v)-> System.out.println(k + ":" + v));

        System.out.println(wordCount);
    }
}
