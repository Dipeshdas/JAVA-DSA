package DSA;
import java.util.*;
public class Stack_PreviousGreaterElement {
    public static void PGE(int a[]){
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && s.peek()<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print(-1);
                System.out.print(" ");
            }
            else{
                System.out.print(s.peek());
                System.out.print(" ");
            }
            s.push(a[i]);
        }

    }
    public static void main(String[] args) {
        int a[]={4,10,5,8,20,15,3,12};
        PGE(a);
    }
}
