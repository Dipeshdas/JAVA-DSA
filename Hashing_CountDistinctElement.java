package DSA;

import java.util.HashSet;

public class Hashing_CountDistinctElement {
    public static int CDE(int a[]){
        HashSet<Integer>s=new HashSet<>();
        for (int e:a) {
            s.add(e);
        }
        System.out.println(s);
        return s.size();
    }
    public static void main(String[] args) {
        int a[]={5,10,5,15,10,20,25};
        System.out.println(CDE(a));
    }
}
