//1. Write a java program to implement the static keyword in java.

class StaticExample {
    static int count = 0; // Static variable

    StaticExample() {
        count++;
        System.out.println("Object created. Count: " + count);
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();
    }
}

////2. Write a java program to implement the static method in java.
class StaticExample {
    static void displayMessage() { // Static method
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        displayMessage(); // Call without object
    }
}

////3. Write a java program to implement the single inheritance in java.

class Parent {
    void show() {
        System.out.println("This is a parent class.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is a child class.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
    }
}

////4. Write a java program to implement the hierarchical inheritance in java.
class Parent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child1 extends Parent {
    void display1() {
        System.out.println("This is Child1.");
    }
}

class Child2 extends Parent {
    void display2() {
        System.out.println("This is Child2.");
    }
}

public class HierarchicalExample {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.show();
        obj1.display1();

        Child2 obj2 = new Child2();
        obj2.show();
        obj2.display2();
    }
}

////5. Write a java program to implement the multilevel inheritance in java.

class Grandparent {
    void displayGrandparent() {
        System.out.println("This is the Grandparent class.");
    }
}

class Parent extends Grandparent {
    void displayParent() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the Child class.");
    }
}
public class Main{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayGrandparent();
        obj.displayParent();
        obj.displayChild();
    }
}

////6. Multiple inheritance does not support in java – justify.

interface A {
    void show();
}

interface B {
    void show();
}

// This would cause an error due to ambiguity
class C implements A, B {
    public void show() {
        System.out.println("Implemented method from both interfaces.");
    }
}

public class Main{
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

////7. Implementation of method overriding in java.

class Parent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is the overridden method in the child class.");
    }
}
public class Main{
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Calls the overridden method
    }
}

//// 8. Implementation of dynamic method dispatch in java.

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent ref; // Parent class reference
        ref = new Child(); // Reference to child object
        ref.show(); // Calls child's method
    }
}

////9. Write a java program to stop method overriding.

class Parent {
    final void show() { // final method
        System.out.println("This method cannot be overridden.");
    }
}

class Child extends Parent {
    // void show() {} // This would cause an error
}
public class Main{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

////        10. Create a “circle” class & a “point” class. The coordinates of the circle are given and used within
////the “circle” class as object of the “point” class. Display the area of circle

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point center;
    double radius;

    Circle(int x, int y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Main{
    public static void main(String[] args) {
        Circle c = new Circle(2, 3, 5);
        System.out.println("Area of Circle: " + c.getArea());
    }
}

////11. Write a program to define a class Employee to accept emp_id, emp _name, basic_salary from the
////user and display the gross_salary.

import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary, gross_salary;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        emp_name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic_salary = sc.nextDouble();
        gross_salary = basic_salary + (0.2 * basic_salary) + (0.8 * basic_salary); // DA & HRA
    }

    void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Gross Salary: " + gross_salary);
    }
}
public class Main{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.acceptDetails();
        e.displayDetails();
    }
}

////        12. Write a program to define a class Fraction having data members numerator and denominator.
////Initialize three objects using different constructors and display its fractional value.

class Fraction {
    int numerator, denominator;

    Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void display() {
        System.out.println("Fraction: " + numerator + "/" + denominator);
    }
}
public class Main{
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(3, 4);
        f1.display();
        f2.display();
    }
}

//13. Write a program to define a class Item containing code and price. Accept this data for five
//objects using array of objects. Display code, price in tabular form and also, display total price of all
//items

import java.util.Scanner;

class Item {
    int code;
    double price;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        code = sc.nextInt();
        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.printf("%-10d %-10.2f%n", code, price);
    }

    public static void main(String[] args) {
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            items[i].accept();
            total += items[i].price;
        }

        System.out.printf("%-10s %-10s%n", "Code", "Price");
        for (Item item : items) {
            item.display();
        }

        System.out.println("Total Price: " + total);
    }
}

