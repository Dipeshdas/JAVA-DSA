package DSA;
/*                              SeiveofEratoSthenes(PRIME NUMBERS)
import java.util.Arrays;

public class prime_GCD_Modulo {
    public static void main(String[] args) {
        boolean isPrime[]=seiveofEratoSthenes(20);
        for (int i=0; i<=20;i++){
            System.out.println(i+"-->"+isPrime[i]);
        }
    }
    static boolean[] seiveofEratoSthenes(int n){
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int i=2; i*i<=n;i++){
            for (int j=2*i;j<=n;j+=i){
                isPrime[j]=false;
            }
        }
        return isPrime;

    }
}
 */
/*                                      <--GCD-->
public class prime_GCD_Modulo {
    public static void main(String[] args) {
        System.out.println(gcd(24,72));
    }
    static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
 */
public class prime_GCD_Modulo {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(fastPower(64856464,5,100000));
    }
    static long fastPower(long a, long b,int n){
        long res=1;
        while (b>0){
            if ((b& 1)!=0){
                res=(res*a%n)%n;
            }
            a=(a%n * a%n);
            b=b>>1;
        }
        return res;
    }
}