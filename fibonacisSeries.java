public class fibonacisSeries {
    public static void main(String[] args)
    {
        int n=10;
        int a=0,b=1;
        System.out.println("Fibnacis Series upto" + n + "is");
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+ "");
            int temp=a+b;
            a=b;
            b=temp;

        }

    }
}
