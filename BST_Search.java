package DSA;

import java.util.Scanner;

public class BST_Search {
    static boolean search(BNode root,int x){
        if(root==null) return false;
        if(root.data==x) return true;
        if(root.data>x) return search(root.left,x);
        else return search(root.right,x);
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
        System.out.println(search(m,25));

    }
}
