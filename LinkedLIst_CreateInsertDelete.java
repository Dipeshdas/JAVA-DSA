package DSA;
class Node8{
    int data;
    Node8 next;
    Node8(int data){
        this.data=data;
    }
}
public class LinkedLIst_CreateInsertDelete {
    public static Node8 insert(Node8 head,int data,int pos){
        Node8 newNode=new Node8(data);
//        if(head==null){
//            head=newNode;
//            return head;
//        }
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node8 prev=head;
        for(int i=0;i<pos-1;i++){
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
        return head;
    }
    public static void traverse(Node8 head){
        Node8 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node8 delete(Node8 head,int pos){
        if(pos==0){
            head=head.next;
            return head;
        }
        Node8 prev=head;
        for(int i=0;i<pos-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node8 n1=new Node8(1);
        Node8 n2=new Node8(2);
        Node8 n3=new Node8(3);
        Node8 head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=null;
        Node8 k=insert(head,4,1);
        traverse(k);
        System.out.println();
        Node8 m=delete(k,1);
        traverse(m);
    }
}
