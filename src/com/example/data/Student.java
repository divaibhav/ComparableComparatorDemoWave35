package com.example.data;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private String email;

    @Override
    public int compareTo(Student obj){
       //define how you compare
        //define ordering of student object
        // return 0 if both objects are equal
        // return -1 if calling object is smaller than argument object
        //return 1 if calling object is greater than argument object
        //comparing by roll no
       // return Integer.compare(this.rollNo, obj.rollNo);

        //comparing by name
        return this.name.compareTo(obj.name);
    }
    public Student(int rollNo, String name, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
    }

    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
