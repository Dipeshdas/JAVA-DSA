package DSA;

import java.util.Scanner;

public class BST_Delete {
    static BNode delete(BNode root,int key){
        if(root==null) return root;
        if(key<root.data){
            root.left=delete(root.left,key);
        }
        else if(key> root.data){
            root.right=delete(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.data=minValue(root.right);
            root.right=delete(root.right, root.data);

        }
        return root;
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
     static int  minValue(BNode root) {
        int minv=root.data;
        while(root.left!=null){
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }
    static void inorder(BNode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BNode k=create();
        BNode l=delete(k,80);
        inorder(l);

    }
}
