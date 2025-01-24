//      Question-1
public class Main {
    public static void main(String[] args) {
        System.out.printf("HELLO JAVA");
    }
}
//      Question-2

import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args){
        int n=5;
        int m=6;
        System.out.println(n+m);
    }
}
//      Question-3

public class Main{
    public static void main(String[] args){
        int n=5;
        int mul=1;
        for(int i=1;i<=n;i++){
          mul=mul*i;
        }
        System.out.println(mul);
    }
}
//      Question-4

import java.util.Scanner;
public class Main{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int i=1,result=1;
         while(i<=num) {
             result=i*result;
             i++;
         }
         System.out.println(result);
     }
}
//      Question-5

import java.util.Scanner;
public class Main{
    public static int factorial(int n) {
        if(n==0 || n==1)
            return 1;
        return n * factorial(n - 1);
    }
     public static void main(String[] args){
         int num=5;
         int result=factorial(num);
         System.out.println(result);
     }
}
//       Question-6

import java.util.Scanner;
public class Main{
    public static int factorial(int n) {
        if(n==0 || n==1)
            return 1;
        return n * factorial(n - 1);
    }
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int result=factorial(num);
         System.out.println(result);
     }
}
//      Question-7

import java.util.Scanner;
public class Main{
    public static int oddeven(int n) {
        if(n%2==0)
            return 1;
        return 0;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int result = oddeven(num);
         if (result == 1) {
             System.out.println("The number is Even");
         } else {
             System.out.println("The number is Odd");
         }
     }
}
//         Question-8

import java.util.Scanner;
public class Main{
    public static void Maxofthree(int x,int y,int z) {
        if (x>y && y>z){
            System.out.println("The maximum number is "+ x);
        }
        else if (y>x && x>z) {
            System.out.println("The maximum number is "+ y);
        }
        else{
            System.out.println("The maximum number is "+ z);
        }
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num1 = sc.nextInt();
         int num2= sc.nextInt();
         int num3 = sc.nextInt();
         Maxofthree(num1,num2,num3);
     }
}

//      Question-9
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main{
    public static void Swaping(int x,int y) {
        int temp;
        temp=y;
        y=x;
        x=temp;
        System.out.println("After swaping the numbers we have x= "+x+",y= "+y);
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of x:");
         int num1 = sc.nextInt();
         System.out.println("Enter the value of y:");
         int num2= sc.nextInt();
         System.out.println("Before swaping the numbers we have x= "+num1+",y= "+num2);
         Swaping(num1,num2);
     }
}

//          Question-10

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main{
    public static void Leapyear(int n) {
                System.out.println("The Year is " + n);
                if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
                    System.out.println("The year " + n + " is a leap year ");
                }
                else
                {
                    System.out.println("The year "+n+" is not a leap year ");
                }
            }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         Leapyear(num);
     }
}
//          Question-11
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main{
    public static void Grade(int m) {
                System.out.println("The grade  percentage of the student is " +m);
                if(m>=90)
                {
                    System.out.println("Grade A");
                }
                else if( m>=80 && m<=89)
                {
                    System.out.println("Grade B");
                }
                else if( m>=70 && m<=79)
                {
                    System.out.println("Grade C");
                }
                else if(m>=60 && m<=69)
                {
                    System.out.println("Grade D");
                }
                else if(m>=40 && m<=59)
                {
                    System.out.println("Grade E");
                }
                else if( m <40)
                {
                    System.out.println("Grade F");
                }
                else
                {
                    System.out.println("Not in range");
                }
            }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Grade(num);
    }
}
//      Question-12
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void Divisibleby5(int n) {
        if (n % 5 == 0) {
            System.out.println("The number " + n + " is divisible by 5.");
        } else {
            System.out.println("The number " + n + " is not divisible by 5.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it's divisible by 5 or not:");
        int num = sc.nextInt();
        Divisibleby5(num);
    }
}



