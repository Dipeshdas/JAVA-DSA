package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree_LeftView {
    static void printLeftViewUtil(BNode root,ArrayList l,int level){
        if(root==null) return;
        if(l.get(level)==null){
            l.set(level,root);
        }
        printLeftViewUtil(root.left,l,level+1);
        printLeftViewUtil(root.right,l,level+1);
    }
    static void printLeftView(BNode root){
        ArrayList<BNode>l=new ArrayList<>();
        printLeftViewUtil(root,l,0);
        for (BNode cur:l) {
            System.out.print(cur.data+" ");
        }
    }
    static BNode create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data:");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        BNode root=new BNode(data);
        System.out.println("Enter left for "+ data);
        root.left=create();
        System.out.println("Enter right for "+data);
        root.right=create();
        return root;
    }
    public static void main(String[] args) {
        BNode k=create();
        printLeftView(k);

    }
}
