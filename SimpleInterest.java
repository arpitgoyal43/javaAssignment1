import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        double principle = input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("Enter the time: ");
        int time = input.nextInt();
        double simpleInterest;
        simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
