package DSA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stack_MaxRectangleArea_Histogram {
    public static int maxArea(int a[]){
        int Ans=0;
        int ps[]=PSE(a);
        int ns[]=NSE(a);

        for(int i=0;i<a.length;i++){
            int cur=(ns[i]-ps[i]-1)*a[i];
            Ans=Math.max(Ans,cur);
        }
        return Ans;

    }
    public static int[] PSE(int[] a){
        int ps[]=new int[a.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public static int [] NSE(int a[]){
        Deque<Integer>s=new ArrayDeque<>();
        int ns[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=9;
            }
            else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }
    public static void main(String[] args) {
        int a[]={2,3,0,3,1,2};
        System.out.println(maxArea(a));
    }
}
