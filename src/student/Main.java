
package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a list of courses
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Java Programming", "CS101", 5));
        courses.add(new Course("Web Development", "CS102", 3));
        courses.add(new Course("Data Structures", "CS103", 2));

        // Get student details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter your student ID: ");
        String studentId = scanner.nextLine();

        Student student = new Student(studentName, studentId);

        // Display available courses
        System.out.println("\nAvailable Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i));
        }

        // Prompt student to select a course
        System.out.print("\nEnter the number of the course you want to register for: ");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > courses.size()) {
            System.out.println("Invalid choice. Exiting.");
        } else {
            Course selectedCourse = courses.get(choice - 1);
            student.registerForCourse(selectedCourse);
        }

        scanner.close();
    }
}

