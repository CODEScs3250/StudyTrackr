import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ToDoList
 * Handles storing and managing simple text-based tasks
 * for the StudyTrackr application.
 */
public class ToDoList {

    private List<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    // Show all tasks
    public void viewTasks() {
        System.out.println("\n--- Your Tasks ---");
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet. Add one from the main menu.\n");
        } else {
            int index = 1;
            for (String task : tasks) {
                System.out.println(index + ". " + task);
                index++;
            }
            System.out.println();
        }
    }

    // Add tasks using Scanner loop
    public void addTasks(Scanner input) {
        System.out.println("\n[Add Tasks]");
        boolean adding = true;

        while (adding) {
            System.out.print("Enter a new task (or type 'q' to go back to the main menu): ");
            String newTask = input.nextLine().trim();

            if (newTask.equalsIgnoreCase("q")) {
                System.out.println("Returning to main menu...\n");
                adding = false;
            } else if (newTask.isEmpty()) {
                System.out.println("Task cannot be empty. Try again.");
            } else {
                tasks.add(newTask);
                System.out.println("Task added: " + newTask + "\n");
            }
        }
    }

    // (Optional) simple single-task add, if you need it later
    public void addTask(String task) {
        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task.trim());
        }
    }
}
