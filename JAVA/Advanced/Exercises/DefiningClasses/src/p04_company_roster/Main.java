package p04_company_roster;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());
        Map<String, Department> departments = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String pos = input[2];
            String depar = input[3];
            Employee employee;
            if (input.length == 5) {
                try {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, pos, depar, age);
                }catch (Exception e) {
                    String email = input[4];
                    employee = new Employee(name, salary, pos, depar, email);
                }
            }else if (input.length == 6) {
                int age = Integer.parseInt(input[5]);
                String email = input[4];
                employee = new Employee(name, salary, pos, depar, email, age);
            }else {
                employee = new Employee(name, salary, pos, depar);
            }
            if (departments.containsKey(depar)) {
                departments.get(depar).getMap().put(salary, employee);
            }else {
                Map<Double, Employee> employees = new LinkedHashMap<>();
                employees.put(salary, employee);
                Department department = new Department(employees);
                departments.put(depar, department);
            }
        }

        Map.Entry<String, Department> resultEntry = departments.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    double ave1 = entry1.getValue().getAverage();
                    double ave2 = entry2.getValue().getAverage();
                    return Double.compare(ave2, ave1);
                })
                .findFirst()
                .get();

        System.out.printf("Highest Average Salary: %s%n", resultEntry.getKey());
        resultEntry.getValue().getMap().entrySet().stream()
                .sorted((entry1, entry2) -> Double.compare(entry2.getKey(), entry1.getKey()))
                .forEach(entry -> {
                    String name = entry.getValue().getName();
                    double salary = entry.getValue().getSalary();
                    String email = entry.getValue().getEmail();
                    int age = entry.getValue().getAge();

                    System.out.printf("%s %.2f %s %d%n", name, salary, email, age);
                });

    }
}
