//Define an Employee class with suitable attributes having getSalary() method, which returns salary
//withdrawn by a particular employee. Write a class Manager which extends a class Employee,
//override the getSalary() method, which will return salary of manager by adding traveling
//_allowance, house rent allowance etc. Use default and parameterized constructors to initialize
//data.

// Base class Employee
class Employee {
    // Attributes
    private String name;
    private int employeeId;
    private double basicSalary;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.employeeId = 0;
        this.basicSalary = 0.0;
    }

    // Parameterized constructor
    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    // Method to return the basic salary of the employee
    public double getSalary() {
        return basicSalary;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Derived class Manager that extends Employee
class Manager extends Employee {
    // Additional attributes for Manager
    private double travelAllowance;
    private double houseRentAllowance;
    private double specialAllowance;

    // Default constructor
    public Manager() {
        super(); // Calls the default constructor of Employee
        this.travelAllowance = 0.0;
        this.houseRentAllowance = 0.0;
        this.specialAllowance = 0.0;
    }

    // Parameterized constructor
    public Manager(String name, int employeeId, double basicSalary, double travelAllowance, double houseRentAllowance, double specialAllowance) {
        super(name, employeeId, basicSalary); // Calls the parameterized constructor of Employee
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
        this.specialAllowance = specialAllowance;
    }

    // Override getSalary method to include allowances
    @Override
    public double getSalary() {
        return super.getSalary() + travelAllowance + houseRentAllowance + specialAllowance;
    }

    // Display manager details
    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Travel Allowance: " + travelAllowance);
        System.out.println("House Rent Allowance: " + houseRentAllowance);
        System.out.println("Special Allowance: " + specialAllowance);
        System.out.println("Total Salary: " + getSalary());
    }
}

// Main class to test the Employee and Manager classes
public class Q14 {
    public static void main(String[] args) {
        // Create an Employee object using the parameterized constructor
        Employee employee = new Employee("Alice", 101, 50000);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
        System.out.println("Salary: " + employee.getSalary());

        // Create a Manager object using the parameterized constructor
        Manager manager = new Manager("Bob", 102, 70000, 10000, 15000, 5000);
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}
