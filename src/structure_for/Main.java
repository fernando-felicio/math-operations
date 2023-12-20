package structure_for;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int numberTest = scanner.nextInt();
		int oddNumber = 0;
		
		for (int i= 1; i < numberTest; i++) {
			if (i % 2 != 0) {
				oddNumber += 1;
				System.out.println(i);
			}
		}
		
		
		scanner.close();
		

	}

}
