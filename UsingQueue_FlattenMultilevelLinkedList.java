package DSA;

import java.util.ArrayDeque;
import java.util.Queue;

class Node6{
    int data;
    Node6 next,down;
    Node6(int data) {
        this.data = data;
        next = down = null;
    }
}
public class UsingQueue_FlattenMultilevelLinkedList {
    public static void flattenList(Node6 head){
        Node6 cur=head;
        Queue<Node6> q=new ArrayDeque<>();

        while(cur!=null){
            //last node reached
            if(cur.next==null){
                cur.next=q.poll();
            }
            //if the cur node has a child
            if(cur.down!=null){
                q.add(cur.down);
            }
            cur=cur.next;
        }
    }
    public static void printlist(Node6 head){
        while(head!=null){
            System.out.print(head.data + " -> ");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void printOriginalList(Node6 head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        if(head.down!=null){
            System.out.print("(");
            printOriginalList(head.down);
            System.out.print(")");
        }
        printOriginalList(head.next);
    }
    public static void main(String[] args) {
        Node6 n1=new Node6(1);
        Node6 n2=new Node6(2);
        Node6 n3=new Node6(3);
        Node6 n4=new Node6(4);
        Node6 n5=new Node6(5);
        Node6 n6=new Node6(6);
        Node6 n7=new Node6(7);
        Node6 n8=new Node6(8);
        Node6 n9=new Node6(9);
        Node6 n10=new Node6(10);
        Node6 n11=new Node6(11);
        Node6 n12=new Node6(12);
        Node6 n13=new Node6(13);
        Node6 n14=new Node6(14);
        Node6 n15=new Node6(15);
        Node6 n16=new Node6(16);
        Node6 n17=new Node6(17);

        Node6 head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        n1.down=n6;
        n6.next=n7;
        n7.next=n8;
        n7.down=n11;
        n8.down=n12;
        n12.down=n15;

        n4.down=n9;
        n9.next=n10;
        n9.down=n13;
        n13.next=n14;
        n13.down=n16;
        n16.next=n17;
        printOriginalList(head);
        System.out.println();

        flattenList(head);
        printlist(head);
    }
}
