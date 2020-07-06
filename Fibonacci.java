import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of element in Fibonacci series: ");
        int count = input.nextInt();
        System.out.println("Fibonacci Series: ");
        fibonacciSeries(count);
    }

    static void fibonacciSeries(int n) {
        int sum, element1 = 0, element2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(element1 + " ");
            sum = element1 + element2;
            element1 = element2;
            element2 = sum;
        }
    }
}
