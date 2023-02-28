import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver
{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
    	Person instructor = new Person("Anindya", "Maiti");
    	Course CS2334 = new Course(2334, instructor, "studentlist.csv");
    	//Course CS2334 = new Course();
		
		CS2334.printCourseDetails();
    	
    }
}
