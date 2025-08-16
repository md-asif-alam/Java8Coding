import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employee= Arrays.asList(
                new Employee("ABC",15000),
                new Employee("XYZ",20000),
                new Employee("JKL",30000)
        );

        employee.stream().max(Comparator.comparing(Employee::getSalary))
                .ifPresent(e->System.out.println(e.getName()+" "+e.getSalary()));

    }
}
