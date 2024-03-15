import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF SUBJECTS: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("ENTER MARKS OBTAINED IN A SUBJECT " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

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

        System.out.println("----------------------------");
        System.out.println("TOTAL MARKS: " + totalMarks);
        System.out.println("AVERAGE PERCENTAGE: " + averagePercentage + "%");
        System.out.println("GRADE: " + grade);

        scanner.close();
    }
}
