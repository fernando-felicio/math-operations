package structure_for;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int numberTest = scanner.nextInt();
		
		for (int i= 1; i < numberTest; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		scanner.close();
		

	}

}
