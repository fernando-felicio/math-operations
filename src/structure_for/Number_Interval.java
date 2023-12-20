package structure_for;
import java.util.Scanner;

public class Number_Interval {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("RANGE FROM ===10 to 20===%n"
				+ "How many numbers will be analyzed?%n");
		
		int qtyNumbers = scanner.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < qtyNumbers; i++) {
			
			int testNumbers = scanner.nextInt();
			
			if (testNumbers >= 10 && testNumbers <=20) {
				in += 1;
			}
			else {
				out += 1;
			}			
		}
		
		System.out.printf("Numbers within the range: %d%n"
				+ "Numbers out of range: %d%n", in, out);
		
		scanner.close();		
		
	}

}
