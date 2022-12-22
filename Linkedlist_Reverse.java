package DSA;

public class Linkedlist_Reverse {
//    public static Node8 reverse(Node8 head){
//        Node8 cur=head;
//        Node8 prev=null;
//        while(cur!=null){
//            Node8 temp=cur.next;
//            cur.next=prev;
//            prev=cur;
//            cur=temp;
//        }
//        return prev;
//    }
    public static void traverse(Node8 head){
        Node8 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node8 reverseRec(Node8 head){
        if(head==null || head.next==null){
            return head;
        }
        Node8 newHead=reverseRec(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        Node8 n1=new Node8(1);
        Node8 n2=new Node8(2);
        Node8 n3=new Node8(3);
        Node8 head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=null;
        //Node8 k=reverse(head);
        Node8 m=reverseRec(head);
        traverse(m);
    }
}
