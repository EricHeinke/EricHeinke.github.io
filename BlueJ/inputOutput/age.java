import javax.swing.JOptionPane; //adds input/output

public class age
{
    public static void main(){
        //ask for age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        if(age >= 90){
            System.out.println("You are too old to drive!");
        }
        else if(age >= 16){
            System.out.println("You can drive!");
        }
        else{
            System.out.println("You can not drive yet!");
            for(int i = 0; i < 10; i++){
                
            }
        }
    }
}
