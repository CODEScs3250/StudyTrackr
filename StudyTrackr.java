import java.util.Scanner;

/**
* StudyTrackr
* Is a software that provides students an effective way to
* organize their study sessions, manage subjects, and track
* progress over time.
*
* @author CODEcs3250 ( organization working on overall project).
* @author Brian Flores
* @version 1.0 (Initial working program for iteration 1).
*/

public class StudyTrackr {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
boolean running = true;

// To-Do List feature (separate class)
ToDoList todoList = new ToDoList();

/*
*
* Welcome Banner.
*
*/

System.out.println("-------------------------");
System.out.println("|WELCOME TO StudyTrackr!|");
System.out.println("-------------------------");

// Main Loop implemenation //
while (running) {
printMainMenu();
System.out.print("Select an Option (1-4): ");

String choice = input.nextLine().trim();

switch (choice) {
  case "1":
        System.out.println("\n[Start Study Session] Coming soon...\n");
        break;

  case "2":
        // View Tasks (delegates to ToDoList)
        todoList.viewTasks();
        break;

  case "3":
        // Add Tasks (delegates to ToDoList)
        todoList.addTasks(input);
        break;

  case "4":
        System.out.println("\nExiting StudyTrackr. Goodbye!\n");
        running = false;
        break;

  default:
        System.out.println("\nInvalid choice. Please enter a number 1-4.\n");
        break;
}

}

input.close();

}

// Prints the main menu // 
private static void printMainMenu() {
  System.out.println("Main Menu:");
  System.out.println(" 1. Start Study Session");
  System.out.println(" 2. View Tasks");
  System.out.println(" 3. Add Tasks");
  System.out.println(" 4. Exit\n");
}

}
