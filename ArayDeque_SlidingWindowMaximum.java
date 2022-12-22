package DSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArayDeque_SlidingWindowMaximum {
    static void printMax(int arr[],int n,int k){
        Deque<Integer>q=new ArrayDeque<>();
        int i;
        for(i=0;i<k;++i){
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])
                q.removeLast();
            q.addLast(i);
        }
        for(;i<n;++i){
            System.out.println(arr[q.peek()]+" ");
            while((!q.isEmpty())&&q.peek() <= i-k)
                q.removeFirst();
            while((!q.isEmpty()) && arr[i] >= arr[q.peekLast()])
                q.removeLast();
            q.addLast(i);
        }
        System.out.println(arr[q.peek()]);

    }
    public static void main(String[] args) {
        int a[]={4,1,3,5,1,2,3,2,1,1,5};
        int n=a.length;
        printMax(a,n,3);
    }
}
