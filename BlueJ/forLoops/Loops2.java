
public class Loops2
{
    public static void main(){
        //create array length 12
        int[] myArray = new int[12];
        //store some values in array
        myArray[0] = 55;
        myArray[1] = 18;
        myArray[3] = 100;
        myArray[myArray.length-1] = 7;
        //print contents of array
        for(int i=0; i<myArray.length; i++){
            System.out.println("Item " + i + " has a value of " + myArray[i] + ".");
        }
    }
}
