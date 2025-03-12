//Q-1) Exception CASE-1: Problem without exception handling
import java.util.*;

public class Exception_handling{
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of a and b.");
        int a=obj.nextInt();
        int b=obj.nextInt();

        int c=a/b;
        System.out.println("Divisor Result : "+c);
    }
}

//Q-2) Exception CASE-2: Exception creates but properly handled

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling{
    public static void main(String [] args){
        try{
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter a Integer number.");
            int integer=obj.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid Input given!");
        }
    }
}

////Q-3) Exception CASE-3: Exception creates but not handled

import java.util.Scanner;

public class Exception_handling{
    public static void main(String a[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an integer.");
        int integer=scanner.nextInt();
        System.out.println("It is an Integer.");
    }
}

//Q-4) Write a java program to implement Java Multi catch block.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_handling{
    public static void main(String []args){
        System.out.println("Enter the values of a and b.");
        try{
            InputStreamReader obj=new InputStreamReader(System.in);
            BufferedReader obj1=new BufferedReader(obj);

            int num1=Integer.parseInt(obj1.readLine());
            int num2=Integer.parseInt(obj1.readLine());

            int div=num1/num2;
            System.out.println("The Divisor result is : "+div);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Please enter valid integers.");
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(IOException e){
            System.out.println("Error: Input/output exception occurred.");
        }
    }
}

//Q-5) Write a java program to implement Java Nested try statement.

public class Exception_handling{
    public static void main(String [] args){
        try{
            System.out.println("Outer try block executed.");
            int Outterresult=10/2;
            System.out.println("Result is :"+Outterresult);
            try{
                System.out.println("Inner try block started.");
                int [] array={23,45,56};
                System.out.println(array[5]);
                int innerResult = 10 / 0;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caught in inner try block: " + e);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught in outer try block: " + e);
        }
    }
}

////Q-6) Write a java program to implement the throw keyword.

import java.util.Scanner;

public class Exception_handling {
    // Method to validate age for voting
    static void validateAge(int age) {
        if (age < 18) {
            // Explicitly throwing an exception
            throw new IllegalArgumentException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Calling the method that might throw an exception
            validateAge(age);
        } catch (IllegalArgumentException e) {
            // Catching and handling the thrown exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
        scanner.close();
    }
}

////Q-7) Write a java program to implement the throws keyword.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_handling {

    // Method that declares it might throw an IOException
    static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = reader.readLine(); // May throw IOException
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        try {
            // Calling a method that might throw an exception
            readData();
        } catch (IOException e) {
            // Handling the exception
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}

//Q-8) Finally
// CASE – 1 : Case 1: finally example where exception doesn't occur.
//Case 2: finally example where exception occurs and not handled.
// Case 3: finally example where exception occurs and handled.

public class Exception_handling{

    // Case 1: finally executes when no exception occurs
    static void case1() {
        try {
            System.out.println("Case 1: No exception occurs.");
            int result = 10 / 2;  // No exception
            System.out.println("Result: " + result);
        } finally {
            System.out.println("Finally block executed (Case 1).");
        }
    }

    // Case 2: finally executes even if an exception occurs and is NOT handled
    static void case2() {
        try {
            System.out.println("\nCase 2: Exception occurs and is NOT handled.");
            int result = 10 / 0;  // This will cause ArithmeticException
            System.out.println("Result: " + result); // This line will not execute
        } finally {
            System.out.println("Finally block executed (Case 2).");
        }
        // The program will terminate due to the unhandled exception
    }

    // Case 3: finally executes even when an exception occurs and is handled
    static void case3() {
        try {
            System.out.println("\nCase 3: Exception occurs and is handled.");
            int result = 10 / 0;  // This will cause ArithmeticException
            System.out.println("Result: " + result); // This line will not execute
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (Case 3).");
        }
        System.out.println("Program continues after handling exception.");
    }

    public static void main(String[] args) {
        case1();
        try {
            case2(); // This will cause an unhandled exception, stopping execution
        } catch (Exception e) {
            System.out.println("Main method caught exception: " + e.getMessage());
        }
        case3();
    }
}

//9. Create a user-defined exception named CheckArgument to check the number of arguments
//passed through the command line. If the number of argument is less than 5, throw the
//CheckArgumentexception,else print the addition of all the five numbers.

// Custom exception class
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class Exception_handling {
    public static void main(String[] args) {
        try {
            // Check if the number of arguments is less than 5
            if (args.length < 5) {
                throw new CheckArgumentException("Error: At least 5 arguments are required.");
            }

            // Parse arguments and calculate sum
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            // Print the sum
            System.out.println("Sum of the first 5 numbers: " + sum);

        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter only numeric values.");
        }
    }
}

//10. Consider a Student examination database system that prints the mark sheet of students. Input
//the following from the command line.
//        (a) Student’s Name
//        (b) Marks in six subjects These marks should be between 0 to 50. If the marks are not in the specified
//range, raise a RangeException, else find the total marks and prints the percentage of the students.

//// Custom exception class for invalid marks range
class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

public class Exception_handling {
    public static void main(String[] args) {
        try {
            // Check if at least 7 arguments are provided (1 name + 6 marks)
            if (args.length < 7) {
                throw new IllegalArgumentException("Error: Please provide Student Name and 6 subject marks.");
            }

            // Student's Name (First argument)
            String studentName = args[0];

            int totalMarks = 0;

            // Loop to validate and sum the marks
            for (int i = 1; i <= 6; i++) {
                int marks = Integer.parseInt(args[i]);

                // Check if marks are within the valid range (0-50)
                if (marks < 0 || marks > 50) {
                    throw new RangeException("Error: Marks should be between 0 and 50. Invalid input: " + marks);
                }

                totalMarks += marks;
            }

            // Calculate percentage
            double percentage = (totalMarks / 300.0) * 100;

            // Print the Mark Sheet
            System.out.println("\nStudent Mark Sheet");
            System.out.println("----------------------------");
            System.out.println("Student Name: " + studentName);
            System.out.println("Total Marks: " + totalMarks + " / 300");
            System.out.printf("Percentage: %.2f%%\n", percentage);

        } catch (RangeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter only numeric values for marks.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
