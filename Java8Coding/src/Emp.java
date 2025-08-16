import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp {
    String name;
    String dept;
    Emp(String name, String dept) { this.name = name; this.dept = dept; }
//    public String getDept() { return dept; }
//    public String getName() { return name; }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<Emp> empList = Arrays.asList(
                new Emp("John", "HR"),
                new Emp("Alice", "IT"),
                new Emp("Bob", "HR"),
                new Emp("Carol", "IT")
        );

//        Map<String, List<Emp>> groupByDept = empList.stream().collect(Collectors.groupingBy(Emp::getDept));
        Map<String, List<Emp>> groupByDept = empList.stream().collect(Collectors.groupingBy(emp -> emp.dept));
        System.out.println(groupByDept);
    }
}
