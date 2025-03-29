public class SwitchCalculator {
    public static void main(String[] args)
    {   
        int a=10,b=20;
        char ch='+';
        switch(ch)
        {
            case '+':
            System.out.println("Display Addition" +(a+b));
            break;
            case '-':
            System.out.println("Display Substraction:" +(a-b));
            break;
            case '*':
            System.out.println("Display Multiplication:"+(a*b));
            break;
            case '/':
            System.out.println("Display Division" +(a/b));
            break;
        }
    }
}
