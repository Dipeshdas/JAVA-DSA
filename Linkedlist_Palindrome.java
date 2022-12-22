package DSA;
class  Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;

    }
}
public class Linkedlist_Palindrome {
    public static void Traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static Node reverse(Node head){
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;

        }
        return prev;
    }
    public static boolean palindrome(Node head){
        if(head==null){
            return true;
        }
        Node mid=middle(head);
        Node last=reverse(mid);
        Node cur=head;
        while(last!=null){
            if(last.data!=cur.data){
                return false;
            }
            last=last.next;
            cur=cur.next;
        }
        return true;
    }
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        if(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node n1=new Node("A");
        Node n2=new Node("B");
        Node n3=new Node("A");
//        Node n4=new Node("B");
//        Node n5=new Node("C");
        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=null;
//        n4.next=n5;
//        n5.next=null;
        Traverse(head);
        boolean k=palindrome(head);
        System.out.println(k);


    }
}
