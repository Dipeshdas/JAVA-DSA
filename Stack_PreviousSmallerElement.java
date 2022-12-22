package DSA;
import java.util.*;
public class Stack_PreviousSmallerElement {
    public static void PSE(int a[]){
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && s.peek()>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print(-1);
                System.out.print(" ");
            }
            else {
                System.out.print(s.peek());
                System.out.print(" ");
            }
            s.push(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={4,10,5,8,3,12,7};
        PSE(a);

    }
}

