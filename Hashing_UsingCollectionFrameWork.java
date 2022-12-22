package DSA;

import java.util.HashSet;

public class Hashing_UsingCollectionFrameWork {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(5);
        set.add(51);
        set.add(52);
        System.out.println(set);
        if(set.contains(5)){
            System.out.println("Present");
        }
        else
            System.out.println("Not Present");
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
    }
}
