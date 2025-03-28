import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int no = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(no + " * " + i + " = " + (no * i));
        }

        sc.close(); // Good practice to close the Scanner
    }
}

