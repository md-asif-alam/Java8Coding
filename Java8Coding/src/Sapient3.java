import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sapient3 {
    public static void main(String[] args) {
        List<String> arr=Arrays.asList("java","python","c","c++","java","python");

         arr.stream().distinct().forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        String result = arr.stream().filter(str -> str.length() >= 4).map(String::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

//1.Array of Strings remove duplicates
//2.filter words equal and gt than 4 length and convert them Uppercase then I need to concat in one string