package pack1;

public class cleaningstaff extends staff implements cleaning{
    
        public cleaningstaff(String n, String p) {
            super(n,p);
            
        }
    
        
        public void clean(classroom cl) {
            System.out.println(getname() + " cleaned class number:" + cl.num);
        }
    }


