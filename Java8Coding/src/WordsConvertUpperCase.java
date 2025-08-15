import java.util.Arrays;
import java.util.List;

public class WordsConvertUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "streamapi", "lambda", "parallel");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String names1="java streamapi labmda parallel";
        Arrays.stream(names1.split(" ")).map(String::toUpperCase).forEach(System.out::println);
    }
}
