import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstLetterStartWithJ {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda");

        Optional<String> startWithJ = words.stream().filter(word -> word.startsWith("j")).findFirst();
        startWithJ.ifPresent(System.out::println);
    }
}
