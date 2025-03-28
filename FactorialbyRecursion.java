import java.util.Scanner;

public class FactorialbyRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial:");
        int no = sc.nextInt();
        
        // Create object and call method
        FactorialbyRecursion obj = new FactorialbyRecursion();
        int result = obj.calcFact(no);
        
        // Print result
        System.out.println("Factorial of " + no + " is: " + result);
        
        sc.close();
    }

    // Recursive method to calculate factorial
    int calcFact(int no) {
        if (no == 0 || no == 1) {
            return 1;
        } else {
            return no * calcFact(no - 1);
        }
    }
}
