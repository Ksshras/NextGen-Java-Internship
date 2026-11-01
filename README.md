# Java Programming Internship — Next Gen Software Hub

A personal repository documenting work completed during the **4-week Java Programming Internship** at **Next Gen Software Hub**.

## Technology

- **Language:** Java
- **Database:** MySQL
- **Connectivity:** JDBC (MySQL Connector/J)
- **Tools:** JDK, VS Code, MySQL Workbench, Git and GitHub

## Repository structure

```text
NextGen-Java-Internship/
├── README.md
├── .gitignore
├── JDBCTest.java
├── Week1_JavaBasics/
├── Week2_Calculator/
├── Week3_ExceptionHandling/
└── Week4_JDBC/
    └── InternshipDB.sql
```

## Weekly progress

| Week | Topics / deliverables | Status |
|---|---|---|
| Week 1 | Java basics, variables, data types, classes and objects, marks input and calculation | Uploaded |
| Week 2 | Constructors, inheritance, polymorphism, encapsulation, abstraction, interfaces; calculator and banking mini-projects | Uploaded |
| Week 3 | Exception handling, file handling, multithreading, Student Record Manager and Task Simulator | Uploaded |
| Week 4 | MySQL database setup, JDBC driver configuration and Java connection test | In progress |

## Week 1 — Java basics

- `JavaBasics.java`: variables, data types, and console output.
- `Student.java`: class, object, fields, and a display method.
- `MarksCalculator.java`: calculates total, average, and grade from subject marks.
- `MarksInput.java`: accepts student details and marks using `Scanner`.

## Week 2 — Object-oriented programming

- `StudentConstructor.java`: constructor example.
- `InheritanceDemo.java`: inheritance using `extends`.
- `MethodOverloading.java` and `MethodOverriding.java`: compile-time and runtime polymorphism.
- `EncapsulationDemo.java`: private data and controlled access.
- `AbstractionDemo.java`: abstract class and method.
- `InterfaceDemo.java`: interface implementation.
- `Calculator.java`: menu-driven arithmetic calculator.
- `BankingSystem.java`: deposit, withdrawal, and balance checking.

## Week 3 — Exception handling, files and threads

- Exception handling: try/catch/finally, multiple catch, throw/throws, and custom exceptions.
- File handling: create, write, read, and append.
- Mini-project: Student Record Manager.
- Multithreading: Thread, Runnable, and task simulation.

## Week 4 — JDBC and MySQL

- `JDBCTest.java`: tests a Java connection to the local `InternshipDB` database using JDBC.
- `Week4_JDBC/InternshipDB.sql`: creates the database and students table and inserts sample records.
- MySQL Connector/J is a local dependency and is intentionally excluded from GitHub. Download it from the [official MySQL Connector/J page](https://dev.mysql.com/downloads/connector/j/) and place the JAR in the local `lib` folder.

### Run the JDBC connection test (Windows PowerShell)

Set the database password in the current terminal session:

```powershell
$env:DB_PASSWORD = Read-Host "Enter MySQL root password"
javac -cp ".;lib\\mysql-connector-j-<version>.jar" JDBCTest.java
java -cp ".;lib\\mysql-connector-j-<version>.jar" JDBCTest
```

Replace `<version>` with the downloaded Connector/J version. Never commit database passwords or other credentials.

## Submission checklist

- [x] Upload Week 1 Java basics and practice source files.
- [x] Upload Week 2 OOP examples and mini-projects.
- [x] Upload Week 3 exception handling, file handling and multithreading exercises.
- [ ] Complete JDBC CRUD operations and Week 4 project.
- [ ] Verify all deliverables against the official internship instructions.

## Author

**K S Shravani**
