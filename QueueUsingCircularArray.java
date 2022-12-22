package DSA;
class QCA{
    int a[];
    int n;
    int front=-1,rear=-1;
    public QCA(int n){
        this.n=n;
        a=new int[n];
    }
    void enQueue(int data){
        //to check Queue is Full or not
        if((rear+1)%n==front){
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%n;
        a[rear]=data;
    }
    int deQueue()throws Exception{
        if(front==-1){
            throw new Exception("Empty Queue!!");
        }
        int res=a[front];
        //if only one element present in Queue
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%n;
        }
        return res;
    }

    void show(){
        if(rear>=front){
            for(int i=front;i<=rear;i++){
                System.out.print(a[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
        else {
            //max size to last index
            for(int i=front;i<n;i++){
                System.out.print(a[i]);
                System.out.print(" ");
            }
            //0th index to rear
            for (int i = 0; i <= rear; i++) {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
    }


}
public class QueueUsingCircularArray {
    public static void main(String[] args)throws Exception {
        QCA Q=new QCA(3);
        Q.enQueue(1);
        Q.enQueue(2);
        Q.enQueue(3);
        Q.show();
        System.out.println(Q.deQueue());
        Q.show();
        Q.enQueue(12);
        Q.enQueue(13);
        Q.show();
        System.out.println(Q.deQueue());

    }
}
