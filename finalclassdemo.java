// Declaring a final class
final class Student {
    
    private int rollNo;
    private String name;

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display details
    void showInfo() {
        System.out.println("Student Roll No : " + rollNo);
        System.out.println("Student Name    : " + name);
    }
}

// Main class
public class finalclassdemo {
    public static void main(String[] args) {

        // Creating object of final class
        Student s1 = new Student(101, "Vaibhav");

        // Displaying student information
        s1.showInfo();
    }
}
 