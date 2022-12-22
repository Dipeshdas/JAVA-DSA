package DSA;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
    }
}
public class LinkedList_DetectCycle {
    public static void traverse(Node1 head){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            System.out.print(" ");
            temp=temp.next;
        }

    }

    public static Node1 detectCycle(Node1 head){
        Node1 slow=head;
        Node1 fast=head;
        while(fast!=null || fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
    public static Node1 detectStartingCycleNode(Node1 head){
        Node1 meet=detectCycle(head);
        System.out.println("meeting point:"+meet.data);
        Node1 start=head;
        while(start!=meet){
            start=start.next;
            meet=meet.next;
        }
        return start;
    }
    public static Node1 removeCycle(Node1 head){
        Node1 ptr=detectCycle(head);
        ptr.next.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node1 n1=new Node1(1);
        Node1 n2=new Node1(2);
        Node1 n3=new Node1(3);
        Node1 n4=new Node1(4);
        Node1 n5=new Node1(5);
        Node1 n6=new Node1(6);
        Node1 head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n3;
        Node1 k=detectStartingCycleNode(head);
        System.out.println(k.data);
        Node1 h=removeCycle(head);
        traverse(h);
    }
}
