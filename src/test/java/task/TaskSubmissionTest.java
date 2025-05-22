package task;

import static org.junit.Assert.*;
import org.junit.Test;

import sit707_week1.TaskSubmission;

public class TaskSubmissionTest {

    @Test
    public void testTaskSubmissionWithRatingAndComment() {
        TaskSubmission submission = new TaskSubmission();
        boolean result = submission.submitTask("S123", "Task_1", 4, "I feel confident because I followed the rubric closely.");
        assertTrue(result);
    }

    @Test
    public void testInvalidRating() {
        TaskSubmission submission = new TaskSubmission();
        boolean result = submission.submitTask("S123", "Task_1", 6, "Too confident.");
        assertFalse(result); //rating must be 1-5
    }

    @Test
    public void testEmptyComment() {
        TaskSubmission submission = new TaskSubmission();
        boolean result = submission.submitTask("S123", "Task_1", 3, "");
        assertFalse(result);
    }
    
    @Test
    public void testFailOnPurpose() {
        assertTrue("Intentional failure for CI screenshot", false);
    }
}
