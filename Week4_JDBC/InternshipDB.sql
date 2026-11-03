CREATE DATABASE IF NOT EXISTS InternshipDB;
USE InternshipDB;

CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    roll_no VARCHAR(30) UNIQUE,
    course VARCHAR(50),
    marks INT
);

INSERT INTO students (name, roll_no, course, marks)
VALUES
    ('Ananya', 'CSE001', 'Computer Science', 85),
    ('Rahul', 'CSE002', 'Computer Science', 92),
    ('Priya', 'CSE003', 'Computer Science', 78),
    ('Arjun', 'CSE004', 'Computer Science', 88),
    ('Sneha', 'CSE005', 'Computer Science', 95);

-- Library table used by LibraryManagement.java
CREATE TABLE IF NOT EXISTS books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    author VARCHAR(120) NOT NULL
);

INSERT INTO books (title, author)
SELECT 'Effective Java', 'Joshua Bloch'
WHERE NOT EXISTS (
    SELECT 1 FROM books
    WHERE title = 'Effective Java' AND author = 'Joshua Bloch'
);
