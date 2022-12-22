package DSA;
class MyStack{
    int top;
    int a[];
    int capacity;
    public MyStack(int capacity){
        this.capacity=capacity;
        top=-1;
        a=new int[capacity];
    }
    void push(int data) throws Exception {
        if(top==capacity-1){
            throw new Exception("Capacity reach!!!");
        }
        top++;
        a[top]=data;
    }
    int pop()throws Exception{
        if(top==-1){
            throw new Exception("Underflow!!!");
        }
        int res=a[top];
        top--;
        return res;
    }
    int peek()throws Exception{
        if(top==-1){
            throw new Exception("Underflow!!!");
        }
        return a[top];
    }
    void show() throws Exception {
        while(!isEmpty()){
            System.out.print(a[top]);
            System.out.print(" ");
            pop();
        }
    }
    boolean isEmpty(){
        return top==-1;
    }
}
public class StackUsingArray {
    public static void main(String[] args) throws Exception {
        MyStack ms=new MyStack(3);
        ms.push(1);
        ms.push(2);
        ms.push(3);
//        ms.push(5);
//        ms.show();
        int k=ms.pop();
        System.out.printf("%d is deleted.",k);
        System.out.println();
        int m=ms.peek();
        System.out.printf("peek elemnt:%d",m);
        System.out.println();
        System.out.println(ms.isEmpty());
        ms.show();
    }
}
