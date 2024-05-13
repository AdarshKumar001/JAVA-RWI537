// //How to use lambda expression in java(video no8)

// Functional interface for Employee
interface Employee {
    String getName(); // Abstract method to get the name
}

// Main class
public class java8 {
    public static void main(String[] args) {
        System.out.println("Hello Adarsh");

        // Creating an instance of Employee using lambda expression
        Employee se = () -> "Software Engineer";

        // Calling getName() method using the lambda expression
        System.out.println(se.getName());


    }
}

