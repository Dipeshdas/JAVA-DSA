package DSA;
import java.util.*;
class QueueStack{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
    void push(int data){
        s1.push(data);
    }
    int pop(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }
    int peek(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res=s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
//        QueueStack q=new QueueStack();
//        q.push(1);//FIFO
//        q.push(2);
//        q.push(34);
//        System.out.println(q.pop());
//        q.push(5);
//        System.out.println(q.pop());
//        System.out.println(q.peek());
        QueueStack Q=new QueueStack();
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int i=1;
        while(i<=q){
            int ch=sc.nextInt();
            int data=sc.nextInt();
            switch(ch){
                case 1:
                    Q.push(data);
                    break;
                case 2:
                    Q.pop();
                    break;
                case 3:
                    System.out.println(Q.peek());
                    break;
            }
            i++;
        }

    }
}
