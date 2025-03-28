import java.util.Scanner;
public class Factorial {
    public static void main(String[] agrs)
    {
        // int no=5;
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find the factorial:");
        int no=sc.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
            System.out.println(fact);
        }
        sc.close();
    }
}
