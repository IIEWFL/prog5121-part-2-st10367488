package prog5121.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCheckTaskDescription() {
        System.out.println("Valid description");
        String desc = "Create Login to authenticate user";
        String desc2 = "TODO review the generated test code and remove the default call to fail";
        boolean expResult = true;
        boolean result = Task.checkTaskDescription(desc);
        boolean result2 = Task.checkTaskDescription(desc2);
        assertTrue(result);
        assertFalse(result2);
    }

    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");

        
        Task[] tasks = null;
        int expResult = 0;
        int result = Task.returnTotalHours(tasks);
        assertEquals(expResult, result);

      
        tasks = new Task[] {};
        expResult = 0;
        result = Task.returnTotalHours(tasks);
        assertEquals(expResult, result);

      
        tasks = new Task[2];
        int[] durations = {18, 71}; 
        int totalExpectedHours = 0;
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new Task("Status", "Developer", "Task" + (i + 1), "Description", durations[i]);
            totalExpectedHours += durations[i];
        }

        result = Task.returnTotalHours(tasks);
        assertEquals(totalExpectedHours, result);
    }

    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "Login Feature";
        int taskNumber = 0;
        String developerDetails = "Robyn Harrison";
        String expResult = "LO:0:SON";
        Task instance = new Task("defaultStatus", developerDetails, taskName, "defaultDescription", 0);
        String result = instance.createTaskID(taskName, taskNumber, developerDetails);
        System.out.println(result);
        assertEquals(expResult, result);
    }
}
