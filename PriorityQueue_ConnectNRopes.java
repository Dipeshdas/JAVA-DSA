package DSA;

import java.util.PriorityQueue;

public class PriorityQueue_ConnectNRopes {
    public static int CN(int a[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        int ans=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            int sum=first+second;
            ans+=sum;
            pq.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={2,5,4,8,6,9};
        System.out.println(CN(a));
    }
}

