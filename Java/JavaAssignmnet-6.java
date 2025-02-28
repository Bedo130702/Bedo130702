// Q1) Write a java program to implement the abstraction property.

abstract class impprop{
    int aprp;
    void methods(){
        System.out.println("This is an abstract class.");
    }
}
class Absprop extends impprop{
    public void methods(int aprp){
        System.out.println("This is the implements of an abstract class.My roll number is :"+aprp);
    }
}

public class Assignment_five{
    public static void main(String [] args){
        Absprop obj= new Absprop();
        obj.methods(14);
    }
}

//Qs-2.) Write a java program to implement interface.

interface inter1{
     int age=23;
     String name="Bedabrata";
    void Method1();
}
class impinter implements inter1{
    public void Method1(){
        System.out.println("I am in the implement interface inter1. My name is "+name+" age is :"+age);
    }
}
public class Assignment_five{
    public static void main(String a[]){
            impinter obj =new impinter();
            obj.Method1();
    }
}

//Qs-3) Write a java program to implement multi level inheritance with the help of interface.

interface A {
    long erNo = 1202400601L; // 'L' is needed for long literals
    void method1();
}

interface B extends A {
    int roll = 14;
    void method2();
}

class D implements B {
    int age;
    String name;

    // Constructor to initialize values (optional)
    D(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Correctly implementing method1
    @Override
    public void method1() {
        System.out.println("Name is " + name + ", Roll number is " + roll);
    }

    // Correctly implementing method2
    @Override
    public void method2() {
        System.out.println("Name is " + name + ", Age is " + age + ", Enrollment number is " + erNo);
    }
}

// Main class to test
public class Assignment_five {
    public static void main(String[] args) {
        // Creating an object of D with a name and age
        D obj = new D("Bedabrata", 23);

        // Calling methods
        obj.method1();
        obj.method2();
    }
}

//Qs-4) Write a java program to implement the inheritance in interface.

interface Animal{
    void eat();
}
interface Mammal extends  Animal{
    void walk();
}

class Dog implements Mammal{
    public void eat(){
        System.out.println("Dog is eating.");
    }
    public void walk(){
        System.out.println("Dog is walking.");
    }
}

public class Assignment_five {
    public static void main(String[] args) {
        // Creating an object of D with a name and age
        Dog obj = new Dog();

        // Calling methods
        obj.eat();
        obj.walk();
    }
}

//q-5) Write a java program to implement multiple inheritance using interface.
 First Interface
interface Animal {
    void eat();
}

// Second Interface
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing...");
    }
}

// Main Class
public class Assignment_five{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // From Animal interface
        myDog.play(); // From Pet interface
    }
}

//Qs-6) Write a java program to implement super keyword in java.

class A{
    public void method1(){
        System.out.println("This is the class A.");
    }
}
class B extends A{
    @Override
    public void method1() {
        super.method1();
        System.out.println("This is the inherit class B.");
    }
}
class C extends B{
    public void method1(){
        super.method1();
        System.out.println("This is the inherit class C");
    }
}
public class Assignment_five{
    public static void main(String[] args){
        C obj=new C();
        obj.method1();
    }
}
//Qs-7)

 Parent Class
class Animal {
    Animal() {  // Default constructor
        System.out.println("Animal constructor is called.");
    }
}

// Child Class
class Dog extends Animal {
    Dog() {
        super();  // Calls the constructor of Animal (Parent Class)
        System.out.println("Dog constructor is called.");
    }
}

// Main Class
public class Assignment_five {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Creates a Dog object
    }
}
//Qs-8)

// Parent Class
class Animal {
    Animal(String name) {  // Parameterized constructor
        System.out.println("Animal constructor is called. Name: " + name);
    }
}

// Child Class
class Dog extends Animal {
    Dog(String name, String breed) {
        super(name);  // Calls the parameterized constructor of Animal
        System.out.println("Dog constructor is called. Breed: " + breed);
    }
}

// Main Class
public class Assignment_five {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");  // Creates Dog object
    }
}

//Qs-9)

// Interface Player
interface Player {
    void play();  // Abstract method
}

// Class Child implementing Player
class Child implements Player {
    @Override
    public void play() {
        System.out.println("A child plays with toys and games.");
    }
}

// Class Musician implementing Player
class Musician implements Player {
    @Override
    public void play() {
        System.out.println("A musician plays a musical instrument.");
    }
}

// Class Actor implementing Player
class Actor implements Player {
    @Override
    public void play() {
        System.out.println("An actor plays a role in movies or theater.");
    }
}

// Main Application to Demonstrate
public class Assignment_five {
    public static void main(String[] args) {
        // Creating objects of each class
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();

        // Calling play() method on each object
        child.play();
        musician.play();
        actor.play();
    }
}

//Qs-10)

abstract class Accounts {
    // Data Members
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    // Constructor to initialize account details
    public Accounts(String accountNumber, String accountHoldersName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }

    // Abstract Methods
    public abstract void withdrawal(double amount);
    public abstract void deposit(double amount);

    // Concrete Method to Display Account Balance
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: $" + balance);
    }
}

// Subclass SavingsAccount extending Accounts
class SavingsAccount extends Accounts {
    private double rateOfInterest; // Additional data member

    // Constructor
    public SavingsAccount(String accountNumber, String accountHoldersName, String address, double balance, double rateOfInterest) {
        super(accountNumber, accountHoldersName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }

    // Implementing withdrawal method
    @Override
    public void withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
        }
    }

    // Implementing deposit method
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. Updated balance: $" + balance);
    }

    // Method to calculate the amount after applying interest
    public void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        balance += interest;
        System.out.println("Interest of $" + interest + " applied. New balance: $" + balance);
    }
}

// Main Class
public class Assignment_five {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount myAccount = new SavingsAccount("123456789", "John Doe", "New York, USA", 1000.0, 5.0);

        // Displaying initial account details
        myAccount.display();
        System.out.println();

        // Performing deposit, withdrawal, and interest calculation
        myAccount.deposit(500);
        myAccount.withdrawal(300);
        myAccount.calculateAmount();

        System.out.println("\nFinal Account Details:");
        myAccount.display();
    }
}

//Qs-11)

class assignment_five {
    final int SPEED_LIMIT = 100; // final variable

    void display() {
        // SPEED_LIMIT = 120; // Error! Final variables cannot be reassigned.
        System.out.println("Speed Limit: " + SPEED_LIMIT);
    }

    public static void main(String[] args) {
        assignment_five obj = new assignment_five();
        obj.display();
    }
}


//Qs-12

final class FinalClass {
    void showMessage() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass { // Error! Final class cannot be inherited.
// }
public class Assignment_five{
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.showMessage();
    }
}

//Qs-13)

 Save this file as MyPackageClass.java inside a folder named "mypackage"
package mypackage;

public class MyPackageClass {
    public void displayMessage() {
        System.out.println("This is a user-defined package.");
    }
}
public class Assignment_five{
    public static void main(String[] args) {
        MyPackageClass obj = new MyPackageClass();
        obj.displayMessage();
    }
}

//Qs-18)
// File: PublicClass.java (inside "mypackage" folder)
package mypackage;

public class PublicClass {
    public void show() {
        System.out.println("This is a public method.");
    }
}

// File: PublicAccessExample.java (outside "mypackage" folder)
import mypackage.PublicClass;

public class PublicAccessExample {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        obj.show(); // Accessible because it's public
    }
}
