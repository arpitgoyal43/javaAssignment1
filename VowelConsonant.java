import java.util.Scanner;

class VowelConsonant {
    public static void main(String args[]) {
        System.out.println("Enter any Character: ");
        Scanner input = new Scanner(System.in);
        char checkCharacter = input.next().charAt(0);
        switch (checkCharacter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'I':
            case 'E':
            case 'O':
            case 'U':
                System.out.println(checkCharacter + ": is a vowel");
                break;
            default:
                System.out.println(checkCharacter + ": is a consonant");
                break;
        }
    }
}