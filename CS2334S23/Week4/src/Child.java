
public class Child extends Parent
{
    public int data; // Try deleting this line

    public Child(int data)
    {
        //super(data);
        this.data = 5;
        //this.data = data;
    }

    public String toString()
    {
        return "Child: " + this.data + " " + super.toString();
    }
}
