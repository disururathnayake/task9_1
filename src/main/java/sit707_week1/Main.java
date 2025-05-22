package sit707_week1;

/**
 * Hello world!
 *	
 * @author Ahsan Habib
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskSubmission submission = new TaskSubmission();

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Task ID: ");
        String taskId = scanner.nextLine();

        System.out.print("Enter Rating (1 to 5): ");
        int rating = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your comment: ");
        String comment = scanner.nextLine();

        boolean result = submission.submitTask(studentId, taskId, rating, comment);

        if (result) {
            System.out.println("✅ Task submitted successfully!");
        } else {
            System.out.println("❌ Submission failed. Please check your input.");
        }

        scanner.close();
    }
}
