package DSA;
class QueueA{
    int[] a;
    int rear;
    int capacity;
    public QueueA(int n){
        capacity=n;
        a=new int[n];
        rear=-1;
    }
    void enQueue(int data)throws Exception{
        if(rear==capacity-1){
            throw new Exception("Queue is full!!");
        }
        rear++;
        a[rear]=data;
    }
    int deQueue()throws Exception{
        if(rear==-1){
            throw new Exception("Queue is empty!!");
        }
        int res=a[0];
        for(int i=0;i<rear;i++){
            a[i]=a[i+1];
        }
        rear--;
        return res;
    }
    int getFront()throws Exception{
        if(rear==-1){
            throw new Exception("Queue is empty!!");
        }
        return a[0];
    }
    void show(){
        for(int i=0;i<=rear;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
public class QueueUsingArray {
    public static void main(String[] args) throws Exception{
        QueueA q1=new QueueA(5);
        q1.enQueue(4);
        q1.enQueue(3);
        q1.enQueue(2);
        q1.enQueue(1);
        q1.show();
        System.out.println();
        System.out.println(q1.deQueue()+" is deleted from the queue!!");
        q1.show();
        q1.enQueue(8);
        q1.show();

    }
}
