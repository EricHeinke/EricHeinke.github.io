
public class Songs_and_Students_Driver
{
    public static void main(){
        Songs song0 = new Songs();
        Songs song1 = new Songs("Strawberry Fields Forever","Beatles",10.0,5.0);
        Students student0 = new Students();
        Students student1 = new Students("John","Smith",909,5.0);
        
        System.out.println(song0.toString());
        System.out.println(song1.toString());
        System.out.println(student0.toString());
        System.out.println(student1.toString());
    }
}