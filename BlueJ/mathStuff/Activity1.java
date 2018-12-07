import javax.swing.JOptionPane;

public class Activity1
{
    public static void main(){
        int low = Integer.parseInt(JOptionPane.showInputDialog("Enter a low number:"));
        int high = Integer.parseInt(JOptionPane.showInputDialog("Enter a high number:"));
        int reps = Integer.parseInt(JOptionPane.showInputDialog("Enter how many numbers you want to generate:"));
        int[] numbers = new int[reps];
        int even = 0;
        if(low < high){
            for(int i=0; i<reps; i++){
                numbers[i] = (int)((((Math.random()))*((high-low)+1))+low);
                if(numbers[i]%2 == 0){
                    System.out.println("Item " + i + " is " + numbers[i] + " which is even.");
                    even ++;
                }
                else{
                    System.out.println("Item " + i + " is " + numbers[i] + " which is odd.");
                }
            }
            System.out.println("There are " + even + " even numbers and " + (reps-even) + " odd numbers.");
        }
        else{
            System.out.println("Bad numbers!");
        }
    }
}