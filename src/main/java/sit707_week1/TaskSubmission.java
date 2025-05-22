package sit707_week1;

public class TaskSubmission {
	  public boolean submitTask(String studentId, String taskId, int rating, String comment) {
	        if (rating < 1 || rating > 5) return false;
	        if (comment == null || comment.trim().isEmpty()) return false;

	        // Simulate saving to database (or print/log)
	        System.out.println("Task submitted by " + studentId + " with rating " + rating + " and comment: " + comment);
	        return true;
	    }
}
