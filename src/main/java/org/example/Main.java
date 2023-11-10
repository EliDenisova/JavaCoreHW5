package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("John", Arrays.asList(4.0, 4.5, 5.0), "Информатика"));

        students.add(new Student("Alice", Arrays.asList(5.0, 5.0, 5.0), "Информатика"));

        students.add(new Student("Bob", Arrays.asList(3.5, 4.0, 3.0), "Физика"));

        students.add(new Student("Mike", Arrays.asList(4.5, 4.5, 4.5), "Информатика"));

        students.add(new Student("Kate", Arrays.asList(3.0, 3.5, 3.0), "Информатика"));

        students.add(new Student("Mike", Arrays.asList(4.5, 4.5, 5.0), "Информатика"));



        List<Student> filteredStudents = students.stream()

                .filter(student -> student.getSpecialty().equals("Информатика"))

                .filter(student -> student.getAverageGrade() > 4.5)

                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())

                .limit(5)

                .collect(Collectors.toList());



        filteredStudents.forEach(System.out::println);

    }

}
