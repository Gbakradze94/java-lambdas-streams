package com.example.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;


/**
 * #4.1 Streams In Java
 */
public class StreamsDemo {

    public static void main(String[] args) {
        nonFunctionalFilter();
        functionalFilter();
    }

    public static void functionalFilter() {
        Map<Department, List<Employee>> employeesByDepartments =
                getEmployeesList().stream()
                        .filter(e -> e.getSalary() > 1000)
                        .collect(groupingBy(Employee::getDepartment));
        System.out.println(employeesByDepartments);
    }


    public static void nonFunctionalFilter() {
        List<Employee> employees = getEmployeesList();

        Map<Department, List<Employee>> employeesByDepartments =
                new HashMap<>();                    // Create the list where employees will be grouped by departments

        for (Employee employee : employees) {        // Iterate the list of Employees
            if (employee.getSalary() > 1000) {      // Filter employees by salary greater than 1,000
                Department department = employee.getDepartment();   // identify department of the employee
                List<Employee> employeesForDepartments =
                        employeesByDepartments.get(department);     // get the list of employee for concrete department
                if (employeesForDepartments == null) {                  // If there is no such department,
                    employeesForDepartments = new ArrayList<>();        // add it to the Map and also
                    employeesByDepartments.put(department,              // add put the employee as the value of this department
                            employeesForDepartments);

                    employeesForDepartments.add(employee);

                }
            }
        }
        System.out.println(employeesByDepartments);
    }

    public static List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("James", new Department("Sales"), 600));
        employees.add(new Employee("Scott", new Department("Manufacturing"), 1200));
        employees.add(new Employee("Rachel", new Department("Accounting"), 600));
        employees.add(new Employee("Timothy", new Department("IT"), 820));
        employees.add(new Employee("Simpson", new Department("IT"), 2000));
        employees.add(new Employee("Mike", new Department("Sales"), 800));

        return employees;
    }
}
