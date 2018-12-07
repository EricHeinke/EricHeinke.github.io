
public class Loops3
{
    public static void main(){
        //creates an array length 100
        int[] myArray = new int[100];
        //loop that repeats length of array
        for(int i=0; i<myArray.length; i++){
            //store values in array
            myArray[i] = i*5;
        }
        
        //prints out contents of array
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}