package DSA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stack_LargestAreaSubMatrix_Withall_1s {
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
        Deque<Integer> s=new ArrayDeque<>();
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
    public static int LAS(int R,int C,int a[][]){
        int curRow[]=a[0];
        int MaxANs=maxArea(curRow);
        System.out.println(MaxANs);
        for(int i=1;i<R;i++){
            for (int j=0;j<C;j++){
                if(a[i][j]==1){
                    curRow[j]+=1;
                }
                else{
                    curRow[j]=0;
                }
            }
            int curAns=maxArea(curRow);
            System.out.println(curAns);
             MaxANs=Math.max(MaxANs,curAns);
        }
        return MaxANs;
    }
    public static void main(String[] args) {
        int R=4;
        int C=6;
        int a[][]={ {0,1,1,1,1,0},
                    {1,1,1,1,0,1},
                    {1,1,0,1,1,1},
                    {1,1,1,1,1,0}};
        int k=LAS(R,C,a);
        System.out.println(k);
    }
}
