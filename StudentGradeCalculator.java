import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        calculateStudentGrade();
    }

    static void calculateStudentGrade() {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");

        // Assuming three subjects for demonstration purposes
        System.out.print("Subject 1: ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Subject 2: ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Subject 3: ");
        int subject3Marks = scanner.nextInt();

        // Step 2: Calculate Total Marks
        int totalMarks = subject1Marks + subject2Marks + subject3Marks;

        // Step 3: Calculate Average Percentage
        int totalSubjects = 3; // Assuming three subjects for demonstration purposes
        double averagePercentage = (double) totalMarks / (totalSubjects * 100) * 100;

        // Step 4: Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Step 5: Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
