package objeckorient.objeck6;

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
        
        Stream<Employee> sequentialEmployeeStream = employeeList.stream();

        
        sequentialEmployeeStream.forEach(employee->System.out.println(employee+": "+Thread.currentThread().getName()));
       
        System.out.println("----------------------------------------");

       
        Stream<Employee> parallelEmployeeStream = employeeList.parallelStream();

        
        parallelEmployeeStream.forEach(employee->System.out.println(employee+": "+Thread.currentThread().getName()));
        


    }
}
