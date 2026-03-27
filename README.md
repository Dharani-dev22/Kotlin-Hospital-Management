# Kotlin Hospital Management System

A beginner-friendly, console-based Hospital Management application written in Kotlin. This project demonstrates core object-oriented programming concepts, allowing users to easily admit patients, manage their records, and handle the discharge process.

## Features
* **Admit Patients:** Register new patients into the system by entering their name, age, and ailment.
* **View Patient Records:** Display a complete list of all patients, including their unique IDs and current admission status.
* **Discharge Patients:** Update a patient's status from 'Admitted' to 'Discharged' using their system ID.
* **Search Functionality:** Quickly look up a specific patient's record and status by searching for their name.

## Prerequisites
To run this project on your local machine, you will need to have the following installed:
* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/)
* [Kotlin Compiler](https://kotlinlang.org/docs/command-line.html)

## How to Run Locally

1. **Clone the repository:**
   Download or clone this repository to your local machine using the green "Code" button above, or run this command in your terminal:
   `git clone <paste-your-repository-url-here>`

2. **Navigate to the folder:**
   Open your Command Prompt (CMD) or terminal and navigate to the project directory:
   `cd path/to/your/folder`

3. **Compile the Kotlin file:**
   Run the following command to compile the code into a runnable JAR file. *(Note: If your file is named differently, replace `hos.kt` with your exact file name)*:
   `kotlinc hos.kt -include-runtime -d hospital.jar`

4. **Run the application:**
   Execute the compiled JAR file to start the program:
   `java -jar hospital.jar`

---
*Developed by Dharani*
