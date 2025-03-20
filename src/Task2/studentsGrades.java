package Task2;

import Helper.Helper;

public class studentsGrades {
    public static void main(String[] args) {
        System.out.println("Enter the number of subject: ");
        int numOfSubject = Helper.getNumberFromUser();

        int totalMarks = 0;
        for (int i = 1; i <= numOfSubject; i++) {
            System.out.print("Enter marks for subject " + i + " (0-100): ");
            int marks = Helper.getNumberFromUser();
            // Check if the marks are valid
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter a number between 0 and 100.");
                return; // Stop the program if invalid input is detected
            }
            totalMarks += marks;
    }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numOfSubject;

        // Assign grade based on percentage
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

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
