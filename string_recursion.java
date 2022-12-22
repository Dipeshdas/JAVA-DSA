package DSA;


/*                               <---PALINDROME OF A STRING--->
public class string_recursion {

   static boolean isPalin(String s, int l, int r){
        if (l>=r)
            return true;
        if (s.charAt(l)!=s.charAt(r))
            return false;
        return isPalin(s,l+1,r-1);
    }
    static boolean palin(String str){
       int n=str.length();
       if (n==0)
           return true;
       return isPalin(str,0,n-1);
    }
    public static void main(String[] args) {
       String str="aba";
        if (palin(str))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
 */
/*                                  <---POWERSet OF A STRING--->
public class string_recursion {
    static void PowerSet(String s, int i, String cur) {
        if (i == s.length()) {
            System.out.println(cur);
            return;
        }
        PowerSet(s, i + 1, cur + s.charAt(i));
        PowerSet(s, i + 1, cur);
    }

    public static void main(String[] args) {
        String s = "ab";
        PowerSet(s, 0, "");
    }
}
 */
//                 PRINT ALL PERMUTATION OF A GIVEN STRING:-->
public class string_recursion {
    static void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
            return;
        }
        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            permute(s, l + 1, r);
            s = swap(s, l, i);
        }
    }

    static String swap(String s, int l, int i) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[l];
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);

    }

    public static void main(String[] args) {
        String s = "abc";
        permute(s, 0, s.length() - 1);
    }
}
