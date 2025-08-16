import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String sentence = "java stream api interview questions";

        String result = Arrays.stream(sentence.split(" "))
                .map(word->word.substring(0,1).toUpperCase()+word.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
