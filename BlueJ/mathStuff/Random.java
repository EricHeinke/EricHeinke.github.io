
public class Random
{
    public static void main(){
        //Cast a random number to an intager
        for(int i=0; i<100; i++){
            double age = (int)((Math.random()*8)+367);
            System.out.println("The number is " + age + "!");
        }
    }
}