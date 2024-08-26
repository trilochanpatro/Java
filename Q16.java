//Write a program to demonstrate the multiple inheritance using interfaces.

// Define the first interface with a method display()
interface Displayable {
    void display();
}

// Define the second interface with a method show()
interface Showable {
    void show();
}

// A class that implements both Displayable and Showable interfaces
class MultipleInheritanceDemo implements Displayable, Showable {

    // Implement the display() method from Displayable interface
    @Override
    public void display() {
        System.out.println("Display method from Displayable interface");
    }

    // Implement the show() method from Showable interface
    @Override
    public void show() {
        System.out.println("Show method from Showable interface");
    }
}

// Main class to test multiple inheritance using interfaces
public class Q16 {
    public static void main(String[] args) {
        // Create an instance of MultipleInheritanceDemo
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();

        // Call methods from both interfaces
        obj.display();
        obj.show();
    }
}
