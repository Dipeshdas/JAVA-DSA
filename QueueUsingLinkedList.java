package DSA;
class Node4{
    int data;
    Node4 next;
    public Node4(int data){
        this.data=data;
    }
}
class Queue{
    Node4 front,rear;
     void enQueue(int data){
         Node4 NewNode=new Node4(data);
        if(front==null){
            front=rear=NewNode;
        }
        rear.next=NewNode;
        rear=NewNode;

    }
    int deQueue()throws Exception{
         if(front==null){
             throw new Exception("Queue is empty!!");
         }
         int res= front.data;
         front=front.next;
         return res;

    }
    void show(){
        Node4 temp=front;
         while(temp!=null){
             System.out.print(temp.data);
             System.out.print(" ");
             temp=temp.next;
         }
    }
}
public class QueueUsingLinkedList {
    public static void main(String[] args) throws Exception{
        Queue q=new Queue();
        q.enQueue(5);
        q.enQueue(4);
//        q.enQueue(3);
//        q.enQueue(2);
        q.show();
        System.out.println();
        int k=q.deQueue();
        System.out.println(k+" Element delete from Queue!!");
        int m=q.deQueue();
        System.out.println(m+" Element delete from Queue!!");
        int l=q.deQueue();
        q.show();

    }
}
