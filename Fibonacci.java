import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of element in Fibonacci series: ");
        int count = in.nextInt();
        int sum=0,n1=0,n2=1;
        System.out.println("Fibonacci Series: ");
        for(int i=0;i<count;i++)
        {
            System.out.print(n1+" ");
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
        }

    }
}
