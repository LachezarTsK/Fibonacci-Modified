import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
	private static int firstElement;
	private static int secondElement;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		firstElement = scanner.nextInt();
		secondElement = scanner.nextInt();
		int elementToFind = scanner.nextInt();
		scanner.close();

		BigInteger result = fibonacciModified(elementToFind);
		System.out.println(result);
	}

	private static BigInteger fibonacciModified(int elementToFind) {
		BigInteger current = BigInteger.ZERO;
		BigInteger previous = BigInteger.valueOf((long) secondElement);
		BigInteger precedingPrevious = BigInteger.valueOf((long) firstElement);

		for (int i = 3; i <= elementToFind; i++) {
			current = precedingPrevious.add(previous.pow(2));
			precedingPrevious = previous;
			previous = current;
		}
		return current;
	}
}
