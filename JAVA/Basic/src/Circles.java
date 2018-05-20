import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Circles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr1 = scan.nextLine().split(" ");
        String [] arr2 = scan.nextLine().split(" ");

        double x1 = Integer.parseInt(arr1[0]);
        double x2 = Integer.parseInt(arr2[0]);

        double y1 = Integer.parseInt(arr1[1]);
        double y2 = Integer.parseInt(arr2[1]);

        double r1 = Integer.parseInt(arr1[2]);
        double r2 = Integer.parseInt(arr2[2]);

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        Circle c1 = new Circle(p1, r1);
        Circle c2 = new Circle(p2, r2);

        double d = c1.getRad() + c2.getRad();
        double range = Math.sqrt(Math.pow(
                c1.getCenter().getX() - c2.getCenter().getX(), 2
        ) + Math.pow(
                c1.getCenter().getY() - c2.getCenter().getY(), 2
        ));

        if (d < range) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

    }

    public static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }

    public static class Circle {
        private Point center;
        private double rad;

        public Circle(Point center, double rad) {
            this.center = center;
            this.rad = rad;
        }

        public Point getCenter() {
            return center;
        }

        public void setCenter(Point center) {
            this.center = center;
        }

        public double getRad() {
            return rad;
        }

        public void setRad(double rad) {
            this.rad = rad;
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

