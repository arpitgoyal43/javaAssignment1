import java.util.Scanner;
import java.util.stream.IntStream;

class AlphabetOrder {
	public static void main(String args[]) {
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter no. of strings: ");
		int count = in1.nextInt();

		System.out.println("Enter any string: ");
		String[] str = new String[count];
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter the strings to be sorted in a sequence: ");
		for (int i = 0; i <count; i++) {
			str[i] = in2.nextLine();
		}
		String temp;
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("Sorted strings in alphabetical order: ");
		for(int i=0;i<count;i++)
		{
			System.out.print(str[i]+ " ");
		}
	}
}