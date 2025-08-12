import java.util.Arrays;
import java.util.List;

public class UpperCaseString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda");

        words.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
