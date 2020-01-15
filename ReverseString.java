import java.util.Scanner;

public class ReverseString {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = in.nextLine();
        String[] words = str.split(" ");
        String result = "";
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            String reverseWord = "";
            for(int j = word.length()-1;j>=0;j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            result = result + reverseWord + " ";
        }
        System.out.println("Reverse Words in String: "+ result);

    }
}
