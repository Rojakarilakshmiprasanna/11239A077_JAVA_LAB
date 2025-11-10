public class Student {
    // Fields
    String name;
    String rollNumber;
    int marks;

    // Method to display info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Method to calculate grade
    public void calculateGrade() {
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }

    // Main method
    public static void main(String[] args) {
        // Create student objects without constructor
        Student student1 = new Student();
        student1.name = "Alice";
        student1.rollNumber = "S101";
        student1.marks = 92;

        Student student2 = new Student();
        student2.name = "Bob";
        student2.rollNumber = "S102";
        student2.marks = 67;

        Student student3 = new Student();
        student3.name = "Charlie";
        student3.rollNumber = "S103";
        student3.marks = 45;

        // Display info and grade for student1
        System.out.println("=== Student 1 ===");
        student1.displayInfo();
        student1.calculateGrade();

        // student2
        System.out.println("\n=== Student 2 ===");
        student2.displayInfo();
        student2.calculateGrade();

        // student3
        System.out.println("\n=== Student 3 ===");
        student3.displayInfo();
        student3.calculateGrade();
    }
}