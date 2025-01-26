import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int lenA=A.length();
        int left=0;
        int right=lenA-1;
        int flag=0;
        /* Enter your code here. Print output to STDOUT. */
            while (left<right){
                if (A.charAt(left)!=A.charAt(right)){
                    flag=1;
                }
                left++;
                right--;
            }
        if(flag==1){
            System.out.print("No");
        }
        else{
            System.out.print("Yes");
        }
    }
}
}



