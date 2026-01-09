# Sports Team Finance Tracker 🏈💰

A Java-based financial management project designed for athletic teams/programs to track team expenses. This project demonstrates **Object-Oriented Programming (OOP)** principles and data handling.

##  Key Features
- **Object-Oriented Architecture:** Utilizes **Inheritance** and **Polymorphism** to distinguish between Equipment, Travel, and General expenses.
- **Data Persistence:** Implemented a custom **FileManager Java file** to handle **CSV File I/O**, allowing data to be saved on exit and reloaded on startup.
- **Data Management:** Uses the **ArrayList** to manage data storage during runtime.
- **CLI:** A clean Command Line Interface with input validation.

## Technical Stack
- **Language:** Java version 17+
- **Project Modeling:** Object-Oriented Programming
- **Storage/Data:** CSV (Comma Separated Values)

##  Class Structure
- `Main.java`: The central engine and user interface loop.
- `Expense.java`: The base parent class utilizing **Encapsulation**.
- `Equipment.java` & `Travel.java`: Subclasses demonstrating **Method Overriding**.
- `FileManager.java`: The Data Access Object (DAO) responsible for File I/O.

