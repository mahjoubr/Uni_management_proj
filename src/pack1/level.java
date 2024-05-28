package pack1;

import java.util.ArrayList;

public class level {
 /*
     * constructor
     */
    static ArrayList<level> lvls = new ArrayList<>();
    public String filiere;
    public String niveau;
    public level(String f,String ni)
    {
        filiere=f;
        niveau=ni;
        lvls.add(this);
    }
}
