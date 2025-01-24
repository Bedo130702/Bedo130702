//Q-1.Write a java program to create a simple array and access array element.

public class Assignment_two{
    public static void main(String[] args){

        int []simple_array={23,34,45,54,67,78};
        int i=0;
        while(i<simple_array.length){
            System.out.println(simple_array[i]);
            i++;
        }
    }
}

//2. Write a java program to create 2D array and access the array element.

public class Assignment_two {
    public static void main(String[] args) {

        int[][] array = {{23, 34,55}, {45, 54,77}, {67, 78,89}};
        int i=0;
        while(i<array.length) {
            System.out.print("{ ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(", "); // Add comma between elements
                }
            }
            System.out.println(" }");
            i++;
        }
    }
}

//4. Write a Java program to calculate Sum of two 2-dimensional arrays.

import java.util.Scanner;
public class Assignment_two {
    public static void main(String[] args) {
        Scanner array=new Scanner(System.in);
        int row=array.nextInt();
        int col=array.nextInt();
        int matrix1[][]=new int[row][col];
        int matrix2[][]=new int[row][col];
        int sum[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j]=array.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j]=array.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("The Sum of the matrix1 and matrix2 for index is"+(i+1)+(j+1)+": "+sum[i][j]);
            }
        }
    }
}

//3. Write a Java program to find the sum of even numbers in an integer array.

public class Assignment_two{
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate the sum of even numbers
        int sum = calculateSumOfEvenNumbers(numbers);

        // Print the result
        System.out.println("The sum of even numbers in the array is: " + sum);
    }

    public static int calculateSumOfEvenNumbers(int[] array) {
        int sum = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }
}




// 5. Write a Java program to find the sum of diagonal elements in a 2D array.


public class Assignment_two{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for(int j=0;j<size;j++){
            if(i==j){
            sum+=matrix[i][j];
        }
        else{
        continue;
        }
}
}
       System.out.println("Sum of diagonal elements: " + sum);
        }
}

//6. Write a Java program to multiply two matrices.

public class Assignment_two{
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int rowsMatrix1 = matrix1.length;
        int colsMatrix1 = matrix1[0].length;
        int rowsMatrix2 = matrix2.length;
        int colsMatrix2 = matrix2[0].length;

        if (colsMatrix1 != rowsMatrix2) {
            System.out.println("Matrix multiplication is not possible. Incompatible dimensions.");
            return;
        }

        int[][] resultMatrix = new int[rowsMatrix1][colsMatrix2];

        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < colsMatrix1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// 7. Implementation of default, no argument Constructor.
public class Assignment_two{
     String name;
     int age;

    // Default, no-argument constructor
    public Example() {
        this.name = "Default Name";
        this.age = 0;
        System.out.println("Default constructor called.");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.display();
    }
}
