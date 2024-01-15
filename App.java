import pack1.classroom;
import pack1.clubs;
import pack1.course;
import pack1.event;
import pack1.exam;
import pack1.level;
import pack1.staff;
import pack1.student;
import pack1.teacher;
import pack1.cleaningstaff;
import java.io.*;

public class App {
    public static void main(String[] args)  {
         
         level level1 = new level("Computer Science", "First Year");
         level level2 = new level("Computer Science", "Second Year");
 
         
         teacher teacher1 = new teacher("John Doe", "Professor");
         teacher teacher2 = new teacher("Jane Smith", "Associate Professor");
 
         
         course course1 = new course("Introduction to Java", teacher1, null);
         course course2 = new course("Data Structures", teacher2, null);
         course1.addteacher(teacher1);
         course2.addteacher(teacher2);
        
        staff staff1 = new staff("John Smith", "Administrative Staff");
        staff staff2 = new staff("Alice Johnson", "Clerical Staff");
        cleaningstaff cleaner1 = new cleaningstaff("Eva", "Cleaner");
        cleaningstaff cleaner2 = new cleaningstaff("Mike", "Janitor");
         
         classroom classroom1 = new classroom("Lecture Hall");
         classroom classroom2 = new classroom("Lab Room");
         classroom1.addcourse(course1);
         classroom2.addcourse(course2);
 
         
         level level3 = new level("Computer Science", "Third Year");
         student student1 = new student("Alice Doe", "CS Student", level3);
         student student2 = new student("Bob Smith", "CS Student", level1);
         student1.addcourse(course1);
         student2.addcourse( course2);
 
         
         exam exam1 = new exam(teacher1, course1, level1);
         exam exam2 = new exam(teacher2, course2, level2);
         exam1.aff();
         exam2.aff();
         student1.addexam(exam1);
         student2.addexam(exam1);
         student2.addexam(exam2);
 
         
         clubs club1 = new clubs("Programming Club", classroom1);
         clubs club2 = new clubs("Robotics Club", classroom2);
 
         
         event event1 = new event("Java Coding Challenge", "Competition");
         event event2 = new event("Tech Talk", "Informative Event");
 
         
         event1.addorganizer(teacher1);
         event2.addorganizer(teacher2);
         club1.addevent(event1);
         club2.addevent(event2);
 
         // Display club information
         System.out.println("Club: " + club1.nom);
         for (event e : club1.events) {
             System.out.println("Event: " + e.nom);
         }
 
         System.out.println("Club: " + club2.nom);
         for (event e : club2.events) {
             System.out.println("Event: " + e.nom);
         }
          System.out.println("\nStudent Information:");
        for (student s : student.students) {
            s.aff();
            System.out.println("-----------------------");
        }

        // Display information about teachers
        System.out.println("\nTeacher Information:");
        for (teacher t : teacher.teachers) {
            t.aff();
            System.out.println("-----------------------");
        }

        // Display information about staff
        System.out.println("\nStaff Information:");
        for (staff st : staff.staffs) {
            st.aff();
            System.out.println("-----------------------");
        }
    }
    }
    

