import javax.swing.JOptionPane;

public class P1D_Square_Range
{
    public static void main(){
        //print out an index, index squared, and a random number between them
        int ran = 0;
        for(int i=0; i<10; i++){
            //generates a random number
            ran = random(i,(i*i));
            //prints the random number
            System.out.print(i + "\t" + i*i + "\t" + ran);
            //says if the random number is equal to the index or index squared
            if(ran == i){
                System.out.println("\tThe random number is equal to the index.");
            }
            else if(ran == (i*i)){
                System.out.println("\tThe random number is ewual to the index squared.");
            }
            else{
                System.out.println();
            }
        }
        
        //prints out three faverite movies
        System.out.print("\n");
        String[] movies = {"Harry Potter", "Lord of the Rings", "Star Wars"};
        for(int i=0; i<movies.length; i++){
            System.out.println(movies[i]);
        }
        //blank space
        System.out.print("\n\n");
        //prints out three faverite songs
        String[] songs = {"strawberry fields forever", "yellow submarine", "hotel california"};
        int index = 0;
        while(index < songs.length){
            index++;
            if(index == songs.length){
                System.out.print(songs[index-1] + ".");
            }
            else{
                System.out.print(songs[index-1] + ", ");
            }
        }
    }
    
    //generates random number between low and high numbers
    public static int random(int low, int high){
        return (int)((Math.random()*(high-low+1))+low);
    }
}
//JOptionPane.showInputDialog("")