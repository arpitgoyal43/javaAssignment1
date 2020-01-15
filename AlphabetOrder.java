import java.util.Arrays;
import java.util.Scanner;

class AlphabetOrder {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = in.nextLine();
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		System.out.println(temp);
	}
}