public class findOdd1to50add {
    public static void main(String[] args) {
        int sum = 0;

   
        for (int i = 1; i <= 60; i++) {
            if (i % 2 != 0) 
            { 
                sum += i;     
            }
        }

        System.out.println("Sum of odd numbers from 1 to 60 is: " + sum);
    }
}
