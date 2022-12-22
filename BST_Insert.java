package DSA;

import java.util.Scanner;

public class BST_Insert {
    //RECURSIVE
//    static BNode insert(BNode root,int key){
//
//        if(root==null){
//            return new BNode(key);
//        }
//        if(root.data>key){
//            root.left=insert(root.left,key);
//        }
//        else{
//            root.right=insert(root.right,key);
//        }
//        return root;
//    }
    //ITERATIVE
    static BNode insert(BNode root,int key){
        BNode newNode=new BNode(key);
        BNode parent=null;
        BNode cur=root;
        while(cur!=null){
            parent =  cur;
            if(key<cur.data){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
        if(parent == null) return newNode;
        if(key< parent.data)  parent.left=newNode;
        else {
             parent.right = newNode;
        }
        return root;
    }

    static void inorder(BNode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    static BNode create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data:");
        int data=sc.nextInt();
        if (data == -1) {
            return null;
        }
        BNode root=new BNode(data);
        System.out.println("Enter left for "+data);
        root.left=create();
        System.out.println("Enter right for "+data);
        root.right=create();
        return root;
    }
    public static void main(String[] args) {
        BNode m=create();
        BNode k=insert(m,50);
        inorder(k);
    }
}
