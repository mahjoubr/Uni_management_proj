package pack1;

import java.util.ArrayList;

public class exam {
/*
     * constructor
     * 
     */
    static ArrayList<exam>exams= new ArrayList<>();
    public teacher t;
    public course c;
    public level l;
    public exam(teacher tt,course cc,level ll)
    {
        t=tt;
        c=cc;
        l=ll;
        exams.add(this);
        tt.addexam(this);
        
    }
    public void aff() {
        System.out.println("exam Information:");
        System.out.println("Teacher: " + t.getname());
        System.out.println("Course: " + c.nom);
        System.out.println("Level: " + l.filiere + " - " + l.niveau);
    }
}
