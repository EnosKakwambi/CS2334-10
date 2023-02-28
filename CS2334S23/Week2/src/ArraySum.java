
import java.util.Arrays;

public class ArraySum {
	public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5};
        
        //int sum = Arrays.stream(A).sum();
        
        int sum = 0;
        
        for (int value : A) {
            sum += value;
        }
 
        System.out.println("The sum of all the array elements is " + sum + ".");
    }
}
