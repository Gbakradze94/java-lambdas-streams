package com.example.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {

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
