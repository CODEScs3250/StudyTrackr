# StudyTrackr

For college and university students who need an effective way to organize their study sessions, manage subjects, and track progress over time. 
The StudyTrackr is a Java-based desktop application that helps students record, analyze, and visualize their study habits to improve consistency, goal achievement, and academic performance.
Unlike generic time-tracking or note-taking applications our product provides a focused academic progress tracker with subject-specific insights, offline access, and data visualization tailored to student learning patterns.

# Tutorial

## Prerequisites

Before running this app, you need:

-    **Java 17 or newer**

Check your version:

    java -version

If the output shows:

    java version "17.0.xx"

you're good. Otherwise, download Java here:

https://www.oracle.com/java/technologies/downloads/

## Setup Instructions


### 1. Open your command line

**Windows:** Press Windows Key → type cmd → Enter\
**Mac:** Open Terminal\
**Linux:** Open your system terminal

## Clone the Repository

    git clone https://github.com/CODEScs3250/StudyTrackr

### Alternative (ZIP Download)

1.  Go to the GitHub page\
2.  Click **Code → Download ZIP**\
3.  Extract the ZIP\
4.  Use `cd` to move into the extracted folder

## Installing Requirements

This app requires:

-   **Java JDK 17 or later**


After cloning or downloading:

    cd study-goals-tracker
    cd src
    javac *.java
If there are no errors, it means your program compiled successfully.


## Running the Application

Run:

    java App

This launches the StudyTrackr program.

🖥️ Startup Screen

When you run the app, you should see something like:


=======================================
     Welcome to the Study Tracker!
=======================================

1. Add Study Session
2. View Study Sessions
3. Add Goal
4. View Goals
5. Save & Exit
---------------------------------------
Enter an option (1-5):


If you see this menu, the app is running correctly.


## Main Menu Navigation

### Add Study Session

Enter:

-   Subject\
-   Date (YYYY-MM-DD)\
-   Minutes\
-   Notes (optional)

Example:

    Subject: Math
    Date: 2025-11-20
    Minutes: 45
    Notes: Quiz review

### View Study Sessions

Lists all logged sessions.

### Add Goal

Enter:

-   Title\
-   Description\
-   Target date\
-   Tasks (optional)

### View Goals

Displays all goals.

### Save & Exit

Saves data and closes the app.
