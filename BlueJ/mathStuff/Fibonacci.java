import javax.swing.JOptionPane;

public class Fibonacci
{
    public static void main(){
        //asks for number of repititions
        int reps = Integer.parseInt(JOptionPane.showInputDialog("How many Fibonacci numbers do you want"));
        //initalizes variables
        long[] fibs = new long[reps];
        long[] total = new long[reps];
        long fibOld = 0;
        long fibNew = 1;
        long temp = 0;
        //generates values for arrays
        for(int i=0; i<reps; i++){
            //generate sequence
            fibs[i] = fibOld;
            temp = fibOld;
            fibOld = fibNew;
            fibNew = fibNew + temp;
            //add to total
            total[i] = temp + fibOld-1;
        }
        //display arrays
        System.out.println("Index\t\tFib. #\t\tRunning Total");
        for(int i=0; i<reps; i++){
            System.out.println(i + "\t\t" + fibs[i] + "\t\t" + total[i]);
        }
    }
}
