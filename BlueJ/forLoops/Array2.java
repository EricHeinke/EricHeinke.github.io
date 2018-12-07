
public class Array2
{
    public static void main(){
        //create name and age array
        String[] names = {"Eric","Cole","Athul"};
        int[] ages = {18,18,16};
        
        //Display all entries
        for(int i=0; i<names.length; i++){
            System.out.println(names[i] + " is " + ages[i] + ".");
        }
    }
}