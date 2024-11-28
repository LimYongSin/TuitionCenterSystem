
package student;

public class Student {
    private String studentName;
    private String studentId;

    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void registerForCourse(Course course) {
        if (course.registerStudent()) {
            System.out.println("Success! " + studentName + " has registered for " + course.getCourseName() + ".");
        } else {
            System.out.println("Sorry, " + course.getCourseName() + " is fully booked.");
        }
    }
}

