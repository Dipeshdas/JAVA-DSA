package DSA;

import java.util.Scanner;

public class BinaryTree_Height_Maximum_Size {
    static int size(BNode root){
        if(root==null){
            return 0;
            //return -1;// if The Height of binary tree with single node is taken as zero.
        }
        return size(root.left)+size(root.right)+1;
    }
    static int maximum(BNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }

    static int height(BNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    static Scanner sc=new Scanner(System .in);
    static BNode create(){
        System.out.println("Enter data:");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        BNode root=new BNode(data);
        System.out.println("Enter left for "+ data);
        root.left=create();
        System.out.println("Enter right for "+ data);
        root.right=create();
        return root;
    }
    public static void main(String[] args) {
        BNode k=create();
        System.out.println(height(k));
        System.out.println(size(k));
        System.out.println(maximum(k));

    }
}
