import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu: \n1. Addition \n2. Subtraction\n 3. Multiplication\n 4. Division \n 5. Exit\n");
        int choice = 0;
        int a=0,b=0;
        do {
            System.out.println("Enter your choice: ");
            choice = in.nextInt();
            if (choice == 5){
                System.out.println("You have successfully Exited");
                break;
            }
            System.out.println("Enter value of a: ");
            a = in.nextInt();
            System.out.println("Enter value of b: ");
            b = in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Addition of a and b: " + (a+b));
                    break;
                case 2:
                    System.out.println("Subtraction of a and b: " + (a-b));
                    break;
                case 3:
                    System.out.println("Multiplication of a and b: " + (a*b));
                    break;
                case 4:
                    System.out.println("Division of a and b: " + (a/b));
                    break;
                default :
                    System.out.println("Please enter a valid choice!! ");
                    break;
            }
        }while(choice!=5);
    }
}
