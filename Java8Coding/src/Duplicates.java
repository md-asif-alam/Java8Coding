import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 3, 4, 5, 6);
        Set<Integer> set = new HashSet<>();

        Set<Integer> duplicates = list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
