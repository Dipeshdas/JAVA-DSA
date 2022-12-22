package DSA;

import java.util.Scanner;

class dlNode{
    int data;
    dlNode left;
    dlNode right;
    public dlNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinaryTree_convertToDLL {
    static dlNode prev=null;
    static dlNode head;
    static dlNode convertToDill(dlNode root){
        if(root==null){
            return null;
        }
        convertToDill(root.left);
        if(prev==null){
            head=root;
        }
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        convertToDill(root.right);
        return head;
    }
    static  dlNode create(){
        System.out.println("Enter data:");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        dlNode root=new dlNode(data);
        System.out.println("Enter left for "+ data);
        root.left=create();
        System.out.println("Enter right for "+ data);
        root.right=create();
        return root;
    }
    static void show(dlNode root){
        while(root!=null){
            System.out.println(root.data+" ");
            root=root.right;
        }
    }
    public static void main(String[] args) {
        dlNode k=create();
        dlNode m=convertToDill(k);
        show(m);


    }
}
