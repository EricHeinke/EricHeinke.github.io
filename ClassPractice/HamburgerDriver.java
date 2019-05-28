
public class HamburgerDriver
{
    public static void main(){
        //make one instances(objects) of the Hamburger class
        Hamburger hamburger1 = new Hamburger();
        Hamburger hamburger2 = new Hamburger();
        Hamburger hamburger3 = new Hamburger(true,3,"chedder");
        
        //print the ToString of the object
        System.out.println(hamburger1.toString() + "\n");
        System.out.println(hamburger2 + "\n");
        System.out.println(hamburger3.toString() + "\n");
    }
}