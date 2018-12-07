import javax.swing.JOptionPane;

public class WhereIsMJ
{
    public static void main(){
        //user must loggin to procede
        //login check
        String school = "";
        String mascot = "";
        while(!(school.toUpperCase().equals("GRANADA") && mascot.toUpperCase().equals("MATADORS"))){
            school = JOptionPane.showInputDialog("What is your school?");
            if(school.toUpperCase().equals("GRANADA")){
                mascot = JOptionPane.showInputDialog("What is your mascot?");
                if(!(mascot.toUpperCase().equals("MATADORES"))){
                    System.out.println("The mascot is wrong!");
                }
            }
            else{
                System.out.println("The school is wrong!");
            }
        }
        System.out.println("Login Success!");
        
        //print out list of song artists and say if they are "Michael Jackson"
        String[] artists = {"Rick Astley","Mozart",null,"Michael Jackson","The Beatles"};
        for(int i=0; i<artists.length; i++){
            if(artists[i] == null){
                System.out.println("Item " + i + " is empty\n(null).\n");
            }
            else if(artists[i].toUpperCase().equals("MICHAEL JACKSON")){
                System.out.println("Item " + i + " is Michael Jackson!\n\tWe found him!\n");
            }
            else{
                System.out.println("Item " + i + " is not Michael Jackson.\nIt is " + artists[i] + ".\n");
            }
        }
        
        //check if users faverate artist is the same as yours
        if(JOptionPane.showInputDialog("What is your faverate musical artist?").toUpperCase().equals("BEATLES")){
            System.out.println("We have the same taste in music!");
        }
        else{
             System.out.println("We do not have the same favorite artist.");
        }
    }
}