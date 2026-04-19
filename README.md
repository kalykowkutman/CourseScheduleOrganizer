### Course Schedule Organizer

👤 Student Information
Name: Kutman Kalykov
 
## Project Description

Course Schedule Organizer is a console-based application developed in Java using Object-Oriented Programming (OOP) principles.
The system allows users to manage course schedules by adding, viewing, updating, and deleting course records.

The application ensures data persistence by storing information in a file, allowing users to save and load schedules between sessions.


## Objectives
• Implement a complete CRUD system
• Apply OOP principles (Encapsulation, Inheritance, Polymorphism)
• Store and retrieve data from files
• Create a user-friendly command-line interface
• Handle errors and validate user input

## Features
•  Add new course
•  View all courses
•  Update course details
•  Delete course
•  Export data to CSV file
•  Import data from CSV file
•  Input validation and error handling


## Project Requirements Implemented
1. CRUD operations
2. Command Line Interface (CLI)
3. Input validation
4. Data persistence using file
5. Modular design
6. Documentation (README)
7. Error handling
8. Encapsulation (private fields, getters/setters)
9. Inheritance (User → Admin)
10. Polymorphism (method overriding)

CourseScheduleOrganizer/
├── Main.java
├── Course.java
├── CourseManager.java
├── FileManager.java
├── User.java
├── Admin.java
└── courses.csv

## OOP Concepts Used

# Encapsulation
• Implemented in Course class using private fields and public getters/setters

# Inheritance
• Admin class extends User

# Polymorphism
• showMenu() method is overridden in Admin class


## How to Run the Project
1. Open the project in IntelliJ IDEA or any Java IDE
2. Compile all .java files
3. Run Main.java
4. Use the menu to interact with the system

1. Add Course
   Enter ID: 1
   Enter course name: Math
   Enter date: 2026-04-15
   Enter time: 14:00

## Test Cases
Input
Expected Output
Add valid course
Course added successfully
Invalid ID (text)
Error message
Delete existing course
Course removed
Import file
Data loaded

## File Storage
• Data is stored in courses.csv
• Format:

1,Math,2026-04-15,14:00
2,English,2026-04-16,16:00

## Error Handling
• try-catch blocks prevent crashes
• invalid inputs are handled gracefully
# Presentation link
https://canva.link/l12khcb18kk4l4b