import java.util.Arrays;
import java.util.List;

public class MinNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().min(Integer::compare).ifPresent(System.out::println);
    }
}
