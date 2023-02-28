
public class Person
{
    private String firstName;
    private String lastName;
    
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }
    
    public Person()
    {
        this("First", "Last");
        
    }
    
    public String toString()
    {
    	return (this.firstName + " " + this.lastName);
    }
    
}
