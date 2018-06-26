package p03_mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] arr1 = reader.readLine().split(" ");
        String[] arr2 = reader.readLine().split(" ");

        String studentFirst = arr1[0];
        String studentLast = arr1[1];
        String studentNumber = arr1[2];

        String workerFirst = arr2[0];
        String workerLast = arr2[1];
        double workerSalary = Double.parseDouble(arr2[2]);
        double workerHours = Double.parseDouble(arr2[3]);

        try{
            Student student = new Student(studentFirst, studentLast, studentNumber);
            Worker worker = new Worker(workerFirst, workerLast, workerSalary, workerHours);
            System.out.println(student.toString());
            System.out.println(worker.toString());
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
