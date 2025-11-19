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
  case "1":
	System.out.println("\n[Start Study Session] Coming soon...\n");
	break;

  case "2":
        System.out.println("\n[View Tasks] Coming soon...\n");
        break;

  case "3":
        System.out.println("\n[Add Tasks] Coming soon...\n");
        break;

  case "4":
        System.out.println("\nExiting StudyTrackr. Goodbye!\n");
        running = false;
	break;
}

}

input.close();

}

// Prints the main menu // 
private static printMainmenu() {
  System.out.println("Main Menu:");
  System.out.println(" 1. Start Study Session");
  System.out.println(" 2. View Tasks");
  System.out.println(" 3. Add Tasks");
  System.out.println(" 4. Exit\n");
}

}
