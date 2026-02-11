import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

    public static void main(String[] args) {

        //Map() Transforms to square
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = integers.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
        squares.stream().forEach(System.out::println);

        // Filter() Filtering out odd
        List<String> names = Arrays.asList("Apple","Banana","Watermelon","Grapes");

        List<String> shortNames = names.stream()
                .filter(s->s.length()>=6)
                .collect(Collectors.toList());

        shortNames.stream().forEach(System.out::println);

    }

}
