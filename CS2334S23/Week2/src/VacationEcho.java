
import java.util.Scanner;

public class VacationEcho {
	public static void main(String[] args) {
		String line;
		Scanner in = new Scanner(System.in);

		System.out.print("What is your favorite vacation place? \n");
		line = in.nextLine();
		System.out.println("You answered: " + line);
	}
}
