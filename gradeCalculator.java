import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Roll No.: ");
        int rollNo = sc.nextInt();

        System.out.println("Enter Name: ");
        String name = sc.next();

        System.out.println("Enter Total Number of Subjects:");
        int noSubjects = sc.nextInt();

        int[] marks = new int[noSubjects]; // Array to store marks
        int totalMarks = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < noSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            int Marks = sc.nextInt();

            // Input validation for marks range
            while (Marks < 0 || Marks > 100) {
                System.out.println("Please enter valid marks (0-100).");
                System.out.println("Enter marks for subject " + (i + 1) + ": ");
                Marks = sc.nextInt();
            }

            marks[i] = Marks; // Store in array
            totalMarks += Marks;

            // Finding highest and lowest marks
            if (Marks > highest) {
                highest = Marks;
            }
            if (Marks < lowest) {
                lowest = Marks;
            }
        }

        System.out.println("\nResult:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + (totalMarks / noSubjects) + "%");
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
