import javax.swing.JOptionPane; //adds input/output

public class inputOutput
{
    public static void main(){
        //ask for username
        String username = JOptionPane.showInputDialog("Enter your username:");
        if(username.equals("eric")){
            //ask for password
            String password = JOptionPane.showInputDialog("Enter your password:");
            if(password.equals("password")){
                System.out.println("Login Success!");
            }
            else{
                System.out.println("Incorrect password!");
            }
        }
        else{
            System.out.println("Incorrect username!");
        }
    }
}