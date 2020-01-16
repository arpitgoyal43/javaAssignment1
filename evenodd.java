import java.util.Scanner;

class Evenodd {
    public static void main(String[] args) {
        System.out.println("Enter any Number: ");
        Scanner input = new Scanner(System.in);
        try {
            int checknumber = input.nextInt();
            if (checknumber % 2 == 0)
                System.out.println(checknumber + " is an Even number");
            else
                System.out.println(checknumber + " is an Odd number");
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
        }
    }
}