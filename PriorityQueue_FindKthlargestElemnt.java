package DSA;

import java.util.PriorityQueue;

public class PriorityQueue_FindKthlargestElemnt {
    public static int FLE(int a[],int n,int k){
        PriorityQueue<Integer>p=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            p.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            if(a[i]>p.peek()){
                p.poll();
                p.add(a[i]);
            }
        }
        return p.peek();
    }
    public static void main(String[] args) {
        int a[]={10,20,5,30,15,25};
        int n=a.length;
        System.out.println(FLE(a,n-1,3));
    }
}
