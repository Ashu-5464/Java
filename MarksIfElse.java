public class MarksIfElse {
    public static void main(String[] args)
    {
        int marks=67;
        if(marks>70)
        {
            System.out.println("Passing Grade with A+");
         }
         else if(marks>=60 && marks<=69)
         {
            System.out.println("Passing with Grate A");
         }
         else if(marks>=50 && marks<=59)
         {
            System.out.println("Passing with Grate B");
         }
         else if(marks>=40 && marks<=49)
         {
            System.out.println("Passing with Crate c");
         }
         else if(marks<=40)
         {
            System.out.println("Fail.....");
         }
    }
}
