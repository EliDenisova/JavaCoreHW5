package org.example;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Comparator;

import java.util.List;

import java.util.stream.Collectors;



class Student {

    private String name;

    private List<Double> grades;

    private String specialty;



    public Student(String name, List<Double> grades, String specialty) {

        this.name = name;

        this.grades = grades;

        this.specialty = specialty;

    }



    public double getAverageGrade() {

        return grades.stream()

                .mapToDouble(Double::doubleValue)

                .average()

                .orElse(0);

    }



    public String getName() {

        return name;

    }



    public String getSpecialty() {

        return specialty;

    }



    @Override

    public String toString() {

        return "Student " +

                "name = " + name + " " +

        ", grades = " + grades +

                ", specialty = " + specialty + " ";

    }

}

