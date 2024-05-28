package pack1;

import java.util.ArrayList;

public class student extends person {
  /*constructor
     * add course
     * add exam
     */
    public static ArrayList<student>students=new ArrayList<>();
    static int ids=0;

    private level lvl;

    public ArrayList<course>cattended=new ArrayList<>();
    public ArrayList<exam>exmpassed=new ArrayList<>();
    public student(String n,String p,level l)
    {
        super(++ids,n,p);
        
        lvl=l;
        students.add(this);

    }
    public void addcourse(course c) {
        cattended.add(c);
    }

    // Method to add an exam
    public void addexam(exam e) {
        exmpassed.add(e);
    }
    public void aff() {
        System.out.println("Student Information:");
        System.out.println("ID: " + getid());
        System.out.println("Name: " + getname());
        System.out.println("Level: " + lvl.filiere + " - " + lvl.niveau);

        // Display enrolled courses
        System.out.println("Enrolled Courses:");
        for (course c : cattended) {
            System.out.println("- " + c.nom);
        }

        // Display passed exams
        System.out.println("Passed Exams:");
        for (exam e : exmpassed) {
            System.out.println("- " + e.c.nom + " by " + e.t.getname());
        }
    }



}
