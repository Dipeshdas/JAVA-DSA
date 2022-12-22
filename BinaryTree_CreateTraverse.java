package DSA;

import java.util.Scanner;

class BNode{
    BNode left;
    BNode right;
    int data;
    public BNode(int data){
        this.data=data;
    }
}
public class BinaryTree_CreateTraverse {
    static Scanner sc=new Scanner(System.in);
    static BNode create(){
        System.out.println("Enter data:");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        BNode root=new BNode(data);
        System.out.println("Enter left for:"+data);
        root.left=create();
        System.out.println("Enter right for:"+data);
        root.right=create();
        return root;
    }
    static void inOrder(BNode root){
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(BNode root){
        if(root==null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(BNode root){
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        BNode k=create();
        inOrder(k);
        System.out.println();
        preOrder(k);
        System.out.println();
        postOrder(k);
    }
}
