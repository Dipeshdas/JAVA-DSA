package DSA;

class Node5{
        int data;
        Node5 next,down;
        Node5(int data) {
            this.data = data;
            next = down = null;
        }
}
public class UsingLL_FlattenMultilevelLinkedList {
    public static void flatternList(Node5 head){
        if(head==null){
            return;
        }
        Node5 temp=null;
        //Find last node in first level linked list!!
        Node5 last=head;
        while(last.next!=null){
            last=last.next;
        }
        //one by one traverse through all nodes on first level until we reached last node;
        Node5 cur=head;
        while(cur!=null){
            //if cur node has a down
            if(cur.down!=null){
                //then append the child at the end of the current list
                last.next=cur.down;

                //and update the tail to new last node
                temp=cur.down;
                while(temp.next!=null){
                    temp=temp.next;
                }
                last=temp;
            }
            //change the current node
            cur=cur.next;
        }
    }
    public static void printOriginalList(Node5 head){
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
    public static void printlist(Node5 head){
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Node5 n1=new Node5(1);
        Node5 n2=new Node5(2);
        Node5 n3=new Node5(3);
        Node5 n4=new Node5(4);
        Node5 n5=new Node5(5);
        Node5 n6=new Node5(6);
        Node5 n7=new Node5(7);
        Node5 n8=new Node5(8);
        Node5 n9=new Node5(9);
        Node5 n10=new Node5(10);
        Node5 n11=new Node5(11);
        Node5 n12=new Node5(12);
        Node5 n13=new Node5(13);
        Node5 n14=new Node5(14);
        Node5 n15=new Node5(15);
        Node5 n16=new Node5(16);
        Node5 n17=new Node5(17);

        Node5 head=n1;
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

        flatternList(head);
        printlist(head);
    }
}
