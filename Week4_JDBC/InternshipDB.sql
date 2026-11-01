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
