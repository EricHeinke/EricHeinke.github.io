import javax.swing.JOptionPane;

public class P1E_Greatest_of_All_Time
{
    public static void main(){
        int reps = 0;
        while(reps < 10 || reps > 20){
            reps = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 10 and 20"));
        }
        int[] intArray = new int[reps];
        for(int i=0; i<reps; i++){
            intArray[i] = random(1,100);
        }
        int low = 100;
        int high = 0;
        for(int i=0; i<reps; i++){
            System.out.println(intArray[i]);
            if(intArray[i] < low){
                low = intArray[i];
            }
            if(intArray[i] > high){
                high = intArray[i];
            }
        }
        System.out.println("Low: " + low + "\nHigh: " + high);
    }
    public static int random(int low, int high){
        return (int)((Math.random()*(high-low+1))+low);
    }
}
//JOptionPane.showInputDialog("")