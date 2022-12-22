package DSA;

import java.util.HashMap;

public class Hashing_CountDistinctElementInKthWindow {
    static void CDEIK(int a[],int k){
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<k;i++){
            m.put(a[i], m.getOrDefault(a[i],0)+1);
        }
        System.out.println(m.size());
        for(int i=k;i<a.length;i++){
            if(m.get(a[i-k])==1){
                m.remove(a[i-k]);
            }
            else{
                m.put(a[i-k],m.get(a[i-k])-1);
            }
            m.put(a[i],m.getOrDefault(a[i],0)+1);
            System.out.println(m.size());
        }

    }

    public static void main(String[] args) {
        int a[]={1,2,2,1,3,1,1,3};
        CDEIK(a,4);
    }
}
