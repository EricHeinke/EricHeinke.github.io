
public class Students
{
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    
    public Students(){
        this.firstName=null;
        this.lastName=null;
        this.age=0;
        this.gpa=0;
    }
    
    public Students(String firstName, String lastName, int age, double gpa){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gpa=gpa;
    }
    
    public String toString(){
        String output=this.lastName+", "+this.firstName+"\nAge: "
        +this.age+"\nGPA: "+this.gpa+"\n";
        return output;
    }
}