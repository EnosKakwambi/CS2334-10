import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExceptionExample
{
	public static int[] createArray(int len) throws MyArrayLenException {
		if(len <= 0) {
			throw new MyArrayLenException("Array length must be non-negative.");
		}
		return new int[len];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;

		do{
			System.out.print("Please enter an int: ");

			String s = br.readLine();
			try
			{
				int length = Integer.parseInt(s);
				//int[] array = new int[length]; 
				createArray(length);
				flag = false;
				System.out.println("Array created successfully.");
			}
			
					
			catch(NumberFormatException e) {
				System.out.println("Integers only! " + e);
				//e.printStackTrace();
			}
			
			catch(MyArrayLenException e){
				System.out.println("Only non-negative integers, please! " + e);

			}
			catch(Exception e){
				System.out.println("Error creating array! " + e);

			}
			
			
		} while(flag);

	}
}
