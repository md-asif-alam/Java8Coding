import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5);
        list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }
}
