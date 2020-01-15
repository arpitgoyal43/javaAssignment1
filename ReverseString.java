import java.util.*;

public class ReverseString {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = in.nextLine();
        String[] temp = str.split(" ");
        String result = "";
        for(int i=0;i<temp.length;i++)
        {
            String word = temp[i];
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
