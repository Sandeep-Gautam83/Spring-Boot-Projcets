package Student;

import com.students.manage.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

    public static void main(String[] args) {
        System.out.println("Welcome to Student Management App!");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                try {
                    // Display menu
                    System.out.println("\n===============================");
                    System.out.println("PRESS 1 TO ADD Student");
                    System.out.println("PRESS 2 TO DELETE Student");
                    System.out.println("PRESS 3 TO DISPLAY Students");
                    System.out.println("PRESS 4 TO EXIT App");
                    System.out.println("===============================");
                    System.out.print("Enter your choice: ");

                    // Read user input
                    int choice = Integer.parseInt(br.readLine());

                    // Handle choices with if-else statements
                    if (choice == 1) {
                        // Add student logic
                        System.out.println("Enter student name: ");
                        String name = br.readLine();

                        System.out.print("Enter student phone: ");
                        String phone = br.readLine();

                        System.out.print("Enter student city: ");
                        String city = br.readLine();

                        // Create student object to store student
                        student st = new student(name, phone, city);
                        boolean answer = StudentDao.insertStudentToDB(st);
                        if (answer) {
                            System.out.println("Student added successfully: ");
                            System.out.println(st);
                        } else {
                            System.out.println("Something went wrong. Please try again...");
                        }

                    } else if (choice == 2) {
                        // Delete student logic
                        System.out.print("Enter student id to delete: ");
                        int userId = Integer.parseInt(br.readLine());

                        boolean f = StudentDao.deleteStudent(userId);
                        if (f) {
                            System.out.println("Student deleted successfully.");
                        } else {
                            System.out.println("Something went wrong. Please try again...");
                        }

                    } else if (choice == 3) {
                        // Display students logic
                        System.out.println("Displaying all students...");
                        StudentDao.showAllStudent();

                    } else if (choice == 4) {
                        // Exit application
                        System.out.println("Exiting the application. Goodbye!");
                        break;
                    } else {
                        // Handle invalid choice
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                } catch (IOException e) {
                    System.out.println("An error occurred while reading input. Please try again.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error closing BufferedReader.");
        }
    }
}
