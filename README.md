# University Management System

This Java project is a simple university management system that allows you to manage courses, teachers, classrooms, students, exams, and clubs.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder .


## Features

- Create and manage courses, teachers, and classrooms.
- Enroll students in courses and assign exams to courses.
- Manage clubs, events, and event organizers.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse

### Usage
The university.java file contains a main method where various elements of the university system are created and manipulated. Feel free to explore and modify this file to suit your needs.

## Classes
1. Classroom
Represents a classroom where courses take place. Classrooms can be linked to courses.

2. Clubs
Represents university clubs, where events are organized. Clubs can have members and hold events.

3. Course
Represents a university course. Courses can have teachers and be linked to classrooms.

4. Event
Represents an event organized by a club. Events can have organizers and be linked to clubs.

5. Exam
Represents an exam associated with a specific teacher,students, course, and level.

6. Level
Represents the academic level or year, categorized by field and level.

7. Person
Represents a generic person with an ID, name, and surname.

8. Staff
Represents a staff member of the university.

9. Student
Represents a student enrolled in the university. Students can attend courses and take exams.

10. Teacher
Represents a teacher at the university. Teachers can teach courses, be linked to courses, and have associated levels and exams.


### Acknowledgments

- this project was created by Refka Mahjoub GL2.
