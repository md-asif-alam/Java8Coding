import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqCount {
    public static void main(String[] args) {
        String str = "Java is a high level language and Java is OOP language";
        Map<String, Long> freqCount = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqCount);
    }
}
