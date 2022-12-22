package DSA;

import java.util.HashSet;

public class Hashing_UnionAndIntersection {
    public static int Union(int a[],int b[]){
        HashSet<Integer>s1=new HashSet<>();
        for (int e:a) {
            s1.add(e);
        }
        for (int e:b) {
            s1.add(e);
        }
        System.out.println(s1);
        return s1.size();
    }
    public static int Intersection(int a[],int b[]){
        HashSet<Integer>s2=new HashSet<>();
        HashSet<Integer>s3=new HashSet<>();
        for(int e:a){
            s2.add(e);
        }
        int count=0;
        for(int e:b){
            if (s2.contains(e)){
                s3.add(e);
                count++;
                s2.remove(e);
            }
        }
        System.out.println(s3);
        return count;
    }
    public static void main(String[] args) {
        int a[]={1,5,2,5,6};
        int b[]={1,5,2,8};
        System.out.println(Union(a,b));
        System.out.println(Intersection(a,b));
    }
}
