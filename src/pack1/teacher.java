package pack1;

import java.util.ArrayList;

public class teacher extends person
    {
        /*
         * constructor
         * add course
         * linkage course/teacher
         * add lvls
         * add exams
         * 
         */
        static int idt=0;
        
        public static ArrayList<teacher>teachers=new ArrayList<>();
        ArrayList<course> crs = new ArrayList<>();
        ArrayList<level> lvls = new ArrayList<>();
        ArrayList<exam>exms= new ArrayList<>();
        public teacher(String n, String p)
        {
            super(++idt,n,p);
            
            teachers.add(this);
        }
        public void addcourse(course c) {
            crs.add(c);
            c.addteacher(this); // Linkage: course/teacher
        }
        public void addlvl(level l) {
            lvls.add(l);
        }
        public void addexam(exam e) {
            exms.add(e);
        }
        public void linkcourse(course c) {
            crs.add(c);
        }
        public void aff() {
            System.out.println("Teacher Information:");
            System.out.println("ID: " + getid());
            System.out.println("Name: " + getname());
            
    
            // Display taught courses
            System.out.println("Taught Courses:");
            for (course c : crs) {
                System.out.println("- " + c.nom);
            }
    
            // Display affiliated levels
            System.out.println("Affiliated Levels:");
            for (level l : lvls) {
                System.out.println("- " + l.filiere + " - " + l.niveau);
            }
    
            // Display conducted exams
            System.out.println("Conducted Exams:");
            for (exam e : exms) {
                System.out.println("- " + e.c.nom + " for " + e.l.filiere + " - " + e.l.niveau);
            }
        }


    }
