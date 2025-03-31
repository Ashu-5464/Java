//Armstrong no 12=

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // You can change this to test other numbers
        int originalNumber = number;
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result = result + (digit * digit * digit);
            number = number / 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
