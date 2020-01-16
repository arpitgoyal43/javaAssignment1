import java.util.Scanner;

class BinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first binay no.: ");
        int binary_num1 = input.nextInt();
        System.out.println("Enter second binay no.: ");
        int binary_num2 = input.nextInt();
        boolean isBinary = true;
        int testBinarynumber1 = binary_num1, tesBinarynumber2 = binary_num2;
        while (testBinarynumber1 != 0 && tesBinarynumber2 != 0) {
            int remBinarynumber1 = testBinarynumber1 % 10, remBinarynumber2 = tesBinarynumber2 % 10;
            if (remBinarynumber1 > 2 || remBinarynumber2 > 2) {
                isBinary = false;
                break;
            } else {
                testBinarynumber1 /= 10;
                tesBinarynumber2 /= 10;
            }
        }
        if (isBinary)
            sumOfBinary(binary_num1, binary_num2);
        else
            System.out.println("Please enter a valid binary number!!");
    }

    static void sumOfBinary(int binary_num1, int binary_num2) {
        int carry = 0, i = 0;
        int[] sum = new int[20];
        while (binary_num1 != 0 || binary_num2 != 0) {
            sum[i++] = ((binary_num1 % 10 + binary_num2 % 10 + carry) % 2);
            carry = ((binary_num1 % 10 + binary_num2 % 10 + carry) / 2);
            binary_num1 = binary_num1 / 10;
            binary_num2 = binary_num2 / 10;
        }
        if (carry != 0)
            sum[i++] = carry;
        System.out.println("Addition of two Binary number: ");
        --i;
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
    }
}	



