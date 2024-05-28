package pack1;

import java.util.ArrayList;

public class clubs {
  /*
     * constructor
     * add event
     * add person
     * 
     */
    public String nom;
    public classroom local;
    ArrayList<person>members=new ArrayList<>();
    public ArrayList<event>events=new ArrayList<>();
    public clubs(String n,classroom c)
    {
        nom=n;
        local=c;
    }
    public void addevent(event e) {
        events.add(e);
        
    }

    
    public void addperson(person p) {
        members.add(p);
    }




}
