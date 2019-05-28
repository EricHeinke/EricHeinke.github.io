import java.util.*;

public class Remover
{
    public static void main()
    {
        String name = "Eric";
        int age = 18;
        String[] family = {"Adam","Joel","Jill","Kronos"};
        List<String> myList = new ArrayList<String>();
        myList.add("Cole");
        myList.add("Athul");
        myList.add("Atool");
        System.out.println(name + " is " + age);
        for(String currName: family)
        {
            System.out.println(currName);
        }
        for(String currName: myList)
        {
            System.out.println(currName);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        changer(name,age,family,myList);
        System.out.println(name + " is " + age);
        for(String currName: family)
        {
            System.out.println(currName);
        }
        for(String currName: myList)
        {
            System.out.println(currName);
        }
    }
    public static void changer(String n, int a, String[] f, List<String> m)
    {
        n = "Hammer";
        a = 100;
        for(int i=0; i<f.length; i++)
        {
            f[i] = "Micky Mouse";
        }
        for(int i=0; i<m.size(); i++)
        {
            m.set(i,"Donald Duck");
        }
    }
}
