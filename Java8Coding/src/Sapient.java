import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sapient {
    public static void main(String[] args) {
        String str="abcbcc";

        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long max=Long.MIN_VALUE;
        char mfc=' ';
        for(Character ch:collect.keySet()){
            if(collect.get(ch)>max){
                mfc=ch;
            }
        }
        collect.remove(mfc);
        max=Long.MIN_VALUE;
        mfc=' ';
        for(Character ch:collect.keySet()){
            if(collect.get(ch)>max){
                mfc=ch;
            }
        }
        System.out.println(mfc);


    }
}
