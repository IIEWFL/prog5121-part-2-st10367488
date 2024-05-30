package prog5121.project;

public class Task {
    String taskStatus;
    String developerDetails;
    String taskName;
    String taskDescription;
    String taskID;
    int taskDuration;

    private static int nextTaskNumber = 0; 
    private int taskNumber;

    public Task(String taskStatus, String developerDetails, String taskName, String taskDescription, int taskDuration) {
        this.taskStatus = taskStatus;
        this.developerDetails = developerDetails;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDuration = taskDuration;
        this.taskNumber = nextTaskNumber++;
        this.taskID = createTaskID(taskName, this.taskNumber, developerDetails);
    }

    public Task() {
        this.taskNumber = nextTaskNumber++;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public static boolean checkTaskDescription(String desc) {
        return desc.length() <= 50;
    }

    public String createTaskID(String taskName, int taskNumber, String developerDetails) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":"
                + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
    }
    
    

    public String printTaskDetails() {
        return "Task Number: " + taskNumber + "\nTask Status: " + taskStatus + "\nDeveloper Details: " + developerDetails
                + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskID
                + "\nTask Duration: " + taskDuration + " hours";
    }

    public static int returnTotalHours(Task[] tasks) {
        if (tasks == null) {
            return 0;
        }
        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.getTaskDuration();
        }
        return totalHours;
    }

    public int getTaskDuration() {
        return taskDuration;
    }
}
