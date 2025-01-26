// 1. Single_level Inheritance

class Shape{
        public void area(){
            System.out.println("Display the area in Base Class.");
        }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Displaying the area of Triangle in subclass.");
        System.out.println((l*h)/2);
    }

}
public class Inheritance{
    public static void  main(String args[]){
        Triangle t1=new Triangle();
        t1.area();
        t1.area(4,3);
    }
}

// 2. Multilevel Inheritance

import java.lang.Math;
class Shape{
    public void area(){
        System.out.println("Display the area in Base Class.");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Displaying the area of Triangle in subclass.");
        System.out.println((l*h)/2);
    }

}
class Circle extends  Triangle{
    public void area(int r){
        System.out.println("Displaying the area of a Circle in subclass of triangle");
        System.out.println(3.14* Math.pow(r,2) );
    }
}
public class Inheritance{
    public static void  main(String args[]){
        Circle t1=new Circle();
       t1.area();
       t1.area(5,6);
       t1.area(4);
    }
}

//  3.Hierarchical Inheritance

import java.lang.Math;

class Shape{
    public void area(){
        System.out.println("Display the area in Base Class.");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Displaying the area of Triangle in subclass of the base class of shape.");
        System.out.println((l*h)/2);
    }

}
class Equilateral_Triangle extends  Shape{
    public void area(String side,int l,int h){
        System.out.println("Displaying the area of a Equilateral triangle in subclass of the base class of Shape.");
        System.out.println(side+" area is :"+l*h/2);
    }
}
public class Inheritance{
    public static void  main(String args[]){
        Equilateral_Triangle t1=new Equilateral_Triangle();
        Triangle t2=new Triangle();
        t2.area(3,4);
        t1.area("Equal side",4,5);

    }
}

// 4.Hybrid Inheritance

import java.lang.Math;
class Shape{
    public void area(){
        System.out.println("Display the area in Base Class.");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Displaying the area of Triangle in subclass of the base class of shape.");
        System.out.println((l*h)/2);
    }

}
class Equilateral_Triangle extends  Shape{
    public void area(String side,int l,int h){
        System.out.println("Displaying the area of a Equilateral triangle in subclass of the base class of Shape.");
        System.out.println(side+" area is :"+l*h/2);
    }
}
class Circle extends  Equilateral_Triangle{
    public void area(int r){
        System.out.println("Displaying the area of Triangle in subclass of the base class of Equilateral triangle.");
        System.out.println(3.14 * Math.pow(r,2));
    }
}
public class Inheritance{
    public static void  main(String args[]){
        Equilateral_Triangle t1=new Equilateral_Triangle();
        Triangle t2=new Triangle();
        Circle t3=new Circle();
        t2.area(3,4);
        t1.area("Equal side",4,5);
        t3.area("Inherit The properties of ET and the",5,6);
    }
}
