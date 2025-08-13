import java.util.Arrays;
import java.util.List;

public class WordsGt4Len {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda");
        long count = words.stream().filter(word -> word.length() > 4).count();
        System.out.println(count);
    }
}
