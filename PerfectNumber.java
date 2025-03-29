public class PerfectNumber {
    public static void main(String[] args)
    {
        int sum=0;
        int number=6;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                sum=sum+i;
            }
            
        }
        if(sum==number)
        {
            System.out.println("This number is perfect numbar");
        }
        else{
            System.out.println("This number is not perfect number");
        }
    }
}
