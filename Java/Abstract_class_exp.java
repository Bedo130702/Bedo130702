// ********** Using Abstract Class ********

abstract class  Animals{
    abstract void walk();
    // We can create a constructor of an abstract class and it(base class) is called before the subclass constructor.
    Animals(){
        System.out.println("A Constructor of Abstract class is called.");
    }
    public void eat(){
        System.out.println("An animal can eat.");
    }
}

class Horse extends Animals{
    Horse(){                // Constructor chaining
        System.out.println("A Constructor of Subclass is called.");
    }
    public void walk(){
        System.out.println("Walks on 4 legs.");
    }
}
class Chicken extends Animals{
    public void walk(){
        System.out.println("Walks on 2 legs.");
    }
}
public class Abstract{
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.walk();
        h1.eat();       // Horse can inherit the properties or Methods from an abstract class.
//        Animals a1=new Animals();     //Animals is abstract; cannot be instantiated
//        a1.walk();        //Animals is abstract; cannot be instantiated it does not work since it is a abstract class.

    }
}

// ********** Using Interfaces ******

interface Animal{
    void walk(); // it is abstract and public
//    Animal(){
//      We can't create Constructors of Interfaces.
//    }
    int eyes=2;     // A interface is public,static,Final
}
interface  Herbivore{

}
class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Horse has 4 legs.");
    }
}
class Abstract{
    public static void main(String args[]){
        Horse horse=new Horse();
        horse.walk();
        System.out.println(horse.eyes);
    }
}
