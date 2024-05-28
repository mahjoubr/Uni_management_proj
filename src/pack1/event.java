package pack1;

import java.util.ArrayList;

public class event {
 ArrayList<person>organizers=new ArrayList<>();
    ArrayList<clubs>holders=new ArrayList<>();
    public String nom;
    public String type;/*competition/informative event/ctf... */

    public event(String n, String t) {
        nom = n;
        type = t;
    }

    
    public void addorganizer(person organizer) {
        organizers.add(organizer);
    }

    
    public void addholder(clubs holder) {
        holders.add(holder);
        holder.addevent(this); 
    }
}
