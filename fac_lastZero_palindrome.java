package DSA;
//                     FACTORIAL OF A GIVEN NUMBER:--->
/*
public class fac_lastZero_palindrome {
    static  int factorial(int n){
        if (n==0)
            return 1;
        return  n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
}
 */

import java.util.Scanner;

/*                      TRAILING ZEROS IN FACTORIAL:-->
public class fac_lastZero_palindrome {
    static int trailOfZeros(int n){
        if (n<0)
            return -1;
        int count=0;
        for (int i=5;i<=n;i=i*5){
            count=count+n/i;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println("There are "+trailOfZeros(n)+" zeros in last of "+n+"!");
    }
}
 */
public class fac_lastZero_palindrome {
    static int reverseNum(int n){
        int rNum=0;
        while (n>0){
            rNum=rNum*10 +n %10;
            n=n/10;
        }
        return rNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();
        System.out.println("Reversed Number Is:"+reverseNum(n));
        if (n==reverseNum(n)){
            System.out.println("The Number is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}