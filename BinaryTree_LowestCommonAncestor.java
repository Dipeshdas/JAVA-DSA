package DSA;

import java.util.Scanner;

public class BinaryTree_LowestCommonAncestor {
    static BNode LCA(BNode root,int n1,int n2){
        if(root==null) return null;
        if(root.data==n1 || root.data==n2) return root;

        BNode left=LCA(root.left,n1,n2);
        BNode right=LCA(root.right,n1,n2);

        if(left ==null) return right;
        if(right ==null) return left;

        return root;

    }
    static BNode create(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter data:");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        BNode root=new BNode(data);
        System.out.println("Enter the left for "+ data);
        root.left=create();
        System.out.println("Enter the right for "+ data);
        root.right=create();
        return root;
    }
    public static void main(String[] args) {
        BNode k=create();
        System.out.println(LCA(k,7,3).data);

    }
}
