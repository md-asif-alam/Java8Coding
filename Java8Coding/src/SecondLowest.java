import java.util.Arrays;
import java.util.List;

public class SecondLowest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3, 2, 3, 4, 5);
        list.stream().distinct().sorted().skip(1).findFirst().ifPresent(System.out::println);
    }
}
