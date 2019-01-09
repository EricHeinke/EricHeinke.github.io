
public class Hamburger
{
    //this a class called hamburger
    //from this class we can make as many
    //hamburger instances(objects) as we want
    
    //instance veriables
    private boolean hasLettuce;
    private int numPatties;
    private String cheeseType;
    
    //zero-argument constructor
    //this runs every time a zero-type Hamburger is made
    //always is named public className
    public Hamburger(){
        this.hasLettuce = false;    //sets all instance veriables
        this.numPatties = 0;        //to generic values
        this.cheeseType = null;
    }
    
    //multi-arg constructor
    public Hamburger(boolean hasLettuce,int numPatties,String cheeseType){
        this.hasLettuce = hasLettuce; //sets the variables to the argument variables
        this.numPatties = numPatties;
        this.cheeseType = cheeseType;
    }
    
    //toString method
    public String toString(){
        String output = "Has lettuce: " + this.hasLettuce + "\nPatties: "
        + this.numPatties + "\nCheese: " + this.cheeseType;
        return output;
    }
}