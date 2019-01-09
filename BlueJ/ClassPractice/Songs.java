
public class Songs
{
    private String title;
    private String artist;
    private double cost;
    private double rating;
    
    public Songs(){
        this.title=null;
        this.artist=null;
        this.cost=0.0;
        this.rating=0.0;
    }
    
    public Songs(String title, String artist, double cost, double rating){
        this.title=title;
        this.artist=artist;
        this.cost=cost;
        this.rating=rating;
    }
    
    public String toString(){
        String output=this.title+"\nArtist: "
        +this.artist+"\nCost: $"+this.cost+"\nRating: "+this.rating+" Stars\n";
        return output;
    }
}