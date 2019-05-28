
public class Holiday_Character
{
    private String name;
    private boolean hasCheer;
    private long internetSpeed;
    
    public Holiday_Character(){
        this.name = null;
        this.hasCheer = false;
        this.internetSpeed = 0;
    }
    
    public Holiday_Character(String name, boolean hasCheer, long internetSpeed){
        this.name = name;
        this.hasCheer = hasCheer;
        this.internetSpeed = internetSpeed;
    }
    
    public String toString(){
        String output = "Name: "+this.name+"\nHas Xmas Cheer: "+this.hasCheer+"\nInternet speed: "
        +this.internetSpeed;
        return output;
    }
}