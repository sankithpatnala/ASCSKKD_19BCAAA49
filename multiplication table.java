import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        int N;
       Scanner sc=new Scanner(System.in);
       N=sc.nextInt();
       for(int i=1;i<11;i++){
           System.out.println(N+" x "+i+" = "+N*i);
       }
    }
}
