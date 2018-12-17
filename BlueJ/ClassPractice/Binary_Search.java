import javax.swing.JOptionPane;

public class Binary_Search
{
    //try 1  Broken
    public static void main1(){
        //creates list of numbers
        int[] list = {1,4,7,9,10,27,30};
        //sets target number
        int target = 7;
        int reps = (list.length/2);
        for(int i=0; i<reps; i++){//broken
            int a = list[(list.length/2)];
            if(list[a] == target){
                System.out.println("Number " + target + " was found at " + a + ".");
                break;
            }
            else if(list[a] < target){
                list = remove_list_start(list);
            }
            else{
                list = remove_list_end(list);
            }
        }
    }
    private static int[] remove_list_start(int[] list){
        for(int a=0; a<(list.length/2); a++){
            int tar = list[0];
            for(int i = 0; i < list.length; i++){
                if(list[i] == tar){
                    // shifting elements
                    for(int j = i; j < list.length - 1; j++){
                        list[j] = list[j+1];
                    }
                    break;
                }
            }
        }
        return list;
    }
    private static int[] remove_list_end(int[] list){
        for(int a=0; a<(list.length/2); a++){
            int tar = list[list.length-1];
            for(int i = 0; i < list.length; i++){
                if(list[i] == tar){
                    // shifting elements
                    for(int j = i; j < list.length - 1; j++){
                        list[j] = list[j+1];
                    }
                    break;
                }
            }
        }
        return list;
    }
    
    
    //try 2
    public static void main2(){
        //creates list of numbers
        int[] list = {1,4,7,9,10,27,30};
        //sets target number
        int target = 7;
        int reps = (list.length);//does not repeat entire list length
        for(int i=0; i<reps; i++){//broken
            int a = list[(list.length/2)];
            if(list[a] == target){
                System.out.println("Number " + target + " was found at " + a + ".");
                break;
            }
            else if(list[a] < target){
                System.out.println("Remove start of list");
            }
            else{
                System.out.println("Remove end of list");
            }
        }
    }
}
//JOptionPane.showInputDialog("")