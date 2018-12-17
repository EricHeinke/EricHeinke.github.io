import javax.swing.JOptionPane;

public class whileLoops
{
    public static void main(){
        long age = -1;
        String temp = "";
        while(age <= 0 || age > 128){
            temp = JOptionPane.showInputDialog("Enter your age:");
            if(!(temp.length() > 5)){
                age = Long.parseLong(temp);
                if(age <= 0 || age > 128){
                    System.out.println("Invalid age!");
                }
            }
            else{
                age = -1;
            }
        }
        System.out.println("You are " + age + " years old.");
    }
}