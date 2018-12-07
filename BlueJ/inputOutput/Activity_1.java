import javax.swing.JOptionPane; //adds input/output

public class Activity_1
{
    public static void main(){
        //Get user input
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter B:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter C:"));
        
        //B^2
        System.out.println(b*b);
        //4*A&C
        System.out.println(4*a*c);
        //sqrt((B*B)-(4*A*C))
        System.out.println(Math.sqrt((b*b)-(4*a*c)));
        //Root vars  (-B+-sqrt((B*B)-(4*A*C)))/(2*A)
        double root1 = (((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a));
        double root2 = (((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a));
        if(Double.isNaN(root1) || Double.isNaN(root2)){
            System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now…");
        }
        else{
            System.out.println(root1);
            System.out.println(root2);
        }
    }
}