////1. Write a java program to implement BufferedReader class.

import java.io.*;

public class java_Assignment_three {
    public static void main(String[] args) throws IOException {
    BufferedReader oj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a name: ");
    String name= oj.readLine();
    System.out.println("Hello, "+name);
    oj.close();
    }
}

////2. Write a java program to take input from keyboard using Scanner class.
 import java.util.Scanner;

public class java_Assignment_three {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name and age: ");
        String name=input.nextLine();
        int age=input.nextInt();
        System.out.println(" Your Name is "+name+" and the age is "+age);
        input.close();
    }
}
//// 3. Write a Java program to reverse a number.

public class java_Assignment_three {
    public static void main(String[] args){
        int num=12345;
        int rev=0;
        while(num!=0){
            int last=num%10;
            rev=rev*10+last;
            num=num/10;
        }
        System.out.println("The reverse number is :"+rev);
    }
}
// 4. Write a Java program to check whether a number is palindrome or not.

import java.util.Scanner;

public class java_Assignment_three {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number to check it is a palindrome or not!");
        int input=num.nextInt();
        int rev=0;
        int temp=input;
        while(input>0){
            int Digit=input%10;
            rev=rev*10+Digit;
            input=input/10;
        }
        if(rev==temp){
            System.out.println("The input number is palindrome.");
        }
        else{
            System.out.println("The input number is not palindrome.");
        }
    }
}
//5. Write a Java program to check whether a number is prime or not.

import java.util.Scanner;

public class java_Assignment_three {
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number or not.");
        int input=number.nextInt();
        if(input==1){
            System.out.println("The Given number is not a prime.");
        }
        for(int i=2;i<Math.sqrt(input);i++){
            if(input%i==0){
                System.out.println("The Given number is not a prime.");
            }
            else{
                System.out.println("The Given number is a prime number.");
            }
        }

    }
}
//6. Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.
import java.util.Scanner;

public class java_Assignment_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1: Convert Binary to Decimal");
        System.out.println("2: Convert Decimal to Binary");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a binary number: ");
                String binary = scanner.next();
                int decimal = Integer.parseInt(binary, 2); // Convert binary to decimal
                System.out.println("Decimal value: " + decimal);
                break;

            case 2:
                System.out.print("Enter a decimal number: ");
                int dec = scanner.nextInt();
                String bin = Integer.toBinaryString(dec); // Convert decimal to binary
                System.out.println("Binary value: " + bin);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanner.close();
    }
}

//7. Write a Java program to check whether a given number is Armstrong Number or not.

import java.util.Scanner;
import java.lang.Math;
public class java_Assignment_three {
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        System.out.println("Enter a number to check it's armstrong or not.");
        int input=number.nextInt();
        int count=0;
        int num=0;
        int temp=input;
        while(input>0){
            input=input/10;
            count++;
        }
        input=temp;
        int sum=0;
        while(input!=0){
            int digit=input%10;
            sum+=Math.pow(digit,count);
            input=input/10;
        }
        if(sum==temp){
            System.out.println("The input number is a Armstrong number.");
        }
        else{
            System.out.println("The input number is not a Armstrong number.");
        }
    }
}
//8. Write a Java program to calculate the sum of natural numbers up to a certain range
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,em = 0;
        System.out.println("Enter the number of terms");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        for(int i = 1 ;i<=a;i++)
        {
            em = em + i;
        }
        System.out.println("The sum of the natural number till the number is "+em);
    }
}

//9. Write java codes to implement the followings – Basic string handling concepts- Concept of
//mutable and immutable string, Methods of String class-charAt(), compareTo(), equals(),
//equalsIgnoreCase(), indexOf(), length() , substring().; toCharArray(), toLowerCase(), toString(),
//toUpperCase() , trim() , valueOf() methods



public class java_Assignment_three {

