import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int X,rem,s=0,n;
       Scanner sc=new Scanner(System.in);
           X=sc.nextInt();
        while(X!=0)
        {
            rem=X%10;
            s=(s*10)+rem;
            n=X/10;
            X=n;
        }
         System.out.println(s);
         
            
           
    }
}
