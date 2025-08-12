import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListDesc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 11, 32, 12);

        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
