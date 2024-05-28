package pack1;
import java.util.ArrayList;

public class staff extends person{
    public static ArrayList<staff>staffs=new ArrayList<>();   
    static int idst=0;
    public staff(String n,String p)
    {
        super(++idst,n,p);
        staffs.add(this);
    }
    public void aff() {
        System.out.println("Staff Information:");
        System.out.println("ID: " + getid());
        System.out.println("Name: " + getname());
        
    }

}
