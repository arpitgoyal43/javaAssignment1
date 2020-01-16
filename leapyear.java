import java.util.Scanner;

class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter any Year: ");
        Scanner input = new Scanner(System.in);
        int inputYear = input.nextInt();
        Leapyear leapyear1 = new Leapyear();
        if (leapyear1.isLeapYear(inputYear))
            System.out.println(inputYear + " is a leap Year");
        else
            System.out.println(inputYear + " is not a leap Year");
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            return (year % 100 != 0);
        } else
            return false;
    }
}		
