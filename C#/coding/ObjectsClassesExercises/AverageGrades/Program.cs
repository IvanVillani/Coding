using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AverageGrades
{
    class Program
    {
        class Student
        {
            public string Name { get; set; }
            public double[] Grades { get; set; }
            public double Average {
                get
                {
                    double average = Grades.Average();
                    return average;
                } }
        }

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<Student> students = new List<Student>();

            for (int i = 1; i <= n; i++)
            {
                string[] input = Console.ReadLine().Split().ToArray();
                double[] inputGrades = input.Skip(1).Select(double.Parse).ToArray();
                Student inputStudent = new Student() { Name = input[0], Grades = inputGrades };
                students.Add(inputStudent);
            }

            List<Student> resultStudents = new List<Student>();

            foreach (Student student in students)
            {
                if (student.Average >= 5.00)
                {
                    resultStudents.Add(student);
                }
            }

            resultStudents = resultStudents.OrderBy(a => a.Name).ThenByDescending(a => a.Average).ToList();

            foreach (Student student in resultStudents)
            {
                Console.WriteLine("{0} -> {1:f2}", student.Name, student.Average);
            }
        }
    }
}
