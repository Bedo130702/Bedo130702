import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int lenA=A.length();
        int left=0;
        int right=lenA-1;
        /* Enter your code here. Print output to STDOUT. */
        if (lenA%2!=0){
            while (left<right){
                if (A.charAt(left)!=A.charAt(right)){
                    System.out.print("No");
                }
                left++;
                right--;
            }
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}



