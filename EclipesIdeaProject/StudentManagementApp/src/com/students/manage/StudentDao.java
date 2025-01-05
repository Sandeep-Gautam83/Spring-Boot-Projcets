package com.students.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    // Method to insert student into the database
    public static boolean insertStudentToDB(student st) {
        boolean f = false;
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // JDBC code
            con = CP.createC();
            String q = "INSERT INTO students(sname, sphone, scity) VALUES(?, ?, ?)";
            pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity()); 

            // Execute update
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f;
    }

    // Method to delete student from the database
    public static boolean deleteStudent(int userId) {
        boolean f = false;
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // JDBC code
            con = CP.createC();
            String q = "DELETE FROM students WHERE sid = ?";
            pstmt = con.prepareStatement(q);
            pstmt.setInt(1, userId);

            // Execute update and check if any rows were affected
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                f = true; // Student was successfully deleted
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f;
    }

    // Method to show all students from the database
    public static boolean showAllStudent() {
        boolean f = false;
        Connection con = null;
        Statement stmt = null;
        ResultSet set = null;

        try {
            // JDBC code
            con = CP.createC();
            String q = "SELECT * FROM students";
            stmt = con.createStatement();
            set = stmt.executeQuery(q);

            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString("scity");

                // Display student information
                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Phone : " + phone);
                System.out.println("City : " + city);
                System.out.println("++++++++++++++++++++++++");
            }

            f = true; // Data fetched successfully

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null) set.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f;
    }
}
