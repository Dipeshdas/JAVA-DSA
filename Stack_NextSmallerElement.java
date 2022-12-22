package DSA;
import java.util.*;
public class Stack_NextSmallerElement {
    public static int [] NSE(int a[]){
        Deque<Integer>s=new ArrayDeque<>();
        int ns[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=-1;
            }
            else{
                ns[i]=s.peek();
            }
            s.push(a[i]);
        }
        return ns;
    }
    public static void main(String[] args) {
        int a[]={3,10,5,1,15,10,7,6};
        int k[]=NSE(a);
        for (int e:k) {
            System.out.print(e);
            System.out.print(" ");
        }
    }
}
