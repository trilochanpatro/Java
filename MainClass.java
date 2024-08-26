// Import the classes from the mypackage package
import mypackage.ClassOne;
import mypackage.ClassTwo;

// Main class to test the package and its classes
public class MainClass {
    public static void main(String[] args) {
        // Create an instance of ClassOne
        ClassOne obj1 = new ClassOne();
        System.out.println(obj1);
        obj1.printMessage(); // Call the method from ClassOne


        // Create an instance of ClassTwo
        ClassTwo obj2 = new ClassTwo();
        System.out.println(obj2);
        obj2.displayMessage(); // Call the method from ClassTwo
    }
}
