import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple","Banana","Watermelon","Mango");

        // From a collection
        Stream<String> stream1 = list.stream();

        // From Array
        Stream<String> stream2 = Stream.of("Apple","Banana","Watermelon","Mango");

        // From Array
        Stream<String> stream3 = Stream.of("Apple","Banana","Watermelon","Mango");

        // Stream.generate or Stream.iterate
        Stream<Double> randoms = Stream.generate(Math::random).limit(10);

        // for Each
        stream1.forEach(System.out::println);

        // Map for transformation
        stream2.map(String::toUpperCase).forEach(System.out::println);

        // filter
        stream3.filter(s->s.startsWith("A")).forEach(System.out::println);

        System.out.println("##########EXERCISE-1###########");

        // Exercise: 1
        List<String> fruits = Arrays.asList("Apple","Watermelon","Banana","Avacado","Blueberry");
        List<String> newFruits =fruits.stream()
                .filter(s->s.startsWith("B"))
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                ;

        newFruits.stream().sorted().forEach(System.out::println);

        //Exercise: 2  Sum of even numbers
        List<Integer> nums = List.of(1,2,3,4);
        int sum = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sum);

        //Exercise: 3 Sum of odd numbers
        int oddSum = nums.stream()
                .filter(n->n%2!=0)
                .map(n->n*n)
                .reduce(0, Integer::sum);

        System.out.println(oddSum);


    }
}
