import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args){

        List<Integer> numbers = List.of(1,2,3,4,5,6);

    // Filter even numbers
        List<Integer> evenNo = numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        // .toList(); //both are same

        System.out.println("Filter even numbers" + evenNo);

    //Uppercase every string
        List<String> names =  List.of("Sparsh","AGGARWAL");
        List<String> lowerCase = names.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println("Lowercase every string" + lowerCase);

    //Max and min

        List<Integer> num = List.of();

        Optional<Integer> max = numbers.stream().max(Integer::compare);
        Optional<Integer> min = numbers.stream().min(Integer::compare);

        Optional<Integer> maxNull = num.stream().max(Integer::compare);
        Optional<Integer> minNull = num.stream().min(Integer::compare);

        System.out.println("Max " + max);
        System.out.println("Min " + min);

        System.out.println("MaxNull " + maxNull);
        System.out.println("MinNull " + minNull);

    // Count names starting with a vowel
        List<String> list = List.of("One", "Two", "Three", "Apple", "Eleven", "Watermelon", "Banana", "Banana");
        long count = list.stream().filter(s->s!=null && s.matches("(?i)^[aeiou].*")).count();

        System.out.println("Vowel count" + count);

    // Unique Elements && list size && parallel stream
        long counts= list.stream().map(String::length).count();
        System.out.println("Total count" + counts);

        List<String> names1 = list.stream().distinct().toList();
        System.out.println("Unique Elements" + names1);

        List<String> names2 = list.parallelStream().distinct().toList();
        System.out.println("Unique Elements" + names2);

    //Sort employees by name
        List<Student> students = List.of(
                new Student(101,"Sparsh", "Aggarwal"),
                new Student(102,"Chirag", "Aggarwal")
                );

        List<Student> sorted = students.stream()
                .sorted(Comparator.comparing(Student::getName)).toList();

        System.out.println("Sorted List: " + sorted.get(0).getName() + ", " + sorted.get(1).getLastname());

    // 7) Remove nulls from a list
        List<String> listWithNull = Arrays.asList("One", "Two", null);
        List<String> listWithoutNull = Optional.ofNullable(listWithNull).orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .toList();

        System.out.println("listWithoutNull: " + listWithoutNull);
    }
}
