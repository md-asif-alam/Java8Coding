import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> sumOfNum = list.stream().reduce((a, b) -> a + b);
        sumOfNum.ifPresent(System.out::println);


        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
