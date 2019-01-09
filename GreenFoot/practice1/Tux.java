import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tux extends Actor
{
    private String name;
    private int speed;
    
    public Tux(){
        this.name = null;
        this.speed = 1;
    }
    
    public Tux(String name,int speed){
        this.name = name;
        this.speed = speed;
    }
    
    public void act() 
    {
        move(this.speed);
        if(isAtEdge()){
            turn(random(1,90));
        }
        getWorld().showText(toString(), getWorld().getWidth()/2, getWorld().getHeight()/2);
    }
    
    public String toString(){
        String output = "Name: " + this.name + "\nSpeed: " + this.speed + 
        "\nX: " + getX() + "\nY: " + getY();
        return output;
    }
    
    public static int random(int low, int high){
        return (int)((Math.random()*(high-low+1))+low);
    }
}
