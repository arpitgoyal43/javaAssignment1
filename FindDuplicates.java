import java.util.Scanner;

class FindDuplicate {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = input.nextLine();
        FindDuplicate duplicate1 = new FindDuplicate();
        System.out.println("Duplicate String: ");
        duplicate1.duplicateCharacters(word);
    }

    public void duplicateCharacters(String word) {
        char[] word_array = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word_array[i] == word_array[j]) {
                    System.out.print(word_array[j] + ", ");
                    break;
                }
            }
        }
    }
}	