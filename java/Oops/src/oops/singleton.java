package oops;
import java.util.Objects;
class singletoninheritancecheck{
    public static void Check(singleton A, singleton B) {
        if(Objects.equals(A , B)){
            System.out.println("Authenticated Singleton Inheritance");}

        else {
            System.out.println("Not Singleton");
        }
    }
}


public class singleton {

	private static singleton instance;
    public String str;
    private singleton()
    {
        str = "Yes it is a Singleton Class";
    }
    public static singleton getInstance()
    {
        if (instance == null)
        {
            instance = new singleton();
        }
        return instance;
    }
    public static void main(String args[])
    {
        singleton text = singleton.getInstance();
        singleton text2 = singleton.getInstance();
        System.out.println(text.str);
        System.out.println(text2.str);
        singletoninheritancecheck.Check(text,text2);
    }
}



