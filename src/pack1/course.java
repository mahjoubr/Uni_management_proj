package pack1;

import java.util.ArrayList;

public class course {
 /*
     * constructor
     * add teachers
     * linkage teacher/course
     * add classroom
     * linkage classroom/course
     */
    static ArrayList<course> courses = new ArrayList<>();
    public String nom;
    public ArrayList<teacher>tch=new ArrayList<>();
    public ArrayList<classroom>clsrm=new ArrayList<>();
    public course(String n,teacher t,classroom c)
    {
        nom = n;
        courses.add(this);

        if (t != null) {
            addteacher(t);
        }

        if (c != null) {
            addclassroom(c);
        }
    }
    public void addteacher(teacher t) {
        tch.add(t);
        
    }

    
    public void linkteacher(teacher t) {
        t.linkcourse(this); // Linkage: teacher/course
    }

    
    public void addclassroom(classroom c) {
        clsrm.add(c);
        
    }

    
    public void linkclassroom(classroom c) {
        c.addcourse(this); // Linkage: classroom/course
    }

}
