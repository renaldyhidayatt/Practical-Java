package objeckorient.objeck5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeMain {

    private static final Employee[] arrayOfEmployees = {
            new Employee(1, "Michael Brown", 8_000.0),
            new Employee(2, "Robert Gates", 7_000.0),
            new Employee(3, "Mark Miller", 5_000.0)
    };

    public static void main(String[] args) {

        
        List<Employee> employeeList = Arrays.asList(arrayOfEmployees);
       
        Stream<Employee> employeeStream = employeeList.stream();

        double totalSalary = employeeStream.reduce(0.0,
                (subTotal, employee) -> subTotal + employee.getSalary(),
                Double::sum);
      
        System.out.println("Total salary:" + totalSalary);


    }
}
