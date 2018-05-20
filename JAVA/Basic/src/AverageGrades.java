import java.util.*;
import java.util.stream.Collectors;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] input = scan.nextLine().split(" ");
            ArrayList<Double> arrayList = new ArrayList<>();
            for (int j = 1; j < input.length; j++) {
                arrayList.add(Double.parseDouble(input[j]));
            }
            students.add(new Student(input[0], arrayList));
        }
        List<Student> list = students
                .stream()
                .filter(s -> s.getAverage() >= 5)
                .sorted(
                        Comparator.comparing(Student::getName)
                        .thenComparing(Comparator.comparing(Student::getAverage).reversed())
                )
                .collect(Collectors.toList());

        for (Student student : list) {
            System.out.printf("%s -> %.2f%n", student.getName(), student.getAverage());
        }

            

    }
    public static class Student {
        private String name;
        private ArrayList<Double> grades;

        public Student(String name, ArrayList<Double> grades) {
            this.name = name;
            this.grades = grades;
        }

        public ArrayList<Double> getGrades() {
            return grades;
        }

        public void setGrades(ArrayList<Double> grades) {
            this.grades = grades;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAverage() {
            return Arrays
                    .stream(this.grades.toArray())
                    .mapToDouble(n -> (double)n)
                    .average()
                    .getAsDouble();
        }
    }


}
