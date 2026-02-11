import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class CustomList {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("Java", "Spring", "Kafka");
        String result = items.stream().collect(Collector.of(() -> new StringJoiner("|", "[", "]"),
                StringJoiner::add,
                StringJoiner::merge,
                StringJoiner::toString
        ));

        System.out.println(result);

    }
}
