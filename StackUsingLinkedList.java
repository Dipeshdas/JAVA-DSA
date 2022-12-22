package DSA;
class Node3{
    int data;
    Node3 next;
    Node3(int data) {
        this.data=data;
    }
}
class MyStack1{
    Node3 head;
    int size;
    public MyStack1(){
        head=null;
        size=0;
    }
    void push(int data){
        Node3 temp=new Node3(data);
        temp.next=head;
        size++;
        head=temp;
    }
    int pop()throws Exception{
        if(head==null){
            throw new Exception("UnderFlow!!");
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }
    int peek()throws Exception{
        if(head==null){
            throw new Exception("Underflow");
        }
        return head.data;
    }
    boolean isEmpty(){
        return head==null;
    }
    int Size(){
        return size;
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) throws Exception{
        MyStack1 ms1=new MyStack1();
        ms1.push(1);
//        ms1.push(2);
//        ms1.push(3);
//        ms1.push(4);
        int k=ms1.pop();
        System.out.printf("%d element is popped.",k);
        System.out.println();
        int l=ms1.peek();
        System.out.printf("%d element is peeked.",l);
        System.out.println();
        System.out.println(ms1.isEmpty());
        int s=ms1.Size();
        System.out.println(s);
    }
}
