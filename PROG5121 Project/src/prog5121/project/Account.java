package prog5121.project;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Account {

    static String username = "";
    static String password = "";
    static String firstName = "";
    static String lastName = "";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Username:");
        username = input.nextLine();
        while (!Login.checkUserNameValid(username)) {
            System.out.println(Login.registerUser(username, password));
            System.out.println("Enter Username:");
            username = input.nextLine();
        }

        System.out.println("Enter Password:");
        password = input.nextLine();
        while (!Login.checkPasswordComplex(password)) {
            System.out.println(Login.registerUser(username, password));
            System.out.println("Enter Password:");
            password = input.nextLine();
        }

        System.out.println(Login.registerUser(username, password));
        System.out.println("Enter First Name:");
        firstName = input.nextLine();

        System.out.println("Enter Last Name:");
        lastName = input.nextLine();

        input.close(); 

        JFrame details = new JFrame();

        JOptionPane.showMessageDialog(null, "Welcome to MyWorld");

        String option = JOptionPane.showInputDialog(details, "Choose one of the following: \n "
                + "1. Add tasks \n"
                + "2. Show report \n"
                + "3. Quit \n"
        );

        int x = Integer.parseInt(option);
        if (x == 1) {
            String taskInput = JOptionPane.showInputDialog(details, "Number of tasks:");
            int numOfTasks = Integer.parseInt(taskInput);
            Task[] tasks = new Task[numOfTasks];
            for (int i = 0; i < numOfTasks; i++) {
                String desc = JOptionPane.showInputDialog(details, "Task Description:");
                while (!Task.checkTaskDescription(desc)) {
                    desc = JOptionPane.showInputDialog(details, "Enter description of less than 50 characters");
                }

                String taskName = JOptionPane.showInputDialog(details, "Enter the task name:");
                String developerDetails = JOptionPane.showInputDialog(details, "Enter the developer details:");
                int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(details, "Enter the task duration in hours"));
                String taskStatus = JOptionPane.showInputDialog(details, "Enter the task status (To Do/Done/Doing):");

                Task task = new Task(taskStatus, developerDetails, taskName, desc, taskDuration);
                tasks[i] = task;

                JOptionPane.showMessageDialog(details, task.printTaskDetails());
            }
        } else if (x == 2) {
            JOptionPane.showMessageDialog(details, "Coming Soon");
        } else if (x == 3) {
            System.exit(0);
        }
    }

    static void setUpClass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
