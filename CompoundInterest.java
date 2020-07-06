import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal investment amount (the initial deposit or loan amount): ");
        double principle = input.nextDouble();
        System.out.println("Enter the annual interest rate (decimal): ");
        float rate = input.nextFloat();
        System.out.println("Enter the time: ");
        int time = input.nextInt();
        System.out.println("Enter the number of times that interest is compounded per unit time: ");
        int n = input.nextInt();

        //Formula: Amount = p(1+r/n)^nt
        double amount = principle * (Math.pow((1 + rate / (100 * n)), (time * n)));
        System.out.println("Compound Interest : " + amount);
    }
}


