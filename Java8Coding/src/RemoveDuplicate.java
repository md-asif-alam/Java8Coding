import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 3, 4);

        list.stream().distinct().forEach(System.out::println);
    }
}
