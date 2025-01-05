package com.students.manage;

import java.util.Objects;

public class student {

    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    // Getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    // Constructor with all parameters
    public student(int studentId, String studentName, String studentPhone, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    // Constructor without studentId (used for insert)
    public student(String studentName, String studentPhone, String studentCity) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    // Default constructor
    public student() {
        // No need for super() here as it's already done implicitly
    }

    // Override toString for better debugging
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
                + ", studentCity=" + studentCity + "]";
    }

    // Override equals and hashCode (if needed for comparing student objects)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return studentId == student.studentId && 
               Objects.equals(studentName, student.studentName) && 
               Objects.equals(studentPhone, student.studentPhone) && 
               Objects.equals(studentCity, student.studentCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentPhone, studentCity);
    }
}
