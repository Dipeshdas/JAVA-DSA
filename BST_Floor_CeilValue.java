package DSA;

import java.util.Scanner;

public class BST_Floor_CeilValue {
    static int floor(BNode root,int key){
        //floor value means smaller than the key value but greater than the all value present in BST which are < key
        int ans=Integer.MAX_VALUE;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            if(root.data>key){
                root=root.left;
            }else{
                ans=root.data;
                root=root.right;
            }
        }
        return ans;
    }
    static int Ceil(BNode root,int key){
        //floor value means greater than the key value but smaller than the all value present in BST which are > key
        int ans=Integer.MIN_VALUE;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            if(root.data>key){
                ans=root.data;
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return ans;
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
        BNode k=create();
        System.out.println(floor(k,16));
        System.out.println(Ceil(k,16));

    }
}
