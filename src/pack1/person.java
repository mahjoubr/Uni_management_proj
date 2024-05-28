package pack1;

public class person {
    private int id;
    private String nom,prenom;
    public person(int i,String n,String p)
    {
        id=i;
        nom=n;
        prenom=p;
    }
    public String getname() {
        return nom;
    }
    public int getid()
    {
        return(id);
    }
}
