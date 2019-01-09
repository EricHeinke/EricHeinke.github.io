
public class Holiday_Driver
{
    public static void main(){
       
       Holiday_Character h1 = new Holiday_Character();
       Holiday_Character h2 = new Holiday_Character("Grinch",false,0);
       Holiday_Character h3 = new Holiday_Character("Santa",true,10000000);
       
       System.out.println(h1.toString());
       System.out.println();
       System.out.println(h2.toString());
       System.out.println();
       System.out.println(h3.toString());
       System.out.println();
       
    }
}