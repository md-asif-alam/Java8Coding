import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoListWithoutDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
        System.out.println(mergedList);
    }
}
