package pack1;

import java.util.ArrayList;

public class classroom {
/*
     * constructor
     * add courses
     * linkage course/classroom
     */
    static ArrayList<classroom> classrooms=new ArrayList<>();
    static int number=0;
    public int num;
    public String type;
    ArrayList<course> crs = new ArrayList<>();
    public classroom(String clstype)
    {
        type=clstype;
        num=++number;
        classrooms.add(this);


    }
    public void addcourse(course c) {
        crs.add(c);
        
    }

    
    public void linkcourse(course c) {
        c.linkclassroom(this); // Linkage: course/classroom
    }

    
}
