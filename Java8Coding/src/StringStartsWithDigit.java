import java.util.Arrays;
import java.util.List;

public class StringStartsWithDigit {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("1cc","2aa","abc","3ddd");
        list.stream().filter(word->Character.isDigit(word.charAt(0))).forEach(System.out::println);
    }
}
