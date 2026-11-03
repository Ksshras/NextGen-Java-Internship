# Week 4 – JDBC and MySQL

This module practices connecting Java applications to MySQL using JDBC.

## Prerequisites
- Java JDK 8 or later
- MySQL Server
- MySQL Connector/J (keep the JAR locally; do not commit it)

## Setup
1. Run `InternshipDB.sql` in MySQL Workbench or the MySQL CLI.
2. Update the database username and password in `LibraryManagement.java`.
3. Add MySQL Connector/J to the classpath.
4. Compile and run:

```powershell
javac -cp ".;lib/mysql-connector-j-<version>.jar" Week4_JDBC/LibraryManagement.java
java -cp ".;lib/mysql-connector-j-<version>.jar;Week4_JDBC" LibraryManagement
```

For macOS/Linux, replace classpath semicolons with colons.

## Concepts
- JDBC DriverManager and Connection
- PreparedStatement
- SELECT, INSERT and DELETE
- try-with-resources for reliable cleanup

**Security:** Use your own local MySQL credentials. Never commit real passwords.
