////1. Implementation of method overloading with respect to parameter number, parameter data type.
class Methods{
    int a;
    int b;
    double c;
    double d;
    public void methodOverloading(int a,int b){
        this.a=a;
        this.b=b;
        int sum=a+b;
        System.out.println("Sum of the two numbers is :"+sum);
    }
    public void methodOverloading(double c,double d){
        this.c=c;
        this.d=d;
        double divide=c/d;
        System.out.println("The  divide of two number is: "+divide);
    }
}
public class Java_ass_four{
    public static void main(String [] args){
        Methods oj=new Methods();
        oj.methodOverloading(4,5);
        oj.methodOverloading(10278.453, 41.5);

    }
}

////2. Write a java program to implement of constructor overloading.

class Student {
    String name;
    int age;

    // Default Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor (Name only)
    public Student(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Constructor with Name Called");
    }

    // Parameterized Constructor (Name and Age)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with Name and Age Called");
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();               // Calls default constructor
        Student s2 = new Student("Alice");        // Calls constructor with name
        Student s3 = new Student("Bob", 22);      // Calls constructor with name and age

        s1.display();
        s2.display();
        s3.display();
    }
}

////3. Implementation of this keyword to invoke current class method.

class Student{
    int a;
    int b;
    int c;
    public void use_this_keyword(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("The given numbers are accordingly: "+a+" "+b+" "+c);
    }
}
public class Java_ass_four{
    public static void main(String[] args){
        Student obj=new Student();
        obj.use_this_keyword(23,45,67);
    }
}

//// 4. Implementation of this keyword to invoke current class constructor.
class Student{
    String a;
    String b;
    int c;
    Student(String a,String b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("My first name is "+a+" and the last name is "+b+" and the roll number is :"+c);
    }
}
public class Java_ass_four{
    public static void main(String[] args){
        Student obj=new Student("Bedabrata","Patra",14);
    }
//}

//// 5. Implementation of this keyword to pass as an argument in the method.

class Student{
    void display(Student obj){
    System.out.println("Method is called using this keyword.");
    }
    void show(){
        display(this);
    }
}
public class Java_ass_four{
    public static void main(String [] args){
        Student obj = new Student();
        obj.show();
    }
}
