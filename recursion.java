package DSA;

//      FIND THE SUM OF N NATURAL NUMBER USING RECURSION:-->
/*
public class recursion {
    static int sum(int n){
        if (n==1)
            return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The sum of "+n+" natural number is : "+sum(n));
    }
}
 */
/*                      FIND A TO THE POWER B:-->
public class recursion{
    static  int power(int a, int b){
        if (b==0)
            return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        int a=2;
        int b=2;
        System.out.println(a+"^"+b+" = "+power(a,b));
    }
}
 */
/*                       <---MATRIX-->
public class recursion {
    static  int matrix(int n,int m){
        if (n==1 || m==1)
            return 1;
        return matrix(n-1,m)+ matrix(n,m-1);
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println("There are "+matrix(n,m)+" ways in "+n+"X"+m+" matrix");
    }
}
 */
//                   JOSEPHUS PROBLEM:-->
public class recursion {
    static int jos(int n,int k){
        if (n==1)
            return 0;
        return (jos(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        System.out.println(jos(5,3)+" will be remain at last");
    }
}