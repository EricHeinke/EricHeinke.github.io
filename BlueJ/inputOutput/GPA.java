import javax.swing.JOptionPane; //adds input/output

public class GPA
{
    public static void main(){
        //ask for GPA
        float GPA = Float.parseFloat(JOptionPane.showInputDialog("Enter your GPA:"));
        if(GPA >= 5.0 || GPA < 0){
            System.out.println("That is impossible!");
        }
        else if(GPA > 4.0){
            System.out.println("Great job!");
        }
        else{
            System.out.println("Thank you.");
        }
    }
}