    public static void main(String[] args) {
        String immutableString = "Hello";
        demonstrateImmutableString(immutableString);
        StringBuilder mutableString = new StringBuilder("Hello");
        demonstrateMutableString(mutableString);
        String str1 = "Hello World!";
        String str2 = "hello world!";

        demonstrateCharAt(str1);
        demonstrateCompareTo(str1, str2);
        demonstrateEquals(str1, str2);
        demonstrateEqualsIgnoreCase(str1, str2);
        demonstrateIndexOf(str1);
        demonstrateLength(str1);
        demonstrateSubstring(str1);
        demonstrateToCharArray(str1);
        demonstrateToLowerCase(str1);
        demonstrateToUpperCase(str1);
        demonstrateToString();
        demonstrateTrim("  Hello World!  ");
    }
    public static void demonstrateImmutableString(String immutableString) {
        System.out.println("Original Immutable String: " + immutableString);
        immutableString = immutableString + " World!";
        System.out.println("Modified Immutable String: " + immutableString);
        System.out.println();
    }
    public static void demonstrateMutableString(StringBuilder mutableString) {
        System.out.println("Original Mutable StringBuilder: " + mutableString);
        mutableString.append(" World!");
        System.out.println("Modified Mutable StringBuilder: " + mutableString);
        System.out.println();
    }
    public static void demonstrateCharAt(String str) {
        System.out.println("charAt() - Character at index 4: " + str.charAt(4));
        System.out.println();
    }
    public static void demonstrateCompareTo(String str1, String str2) {
        System.out.println("compareTo() - Comparing str1 with str2: " + str1.compareTo(str2));
        System.out.println();
    }
    public static void demonstrateEquals(String str1, String str2) {
        System.out.println("equals() - Are str1 and str2 equal? " + str1.equals(str2));
        System.out.println();
    }
    public static void demonstrateEqualsIgnoreCase(String str1, String str2) {
        System.out.println("equalsIgnoreCase() - Are str1 and str2 equal ignoring case? " + str1.equalsIgnoreCase(str2));
        System.out.println();
    }
    public static void demonstrateIndexOf(String str) {
        System.out.println("indexOf() - Index of 'World' in str: " + str.indexOf("World"));
        System.out.println();
    }
    public static void demonstrateLength(String str) {
        System.out.println("length() - Length of str: " + str.length());
        System.out.println();
    }
    public static void demonstrateSubstring(String str) {
        System.out.println("substring() - Substring of str from index 6: " + str.substring(6));
        System.out.println();
    }
    public static void demonstrateToCharArray(String str) {
        char[] charArray = str.toCharArray();
        System.out.print("toCharArray() - Characters in str: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void demonstrateToLowerCase(String str) {
        System.out.println("toLowerCase() - str in lowercase: " + str.toLowerCase());
        System.out.println();
    }
    public static void demonstrateToUpperCase(String str) {
        System.out.println("toUpperCase() - str in uppercase: " + str.toUpperCase());
        System.out.println();
    }

    public static void demonstrateToString() {
        StringBuilder sb = new StringBuilder("Java");
        String strFromBuilder = sb.toString();
        System.out.println("toString() - String from StringBuilder: " + strFromBuilder);
        System.out.println();
    }
    public static void demonstrateTrim(String str) {
        System.out.println("trim() - String with spaces trimmed: '" + str.trim() + "'");
        System.out.println();
    }
}




//10. Write java codes to implement the followings – Methods of Stringbuffer class: append(),
//capacity(), charAt(), delete(), deleteCharAt().; ensureCapacity(), getChars(), indexOf(), insert(),
//length(), setCharAt(), setLength(), substring(), toString().

10. Write java codes to implement the followings – Methods of Stringbuffer class: append(),
capacity(), charAt(), delete(), deleteCharAt().; ensureCapacity(), getChars(), indexOf(), insert(),
length(), setCharAt(), setLength(), substring(), toString().

Source Code:
public class Main {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        appendExample(sb);
        capacityExample(sb);
        charAtExample(sb);
        deleteExample(sb);
        deleteCharAtExample(sb);
        ensureCapacityExample(sb);
        getCharsExample(sb);
        indexOfExample(sb);
        insertExample(sb);
        lengthExample(sb);
        setCharAtExample(sb);
        setLengthExample(sb);
        substringExample(sb);
        toStringExample(sb);
    }

    public static void appendExample(StringBuffer sb) {
        sb.append(" World!");
        System.out.println("append() - After append: " + sb);
    }

    public static void capacityExample(StringBuffer sb) {
        System.out.println("capacity() - Current capacity: " + sb.capacity());
    }

    public static void charAtExample(StringBuffer sb) {
        System.out.println("charAt() - Character at index 6: " + sb.charAt(6));
    }

    public static void deleteExample(StringBuffer sb) {
        sb.delete(5, 12);
        System.out.println("delete() - After delete: " + sb);
    }

    public static void deleteCharAtExample(StringBuffer sb) {
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt() - After deleting character at index 5: " + sb);
    }

    public static void ensureCapacityExample(StringBuffer sb) {
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity() - After ensuring capacity of 50: " + sb.capacity());
    }

    public static void getCharsExample(StringBuffer sb) {
        char[] charArray = new char[10];
        sb.getChars(0, 5, charArray, 0);
        System.out.print("getChars() - Characters copied to array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void indexOfExample(StringBuffer sb) {
        int index = sb.indexOf("World");
        System.out.println("indexOf() - Index of 'World': " + index);
    }

    public static void insertExample(StringBuffer sb) {
        sb.insert(5, " Java");
        System.out.println("insert() - After insert: " + sb);
    }

    public static void lengthExample(StringBuffer sb) {
        System.out.println("length() - Length of StringBuffer: " + sb.length());
    }

    public static void setCharAtExample(StringBuffer sb) {
        sb.setCharAt(5, 'J');
        System.out.println("setCharAt() - After changing character at index 5: " + sb);
    }

    public static void setLengthExample(StringBuffer sb) {
        sb.setLength(5);
        System.out.println("setLength() - After setting length to 5: " + sb);
    }

    public static void substringExample(StringBuffer sb) {
        String subStr = sb.substring(0, 5);
        System.out.println("substring() - Extracted substring: " + subStr);
    }

    public static void toStringExample(StringBuffer sb) {
        String str = sb.toString();
        System.out.println("toString() - Converted to String: " + str);
    }
}
