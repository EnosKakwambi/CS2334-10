import java.io.IOException;

public class Sort {
	public static int[] insertionSort(int[] arr)
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;			
			
			// just to pause after every iteration
			try {
				System.in.read();
			} catch (IOException e) {
			}			
			
			printArray(arr);
			
		}
		return arr;
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 6, 5, 3, 1, 8, 7, 2, 4 };		
		printArray(arr);		
		arr = insertionSort(arr);
		// printArray(arr);
	}
}