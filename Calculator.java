import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: \n1. Addition \n2. Subtraction\n3. Multiplication\n4. Division \n5. Exit\n");
        int choice = 0;
        int first_number = 0, second_number = 0;
        do {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 5) {
                System.out.println("You have successfully Exited");
                break;
            }
            System.out.println("Enter the first value: ");
            first_number = input.nextInt();
            System.out.println("Enter the second value: ");
            second_number = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Addition of first value and second value: " + (first_number + second_number));
                    break;
                case 2:
                    System.out.println("Subtraction of first value and second value: " + (first_number - second_number));
                    break;
                case 3:
                    System.out.println("Multiplication of first value and second value: " + (first_number * second_number));
                    break;
                case 4:
                    if (second_number != 0)
                        System.out.println("Division of first value and second value: " + (first_number / second_number));
                    else
                        System.out.println("Can't divisible by zero!");
                    break;
                default:
                    System.out.println("Please enter a valid choice!! ");
                    break;
            }
        } while (choice != 5);
    }
}
