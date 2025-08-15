import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreqOfEachChar {
    public static void main(String[] args) {
        String str = "Leetcode";

        Map<Character, Long> freqOfEachChar = str.chars()
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqOfEachChar);
    }
}
