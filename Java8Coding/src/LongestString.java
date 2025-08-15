import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "streamapi", "lambda", "parallel");

        names.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
    }
}
