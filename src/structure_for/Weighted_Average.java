package structure_for;
import java.util.Scanner;
import java.util.Locale;


public class Weighted_Average {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the number of cases: ");
		int qtyCases = scanner.nextInt();
		
		for (int i = 0; i < qtyCases; i++) {
			
			Double a = scanner.nextDouble();
			Double b = scanner.nextDouble();
			Double c = scanner.nextDouble();
			
			Double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		
		scanner.close();

	}

}
