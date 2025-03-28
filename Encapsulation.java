// Class demonstrating Encapsulation
public class Encapsulation {
   
    private int x;

    
    public int getX() {
        return x;
    }
 
    public void setX(int x) {
        this.x = x;
    }

    // Main method to test Encapsulation
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation(); // Creating an object
        obj.setX(10);  // Setting value using setter
        System.out.println("Value of x: " + obj.getX()); // Getting value using getter
    }
}
