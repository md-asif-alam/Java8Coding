import java.util.Arrays;
import java.util.List;

public class EvenNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
