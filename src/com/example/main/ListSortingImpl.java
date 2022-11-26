package com.example.main;

import com.example.StudentComparator;
import com.example.data.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortingImpl {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student = new Student(10, "Aaibhav", "V@g");
        Student s1 = new Student(5, "Ramesh", "Z@g");
        Student s2 = new Student(19, "Aikas", "VV@g");

        studentList.add(student);
        studentList.add(s1);
        studentList.add(s2);

        for (Student student1 : studentList) {
            System.out.println(student1);
        }
        Collections.sort(studentList);
        System.out.println("sorted by name");
        for (Student student1 : studentList) {
            System.out.println(student1);
        }

        //sorting by roll no
        Comparator<Student> studentComparator = new StudentComparator();
        studentList.sort(studentComparator);
        System.out.println("sorted by roll no");
        for (Student student1 : studentList) {
            System.out.println(student1);
        }

        //using anonymous class
        Comparator<Student> studentComparatorByEmail = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getEmail().compareTo(o1.getEmail());
            }
        };
        studentList.sort(studentComparatorByEmail);
        System.out.println("sorted by email in descending order");
        for (Student student1 : studentList) {
            System.out.println(student1);
        }
        // by suing lambda
        Comparator<Student> comparator = (o1, o2) ->{
           if(o1.getRollNo() == o2.getRollNo()){
               return 0;
           } else if (o1.getRollNo() < o2.getRollNo()) {
               return -1;
           }
           else{
               return 1;
           }
        };

        Collections.sort(studentList,comparator);
        System.out.println("sorted by roll no using lambda");
        for (Student student1 : studentList) {
            System.out.println(student1);
        }
    }
}
