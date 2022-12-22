package DSA;
class Node2{
    int data;
    Node2 next;
    Node2 random;
    Node2(int data){
        this.data=data;
    }
}
public class LinkedList_Cloned {

    public static void traverse(Node2 head){
        Node2 temp=head;
        while(temp!=null){
            System.out.print("Data = "+temp.data+ ", Random = "+temp.random.data);
            System.out.println();
            temp=temp.next;
        }
    }
    public static Node2 duplicate(Node2 head){
        Node2 cur=head;
        while(cur!=null){
            Node2 temp=cur.next;
            cur.next=new Node2(cur.data);
            cur.next.next=temp;
            cur=temp;
        }
        cur=head;
        while(cur!=null){
            if(cur.next!=null){
                    cur.next.random=(cur.random!=null)?
                            cur.random.next:null;
            }
            cur=cur.next.next;
        }
        Node2 org=head;
        Node2 copy=head.next;
        Node2 temp=copy;
        while(org!=null){
            org.next=org.next.next;
            copy.next=(copy.next!=null)?
                    copy.next.next:copy.next;
            org=org.next;
            copy=copy.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node2 n1=new Node2(1);
        Node2 n2=new Node2(2);
        Node2 n3=new Node2(3);
        Node2 n4=new Node2(4);
        Node2 head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        n2.random=n1;
        n1.random=n3;
        n3.random=n2;
        n4.random=n3;
        traverse(head);
        Node2 k=duplicate(head);
        System.out.println();
       traverse(k);
    }
}
