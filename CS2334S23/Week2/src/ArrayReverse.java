
public class ArrayReverse {

	public static int [] reverse(int[] a)
	{
		int[] b = new int[a.length];

		int j = a.length;

		for (int i = 0; i < a.length; i++) {
			b[j - 1] = a[i];
			j = j - 1;			
		}

		return b;
	}

	public static void main(String[] args)
	{
		int[] A = {1, 2, 3, 4, 5};

		/*printing the array*/
		System.out.println("Original array is:");
		for (int k = 0; k < A.length; k++) {
			System.out.println(A[k]);
		}

		int[] B = reverse(A);

		/*printing the reversed array*/
		System.out.println("Reversed array is:");
		for (int k = 0; k < B.length; k++) {
			System.out.println(B[k]);
		}
	}
}